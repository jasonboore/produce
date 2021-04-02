package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.ContractInfo;
import com.manage.produce.service.ContractInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractInfoController {
    @Autowired
    private ContractInfoService contractInfoService;

    @GetMapping("/get")
    public List<ContractInfo> getInfo(@RequestParam("engineertime") Long engineerTime, @RequestParam("workunit") String workUnit){
        return contractInfoService.getInfo(engineerTime, workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody ContractInfo contractInfo){
        contractInfoService.saveData(contractInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        contractInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
