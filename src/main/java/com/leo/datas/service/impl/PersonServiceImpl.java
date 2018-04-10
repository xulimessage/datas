package com.leo.datas.service.impl;

import com.leo.datas.dao.PersonDao;
import com.leo.datas.domain.Dictonary;
import com.leo.datas.domain.Person;
import com.leo.datas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person save(Person person) {
        Person save = personDao.save(person);
        return save;
    }

    @Cacheable(value = "Person_findById")
    @Override
    public Person findById(int id) {

        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Person> findAll() {

        return null;
    }
}
