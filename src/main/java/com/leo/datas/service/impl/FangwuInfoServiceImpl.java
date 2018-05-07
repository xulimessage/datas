package com.leo.datas.service.impl;

import com.leo.datas.dao.FangWuInfoDao;
import com.leo.datas.domain.FangWUInfo;
import com.leo.datas.service.FangwuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FangwuInfoServiceImpl implements FangwuInfoService{

    @Autowired
    private FangWuInfoDao fangWuInfoDao;


    @Override
    public void save(FangWUInfo fangWUInfo) {
        fangWuInfoDao.saveAndFlush(fangWUInfo);

    }
}
