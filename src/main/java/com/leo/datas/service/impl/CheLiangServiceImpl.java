package com.leo.datas.service.impl;

import com.leo.datas.dao.CheLiangDao;
import com.leo.datas.domain.CheLiangInfo;
import com.leo.datas.service.CheLiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheLiangServiceImpl implements CheLiangService {
    @Autowired
    private CheLiangDao cheLiangDao;

    @Override
    public void save(CheLiangInfo cheLiangInfo) {
        cheLiangDao.save(cheLiangInfo);

    }
}
