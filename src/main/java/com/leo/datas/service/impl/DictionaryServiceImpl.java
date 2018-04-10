package com.leo.datas.service.impl;

import com.leo.datas.dao.DictionaryDao;
import com.leo.datas.domain.Dictonary;
import com.leo.datas.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private DictionaryDao dictionaryDao;

    @Cacheable(value = "Dictonary_findById")
    @Override
    public Optional<Dictonary> findById(Integer id) {

        Optional<Dictonary> one = dictionaryDao.findById(id);
        System.out.println("没有走缓存!");
        return one;
    }

    @Cacheable(value = "Dictonary_findByName")
    @Override
    public List<Dictonary> findByName(String name) {
        //创建查询条件



        return null;

    }

    @Cacheable(value = "findAll")
    @Override
    public List<Dictonary> findAll() {
        List<Dictonary> all = dictionaryDao.findAll();
        System.out.println("没有走缓存!");
        return all;
    }
}
