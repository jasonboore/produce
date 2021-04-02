package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.CostInfo;
import com.manage.produce.service.CostInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cost")
public class CostInfoController {
    @Autowired
    private CostInfoService costInfoService;

    @GetMapping("/get")
    public List<CostInfo> getInfo(@RequestParam("workunit") String workUnit){
        return costInfoService.getInfo(workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody CostInfo costInfo){
        costInfoService.saveData(costInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        costInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
