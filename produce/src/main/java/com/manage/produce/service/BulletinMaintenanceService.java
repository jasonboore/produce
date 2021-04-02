package com.manage.produce.service;

import com.manage.produce.dao.BulletinMaintenanceDao;
import com.manage.produce.data.BulletinMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BulletinMaintenanceService {
    @Autowired
    private BulletinMaintenanceDao bulletinMaintenanceDao;

    public List<BulletinMaintenance> getAllInfo(){
        return bulletinMaintenanceDao.findAll();
    }

    public void save(BulletinMaintenance bulletinMaintenance) {
        bulletinMaintenanceDao.save(bulletinMaintenance);
    }

    public BulletinMaintenance getByPid(Long pid) {
        BulletinMaintenance bulletinMaintenance = new BulletinMaintenance();
        try{
            bulletinMaintenance = bulletinMaintenanceDao.findByPid(pid);
            bulletinMaintenance.setReadTime(bulletinMaintenance.getReadTime() + 1);
            this.save(bulletinMaintenance);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return bulletinMaintenance;
    }

    public void deleteById(Long pid) {
        bulletinMaintenanceDao.deleteById(pid);
    }
}
