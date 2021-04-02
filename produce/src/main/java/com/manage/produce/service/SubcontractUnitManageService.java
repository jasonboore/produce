package com.manage.produce.service;

import com.manage.produce.dao.SubcontractUnitManageDao;
import com.manage.produce.data.SubcontractUnitManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubcontractUnitManageService {
    @Autowired
    private SubcontractUnitManageDao subcontractUnitManageDao;

    public List<SubcontractUnitManage> getInfo(String unitName){
        if(unitName.equals("%%")) {
            return subcontractUnitManageDao.findAll();
        }
        return subcontractUnitManageDao.findByUnitNameLike(unitName);
    }

    public void save(SubcontractUnitManage subcontractUnitManage) {
        subcontractUnitManageDao.save(subcontractUnitManage);
    }

    public void delete(Long pid) {
        subcontractUnitManageDao.deleteById(pid);
    }
}
