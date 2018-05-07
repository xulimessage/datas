package com.leo.datas.controller;

import com.leo.datas.Utils.Jason2Sql;
import com.leo.datas.Utils.TestApi;
import com.leo.datas.bean.ZuRquestPara;
import com.leo.datas.dao.CharactorStatusDao;
import com.leo.datas.domain.CharactorStatus;
import com.leo.datas.domain.Person;
import com.leo.datas.service.CharacterStatusService;
import com.leo.datas.service.DictionaryService;
import com.leo.datas.service.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GonganController {
    @Value("${url_get}")
    private String url_get;

    @Value("${pageSize}")
    private String pageSize;

    @Value("${pageNum}")
    private String pageNum;

    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private CharacterStatusService characterStatusService;

    @Autowired
    private ZuRquestPara zuRquestPara;

    @Autowired
    private PersonService personService;

    @Autowired
    private CharactorStatusDao charactorStatusDao;


    @Cacheable(value = "getName")
    @GetMapping("/getName")
    public List<ZuRquestPara> getName() throws InterruptedException {

        return getGonganRquestParas(zuRquestPara, url_get, dictionaryService, characterStatusService, 1, 10);


    }


    @GetMapping("/gongan/getGongan")
    public String getGongan() throws InterruptedException {
        int total = 0;


        List<ZuRquestPara> zuRquestParasTotal = getGonganRquestParas(zuRquestPara, url_get, dictionaryService, characterStatusService, 1, 1);
        zuRquestParasTotal = zuRquestParasTotal.stream().filter(z -> z.getXm() != null).collect(Collectors.toList());
        for (int i = 0; i < zuRquestParasTotal.size(); i++) {
            TestApi testApi = new TestApi();
            String s = testApi.doPostGetCount(zuRquestParasTotal.get(i));
            total = Jason2Sql.getTotal(s);
            if (total != 0) {

                for (int j = 0; j < total / Integer.valueOf(pageSize.trim()) + 1; j++) {
                    TestApi testApiEach = new TestApi();
                    ZuRquestPara gonganRquestParasByFenye = getGonganRquestParasByFenye(zuRquestParasTotal.get(i), url_get, dictionaryService, zuRquestParasTotal.get(i).getXm(), zuRquestParasTotal.get(i).isDone(), j+1, Integer.valueOf(pageSize));
                    String s1 = testApiEach.doPostGetCount(gonganRquestParasByFenye);
                    List<Person> list = (List<Person>) Jason2Sql.buildInsertSqlFromJSON(s1, Person.class);
                    for (Person p : list) {
                        personService.save(p);
                    }

                }


            }
            charactorStatusDao.SetGonganXing(true, zuRquestParasTotal.get(i).getXm());


        }



        return "doing";
    }



    @GetMapping("save")
    public String save() {
        Person p1 = new Person();
        p1.setXM("leo");
        Person p2 = new Person();
        p2.setXM("xuli");
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        try {
            personService.saveList(people);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "done@!";
    }


    public List<ZuRquestPara> getGonganRquestParas(ZuRquestPara gonganRquestPara, String url_get, DictionaryService dictionaryService, CharacterStatusService characterStatusService, int pageNum, int pageSize) {
        gonganRquestPara.setUrl(url_get + dictionaryService.findById(12).get().getInterface_url());
        gonganRquestPara.setAppid(dictionaryService.findById(12).get().getAppid());
        gonganRquestPara.setPageSize(String.valueOf(pageSize));
        gonganRquestPara.setPageN(String.valueOf(pageNum));

        List<CharactorStatus> all = characterStatusService.findAll();
        List<ZuRquestPara> gonganRquestParasList = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).isChanghurenkouIsDone() == false) {
                ZuRquestPara gonganRquestParaCopy = new ZuRquestPara();
                BeanUtils.copyProperties(gonganRquestPara, gonganRquestParaCopy);
                gonganRquestPara.setXm(all.get(i).getContent());
                gonganRquestPara.setDone(false);
                gonganRquestPara.setType("1");
                gonganRquestParasList.add(gonganRquestParaCopy);
            }
//            characterStatusService.SetGonganXing(true,all.get(i).getId());
//            xiugaiStatus.SetGonganXing(true,all.get(i).getId());


        }

        String collect = gonganRquestParasList.stream().map(p -> p.toString()).collect(Collectors.joining());
       /* String s = testApi.doPostGetCount(gonganRquestPara);
        int total = Jason2Sql.getTotal(s);*/

        return gonganRquestParasList;
    }


    public ZuRquestPara getGonganRquestParasByFenye(ZuRquestPara gonganRquestPara, String url_get, DictionaryService dictionaryService, String xm, Boolean isDone, int pageNum, int pageSize) {
        gonganRquestPara.setUrl(url_get + dictionaryService.findById(12).get().getInterface_url());
        gonganRquestPara.setAppid(dictionaryService.findById(12).get().getAppid());
        gonganRquestPara.setPageSize(String.valueOf(pageSize));
        gonganRquestPara.setPageN(String.valueOf(pageNum));


        gonganRquestPara.setXm(xm);
        gonganRquestPara.setDone(isDone);
        gonganRquestPara.setType("1");


        return gonganRquestPara;
    }

}
