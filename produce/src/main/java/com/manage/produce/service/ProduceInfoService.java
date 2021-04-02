package com.manage.produce.service;

import com.manage.produce.dao.ProduceInfoDao;
import com.manage.produce.data.ProduceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceInfoService {
    @Autowired
    private ProduceInfoDao produceInfoDao;

    public List<ProduceInfo> getInfo(String workUnit){
        if(workUnit.equals("全部")) {
            return produceInfoDao.findAll();
        }
        return produceInfoDao.findByWorkUnit(workUnit);
    }

    public void saveData(ProduceInfo produceInfo){
        produceInfoDao.save(produceInfo);
    }

    public void deleteData(Long id){
        produceInfoDao.deleteById(id);
    }
}
