package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.PerformanceManage;
import com.manage.produce.service.PerformanceManageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/performancemanage")
public class PerformanceManageController {
    @Autowired
    private PerformanceManageService performanceManageService;

    @GetMapping("/get")
    public List<PerformanceManage> getInfo(){
        return performanceManageService.getInfo();
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody PerformanceManage performanceManage){
        performanceManageService.save(performanceManage);
        return Constants.SUCCESS;
    }
}
