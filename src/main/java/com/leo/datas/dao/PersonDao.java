package com.leo.datas.dao;

import com.leo.datas.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Integer> {
}
