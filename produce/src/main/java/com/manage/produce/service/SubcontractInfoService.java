package com.manage.produce.service;

import com.manage.produce.dao.SubcontractInfoDao;
import com.manage.produce.data.SubcontractInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcontractInfoService {
    @Autowired
    private SubcontractInfoDao subcontractInfoDao;

    public List<SubcontractInfo> getInfo(Long engineerTime, String workUnit){
        if(engineerTime == 0 && workUnit.equals("全部")) {
            return subcontractInfoDao.findAll();
        }else if(engineerTime == 0) {
            return subcontractInfoDao.findByWorkUnit(workUnit);
        }else if(workUnit.equals("全部")) {
            return subcontractInfoDao.findByEngineerTime(engineerTime);
        }
        return subcontractInfoDao.findByEngineerTimeAndWorkUnit(engineerTime, workUnit);
    }

    public void saveData(SubcontractInfo subcontractInfo){
        subcontractInfoDao.save(subcontractInfo);
    }

    public void deleteData(Long id){
        subcontractInfoDao.deleteById(id);
    }
}
