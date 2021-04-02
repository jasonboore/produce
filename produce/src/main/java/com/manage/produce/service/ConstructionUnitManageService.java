package com.manage.produce.service;

import com.manage.produce.dao.ConstructionUnitManageDao;
import com.manage.produce.data.ConstructionUnitManage;
import com.manage.produce.data.ConstructionUnitType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstructionUnitManageService {
    @Autowired
    private ConstructionUnitManageDao constructionUnitManageDao;

    public List<ConstructionUnitManage> getInfo(String unitType, String unitName){
        if(unitType.equals("全部")) {
            if(unitName.equals("%%")) {
                return constructionUnitManageDao.findAll();
            }else {
                return constructionUnitManageDao.findByUnitNameLike(unitName);
            }
        }else {
            if(unitName.equals("%%")) {
                return constructionUnitManageDao.findByUnitType(unitType);
            }else {
                return constructionUnitManageDao.findByUnitTypeAndUnitNameLike(unitType, unitName);
            }
        }
    }

    public void save(ConstructionUnitManage constructionUnitManage) {
        constructionUnitManageDao.save(constructionUnitManage);
    }

    public void delete(Long pid) {
        constructionUnitManageDao.deleteById(pid);
    }
}
