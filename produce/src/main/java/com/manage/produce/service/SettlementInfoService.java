package com.manage.produce.service;

import com.manage.produce.dao.SettlementInfoDao;
import com.manage.produce.data.SettlementInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlementInfoService {
    @Autowired
    private SettlementInfoDao settlementInfoDao;

    public List<SettlementInfo> getInfo(Long engineerTime, String workUnit){
        if(engineerTime == 0 && workUnit.equals("全部")) {
            return settlementInfoDao.findAll();
        }else if(engineerTime == 0) {
            return settlementInfoDao.findByWorkUnit(workUnit);
        }else if(workUnit.equals("全部")) {
            return settlementInfoDao.findByEngineerTime(engineerTime);
        }
        return settlementInfoDao.findByEngineerTimeAndWorkUnit(engineerTime, workUnit);
    }

    public void saveData(SettlementInfo settlementInfo){
        settlementInfoDao.save(settlementInfo);
    }

    public void deleteData(Long id){
        settlementInfoDao.deleteById(id);
    }
}
