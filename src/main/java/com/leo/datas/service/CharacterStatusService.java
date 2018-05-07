package com.leo.datas.service;

import com.leo.datas.domain.CharactorStatus;
import com.leo.datas.domain.Person;

import java.util.List;

public interface CharacterStatusService {
    void save(List<CharactorStatus> charactorStatus);

    CharactorStatus update(CharactorStatus charactorStatus);

    List<CharactorStatus> findAll();
}
