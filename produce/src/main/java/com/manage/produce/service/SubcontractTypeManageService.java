package com.manage.produce.service;

import com.manage.produce.dao.SubcontractTypeManageDao;
import com.manage.produce.data.SubcontractTypeManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcontractTypeManageService {
    @Autowired
    private SubcontractTypeManageDao subcontractTypeManageDao;

    public List<SubcontractTypeManage> getInfo(){
        return subcontractTypeManageDao.findAll();
    }

    public void save(SubcontractTypeManage subcontractTypeManage) {
        subcontractTypeManageDao.save(subcontractTypeManage);
    }
}
