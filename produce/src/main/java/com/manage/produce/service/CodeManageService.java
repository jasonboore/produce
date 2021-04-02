package com.manage.produce.service;

import com.manage.produce.dao.CodeManageDao;
import com.manage.produce.data.CodeManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeManageService {
    @Autowired
    private CodeManageDao codeManageDao;

    public List<CodeManage> getInfo(){
        return codeManageDao.findAll();
    }

    public void save(CodeManage codeManage) {
        codeManageDao.save(codeManage);
    }
}
