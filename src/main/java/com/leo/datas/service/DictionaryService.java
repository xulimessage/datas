package com.leo.datas.service;

import com.leo.datas.domain.Dictonary;

import java.util.List;
import java.util.Optional;

public interface DictionaryService {
    Optional<Dictonary> findById(Integer id);

    List<Dictonary> findByName(String name);

    List<Dictonary> findAll();


}
