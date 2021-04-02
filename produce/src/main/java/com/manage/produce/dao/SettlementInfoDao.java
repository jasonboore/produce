package com.manage.produce.dao;

import com.manage.produce.data.SettlementInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettlementInfoDao extends JpaRepository<SettlementInfo, Long> {
    public List<SettlementInfo> findByEngineerTime(Long engineerTime);
    public List<SettlementInfo> findByWorkUnit(String workUnit);
    public List<SettlementInfo> findByEngineerTimeAndWorkUnit(Long engineerTime, String workUnit);
}
