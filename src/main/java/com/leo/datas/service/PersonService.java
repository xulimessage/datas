package com.leo.datas.service;

import com.leo.datas.domain.Person;

import java.util.List;
public interface PersonService {
    Person save(Person person);

    void saveList(List<Person> personList);

    Person findById(int id);

    Person update(Person person);

    void delete(int id);

    List<Person> findAll(int page,int size);




}
