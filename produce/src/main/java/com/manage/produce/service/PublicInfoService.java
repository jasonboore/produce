package com.manage.produce.service;

import com.manage.produce.dao.PublicInfoDao;
import com.manage.produce.data.PublicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class PublicInfoService {
    @Autowired
    private PublicInfoDao publicInfoDao;

    public List<PublicInfo> getInfo(Long workYear, String workCompany){
        if(workYear == 0 && workCompany.equals("全部")) {
            return publicInfoDao.findAll();
        }else if(workYear == 0) {
            return publicInfoDao.findByWorkCompany(workCompany);
        }else if(workCompany.equals("全部")) {
            return publicInfoDao.findByWorkYear(workYear);
        }
        return publicInfoDao.findByWorkYearAndWorkCompany(workYear, workCompany);
    }

    public void saveData(PublicInfo publicInfo){
        publicInfoDao.save(publicInfo);
    }

    public void deleteData(Long id){
        publicInfoDao.deleteById(id);
    }
}
