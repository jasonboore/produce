package com.manage.produce.service;

import com.manage.produce.dao.LoginLogDao;
import com.manage.produce.data.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogService {
    @Autowired
    private LoginLogDao loginLogDao;
    public List<LoginLog> getInfo(){
        return loginLogDao.findAll();
    }
}
