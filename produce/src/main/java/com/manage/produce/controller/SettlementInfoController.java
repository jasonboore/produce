package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.SettlementInfo;
import com.manage.produce.service.SettlementInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/settlement")
public class SettlementInfoController {
    @Autowired
    private SettlementInfoService settlementInfoService;

    @GetMapping("/get")
    public List<SettlementInfo> getInfo(@RequestParam("engineertime") Long engineerTime, @RequestParam("workunit") String workUnit){
        return settlementInfoService.getInfo(engineerTime, workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody SettlementInfo settlementInfo){
        settlementInfoService.saveData(settlementInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        settlementInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
