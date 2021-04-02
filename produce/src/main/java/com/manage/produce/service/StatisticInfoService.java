package com.manage.produce.service;

import com.manage.produce.dao.StatisticInfoDao;
import com.manage.produce.data.StatisticInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticInfoService {
    @Autowired
    private StatisticInfoDao statisticInfoDao;

    public List<StatisticInfo> getInfo(String workUnit){
        if(workUnit.equals("全部")) {
            return statisticInfoDao.findAll();
        }
        return statisticInfoDao.findByWorkUnit(workUnit);
    }

    public void saveData(StatisticInfo statisticInfo){
        statisticInfoDao.save(statisticInfo);
    }

    public void deleteData(Long id){
        statisticInfoDao.deleteById(id);
    }
}
