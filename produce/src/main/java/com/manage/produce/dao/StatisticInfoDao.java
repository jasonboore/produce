package com.manage.produce.dao;

import com.manage.produce.data.StatisticInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticInfoDao extends JpaRepository<StatisticInfo, Long> {
    public List<StatisticInfo> findByWorkUnit(String workUnit);
}
