package com.manage.produce.dao;

import com.manage.produce.data.ContractInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractInfoDao extends JpaRepository<ContractInfo, Long> {
    public List<ContractInfo> findByEngineerTime(Long engineerTime);
    public List<ContractInfo> findByWorkUnit(String workUnit);
    public List<ContractInfo> findByEngineerTimeAndWorkUnit(Long engineerTime, String workUnit);
}
