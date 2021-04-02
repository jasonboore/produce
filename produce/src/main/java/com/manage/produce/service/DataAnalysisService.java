package com.manage.produce.service;

import com.manage.produce.dao.DataAnalysisDao;
import com.manage.produce.data.DataAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAnalysisService {
    @Autowired
    private DataAnalysisDao dataAnalysisDao;

    public List<DataAnalysis> getInfo(Long engineerTime){
        if(engineerTime == 0) {
            return dataAnalysisDao.findAll();
        }
        return dataAnalysisDao.findByEngineerTime(engineerTime);
    }
}
