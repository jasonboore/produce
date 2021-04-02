package com.manage.produce.service;

import com.manage.produce.dao.OprationLogDao;
import com.manage.produce.data.OprationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OprationLogService {
    @Autowired
    private OprationLogDao oprationLogDao;

    public List<OprationLog> getInfo(){
        return oprationLogDao.findAll();
    }
}
