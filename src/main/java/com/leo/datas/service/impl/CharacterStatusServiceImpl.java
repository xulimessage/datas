package com.leo.datas.service.impl;

import com.leo.datas.dao.CharactorStatusDao;
import com.leo.datas.domain.CharactorStatus;
import com.leo.datas.service.CharacterStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CharacterStatusServiceImpl implements CharacterStatusService {
    @Autowired
    private CharactorStatusDao charactorStatusDao;


    @Override
    public void save(List<CharactorStatus> charactorStatus) {

        charactorStatusDao.saveAll(charactorStatus);

    }
}
