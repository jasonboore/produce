package com.manage.produce.dao;

import com.manage.produce.data.SubcontractInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcontractInfoDao extends JpaRepository<SubcontractInfo, Long> {
    public List<SubcontractInfo> findByEngineerTime(Long engineerTime);
    public List<SubcontractInfo> findByWorkUnit(String workUnit);
    public List<SubcontractInfo> findByEngineerTimeAndWorkUnit(Long engineerTime, String workUnit);
}
