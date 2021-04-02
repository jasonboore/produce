package com.manage.produce.dao;

import com.manage.produce.data.BudgetInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetInfoDao extends JpaRepository<BudgetInfo, Long> {
    public List<BudgetInfo> findByEngineerTime(Long engineerTime);
    public List<BudgetInfo> findByWorkUnit(String workUnit);
    public List<BudgetInfo> findByEngineerTimeAndWorkUnit(Long engineerTime, String workUnit);
}
