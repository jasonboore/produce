package com.manage.produce.service;

import com.manage.produce.dao.DepartmentManageDao;
import com.manage.produce.data.DepartmentManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManageService {
    @Autowired
    private DepartmentManageDao departmentManageDao;

    public List<DepartmentManagement> getInfo(){
        return departmentManageDao.findAll();
    }

    public void saveData(DepartmentManagement departmentManagement){
        departmentManageDao.save(departmentManagement);
    }

    public void deleteData(Long id){
        departmentManageDao.deleteById(id);
    }
}
