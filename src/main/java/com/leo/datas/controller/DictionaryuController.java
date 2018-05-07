package com.leo.datas.controller;

import com.leo.datas.Utils.GeneratorChar;
import com.leo.datas.domain.Dictonary;
import com.leo.datas.service.CharacterStatusService;
import com.leo.datas.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictionaryuController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${url_get}")
    private String url;




    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private CharacterStatusService characterStatusService;



    @GetMapping(value = "/getAll")
    public List<Dictonary> getAll() {
        List<Dictonary> all = dictionaryService.findAll();

        return all;

    }

    @GetMapping("get/{id}")
    public String get(@PathVariable int id) {
      return url +  dictionaryService.findById(id).get().getInterface_url()+","+ dictionaryService.findById(id).get().getAppid();

    }

    /*@GetMapping("get/{name}")
    public List<Dictonary> getByName(@PathVariable String name) {
        List<Dictonary> byName = dictionaryService.findByName(name);
        return byName;
    }*/

    @GetMapping("gene")
    public void charators() {
        characterStatusService.save(GeneratorChar.getChinese());


    }


}
