package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.SubcontractInfo;
import com.manage.produce.service.SubcontractInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcontract")
public class SubcontractInfoController {
    @Autowired
    private SubcontractInfoService subcontractInfoService;

    @GetMapping("/get")
    public List<SubcontractInfo> getInfo(@RequestParam("engineertime") Long engineerTime, @RequestParam("workunit") String workUnit){
        return subcontractInfoService.getInfo(engineerTime, workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody SubcontractInfo subcontractInfo){
        subcontractInfoService.saveData(subcontractInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        subcontractInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
