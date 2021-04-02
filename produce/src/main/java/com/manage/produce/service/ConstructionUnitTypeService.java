package com.manage.produce.service;

import com.manage.produce.dao.ConstructionUnitTypeDao;
import com.manage.produce.data.ConstructionUnitType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstructionUnitTypeService {
    @Autowired
    private ConstructionUnitTypeDao constructionUnitTypeDao;

    public List<ConstructionUnitType> getInfo(){
        return constructionUnitTypeDao.findAll();
    }

    public void save(ConstructionUnitType constructionUnitType) {
        constructionUnitTypeDao.save(constructionUnitType);
    }
}
