package com.manage.produce.service;

import com.manage.produce.dao.TimeAnalysisDao;
import com.manage.produce.data.TimeAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeAnalysisService {
    @Autowired
    private TimeAnalysisDao timeAnalysisDao;

    public List<TimeAnalysis> getInfo(Long engineerTime){
       if(engineerTime == 0) {
           return timeAnalysisDao.findAll();
       }
       return timeAnalysisDao.findByEngineerTime(engineerTime);
    }
}
