package com.manage.produce.service;

import com.manage.produce.dao.CostInfoDao;
import com.manage.produce.data.CostInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostInfoService {
    @Autowired
    private CostInfoDao costInfoDao;

    public List<CostInfo> getInfo(String workUnit){
        if(workUnit.equals("全部")) {
            return costInfoDao.findAll();
        }
        return costInfoDao.findByWorkUnit(workUnit);
    }

    public void saveData(CostInfo costInfo){
        costInfoDao.save(costInfo);
    }

    public void deleteData(Long id){
        costInfoDao.deleteById(id);
    }
}
