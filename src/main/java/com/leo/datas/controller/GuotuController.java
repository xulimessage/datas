package com.leo.datas.controller;

import com.leo.datas.Utils.Jason2Sql;
import com.leo.datas.Utils.PageUtil;
import com.leo.datas.Utils.TestApi;
import com.leo.datas.bean.ZuRquestPara;
import com.leo.datas.dao.GmsfzhmDao;
import com.leo.datas.domain.FangWUInfo;
import com.leo.datas.domain.Gmsfzh;
import com.leo.datas.service.DictionaryService;
import com.leo.datas.service.FangwuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuotuController {

    @Value("${url_get}")
    private String url_get;

    @Value("${people_pageSize}")
    private String pageSize;

    @Value("${people_pageNum}")
    private String pageNum;

    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private ZuRquestPara zuRquestPara;

    @Autowired
    private GmsfzhmDao gmsfzhmDao;

    @Autowired
    private FangwuInfoService fangwuInfoService;


    @GetMapping("/guotu/getfangwu")
    public String getfangwu() {
        return url_get + dictionaryService.findById(255).get().getInterface_url() + "," + dictionaryService.findById(255).get().getAppid();
    }


    @GetMapping("/guotu/xunhuan")
    public String xunhuan() throws InterruptedException {

        Page<Gmsfzh> all = gmsfzhmDao.findAll(PageUtil.getPageRequest(Integer.valueOf(pageNum), Integer.valueOf(pageSize)));
        int totalPages = all.getTotalPages();

        zuRquestPara.setUrl(url_get + dictionaryService.findById(156).get().getInterface_url());
        zuRquestPara.setAppid(dictionaryService.findById(156).get().getAppid());
//        System.out.println(zuRquestPara.toString());
//        zuRquestPara.setPageSize("10");
//        zuRquestPara.setPageN("1");

        int pageNumP = Integer.parseInt(pageNum);
        while (totalPages-- != 0) {
            Page<Gmsfzh> eachpage = gmsfzhmDao.findAll(PageUtil.getPageRequest(pageNumP++, Integer.valueOf(pageSize)));
            for (int i = 0; i < eachpage.getContent().size(); i++) {
                List<Gmsfzh> eachpageSFZH = eachpage.getContent();
                // List<ZuRquestPara> zuRquestParasList = new ArrayList<>();
                if (eachpageSFZH.get(i).isFangwuxinxi_is_done() == false) {
                    zuRquestPara.setGmsfhm(eachpageSFZH.get(i).getSFZHM());
                    //zuRquestPara.setGmsfhm("330621198804256421");
                    // zuRquestParasList.add(zuRquestPara);


                    TestApi testApi = new TestApi();
                    String s = testApi.doPostGetCount(zuRquestPara);
                    List<FangWUInfo> list = Jason2Sql.buildInsertSqlFromJSON(s, FangWUInfo.class);
                    list.stream().map(p -> p.toString()).forEach(System.out::println);
                    System.out.println("第" + (pageNumP - 1) + "页," + "第" + i + "条");
                    eachpageSFZH.get(i).setFangwuxinxi_is_done(true);

                    for (int k = 0; k < list.size(); k++) {
                        list.get(k).setSfzhm(eachpageSFZH.get(i).getSFZHM());
                        fangwuInfoService.save(list.get(k));
                        System.out.println("保存了" + list.get(k).toString());
                    }

                    gmsfzhmDao.SetFangwuxinxiStatus(true, eachpageSFZH.get(i).getId());



                }


            }

        }

        return zuRquestPara.toString();
    }


}


