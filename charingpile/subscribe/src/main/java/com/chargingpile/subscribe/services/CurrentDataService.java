package com.chargingpile.subscribe.services;

import com.chargingpile.subscribe.dao.CurrentDataDao;
import com.chargingpile.subscribe.data.CurrentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentDataService {
    @Autowired
    private CurrentDataDao currentDataDao;

    public CurrentDataService(CurrentDataDao currentDataDao) {
        this.currentDataDao = currentDataDao;
    }

    public void saveCurrentData(CurrentData currentData) {
        currentDataDao.save(currentData);
    }
}
