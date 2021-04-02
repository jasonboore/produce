package com.manage.produce.service;

import com.manage.produce.dao.ContractInfoDao;
import com.manage.produce.data.ContractInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractInfoService {

    @Autowired
    private ContractInfoDao contractInfoDao;

    public List<ContractInfo> getInfo(Long engineerTime, String workUnit){
        if(engineerTime == 0 && workUnit.equals("全部")) {
            return contractInfoDao.findAll();
        }else if(engineerTime == 0) {
            return contractInfoDao.findByWorkUnit(workUnit);
        }else if(workUnit.equals("全部")) {
            return contractInfoDao.findByEngineerTime(engineerTime);
        }
        return contractInfoDao.findByEngineerTimeAndWorkUnit(engineerTime, workUnit);
    }

    public void saveData(ContractInfo contractInfo){
        contractInfoDao.save(contractInfo);
    }

    public void deleteData(Long id){
        contractInfoDao.deleteById(id);
    }
}
