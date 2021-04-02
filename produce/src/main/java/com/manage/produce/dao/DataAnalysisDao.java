package com.manage.produce.dao;

import com.manage.produce.data.DataAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataAnalysisDao extends JpaRepository<DataAnalysis, Long> {
    List<DataAnalysis> findByEngineerTime(Long engineerTime);
}
