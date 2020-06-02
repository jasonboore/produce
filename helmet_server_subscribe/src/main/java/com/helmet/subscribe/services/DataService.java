package com.helmet.subscribe.services;

import com.helmet.subscribe.dao.DataDao;
import com.helmet.subscribe.data.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataDao dataDao;

    public DataService(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    public void saveData(Data bookCollect) {
        dataDao.save(bookCollect);
    }

}
