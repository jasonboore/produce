package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.BulletinMaintenance;
import com.manage.produce.service.BulletinMaintenanceService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/bulletinmaintenance")
public class BulletinMaintenanceController {
    @Autowired
    private BulletinMaintenanceService bulletinMaintenanceService;

    @GetMapping("/getall")
    public List<BulletinMaintenance> getAllInfo(){
        return bulletinMaintenanceService.getAllInfo();
    }

    @GetMapping("/getcontent/{id}")
    public BulletinMaintenance getByPid(@PathVariable Long id){
        return bulletinMaintenanceService.getByPid(id);
    }
    @PostMapping("/save")
    public JSONObject saveData(@RequestBody BulletinMaintenance bulletinMaintenance){
        bulletinMaintenanceService.save(bulletinMaintenance);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        bulletinMaintenanceService.deleteById(id);
        return Constants.SUCCESS;
    }
}
