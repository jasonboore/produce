package com.manage.produce.service;

import com.manage.produce.dao.PerformanceManageDao;
import com.manage.produce.data.PerformanceManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceManageService {
    @Autowired
    private PerformanceManageDao performanceManageDao;

    public List<PerformanceManage> getInfo(){
        return performanceManageDao.findAll();
    }

    public void save(PerformanceManage performanceManage) {
        performanceManageDao.save(performanceManage);
    }
}
