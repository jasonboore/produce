package com.manage.produce.dao;

import com.manage.produce.data.TimeAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeAnalysisDao extends JpaRepository<TimeAnalysis, Long> {
    List<TimeAnalysis> findByEngineerTime(Long engineerTime);
}
