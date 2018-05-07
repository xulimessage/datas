package com.leo.datas.dao;

import com.leo.datas.domain.Gmsfzh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface GmsfzhmDao extends JpaRepository<Gmsfzh, Integer> {


    @Modifying
    @Transactional
    @Query("update Gmsfzh u set u.fangwuxinxi_is_done = ?1 where u.id = ?2")
    int SetFangwuxinxiStatus(Boolean staus, int id);

//    @Modifying
//    @Query("update Gmsfzh u set u.cheliangxinxi_is_done = ?1 ")
//    int setFixedFirstnameFor(String firstname, String lastname);


}
