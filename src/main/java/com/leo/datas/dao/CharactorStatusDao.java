package com.leo.datas.dao;

import com.leo.datas.domain.CharactorStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CharactorStatusDao extends JpaRepository<CharactorStatus, Integer> {

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "UPDATE CharactorStatus c SET c.changhurenkouIsDone = ?1 WHERE c.content = ?2")
    int SetGonganXing(Boolean staus, String content);
}
