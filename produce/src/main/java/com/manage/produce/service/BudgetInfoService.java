package com.manage.produce.service;

import com.manage.produce.dao.BudgetInfoDao;
import com.manage.produce.data.BudgetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetInfoService {
    @Autowired
    private BudgetInfoDao budgetInfoDao;

    public List<BudgetInfo> getInfo(Long engineerTime, String workUnit){
        if(engineerTime == 0 && workUnit.equals("全部")) {
            return budgetInfoDao.findAll();
        }else if(engineerTime == 0) {
            return budgetInfoDao.findByWorkUnit(workUnit);
        }else if(workUnit.equals("全部")) {
            return budgetInfoDao.findByEngineerTime(engineerTime);
        }
        return budgetInfoDao.findByEngineerTimeAndWorkUnit(engineerTime, workUnit);
    }

    public void saveData(BudgetInfo budgetInfo){
        budgetInfoDao.save(budgetInfo);
    }

    public void deleteData(Long id){
        budgetInfoDao.deleteById(id);
    }
}
