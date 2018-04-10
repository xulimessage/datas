package com.leo.datas.service;

import com.leo.datas.domain.Dictonary;
import com.leo.datas.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Person save(Person person);

    Person findById(int id);

    Person update(Person person);

    void delete(int id);

    List<Person> findAll();




}
