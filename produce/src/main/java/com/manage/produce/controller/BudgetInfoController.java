package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.BudgetInfo;
import com.manage.produce.service.BudgetInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class BudgetInfoController {
    @Autowired
    private BudgetInfoService budgetInfoService;

    @GetMapping("/get")
    public List<BudgetInfo> getInfo(@RequestParam("engineertime") Long engineerTime, @RequestParam("workunit") String workUnit){
        return budgetInfoService.getInfo(engineerTime, workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody BudgetInfo budgetInfo){
        budgetInfoService.saveData(budgetInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        budgetInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
