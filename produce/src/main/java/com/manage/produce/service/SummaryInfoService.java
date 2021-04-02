package com.manage.produce.service;

import com.manage.produce.dao.SummaryInfoDao;
import com.manage.produce.data.SummaryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryInfoService {
    @Autowired
    private SummaryInfoDao summaryInfoDao;

    public List<SummaryInfo> getInfo(String isFin, String workUnit){
        if(isFin.equals("全部") && workUnit.equals("全部")) {
            return summaryInfoDao.findAll();
        }else if(isFin.equals("全部")) {
            return summaryInfoDao.findByWorkUnit(workUnit);
        }else if(workUnit.equals("全部")) {
            return summaryInfoDao.findByIsFin(isFin);
        }
        return summaryInfoDao.findByWorkUnitAndIsFin(workUnit, isFin);
    }
}
