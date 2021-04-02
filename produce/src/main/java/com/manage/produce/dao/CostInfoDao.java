package com.manage.produce.dao;

import com.manage.produce.data.CostInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostInfoDao extends JpaRepository<CostInfo, Long> {
    public List<CostInfo> findByWorkUnit(String workUnit);
}
