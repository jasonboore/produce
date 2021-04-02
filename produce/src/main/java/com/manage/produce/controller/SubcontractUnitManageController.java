package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.SubcontractUnitManage;
import com.manage.produce.service.SubcontractUnitManageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subunitmanage")
public class SubcontractUnitManageController {
    @Autowired
    private SubcontractUnitManageService subcontractUnitManageService;

    @GetMapping("/get")
    public List<SubcontractUnitManage> getInfo(@RequestParam("unitname") String unitName){
        return subcontractUnitManageService.getInfo("%" + unitName + "%");
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody SubcontractUnitManage subcontractUnitManage){
        subcontractUnitManageService.save(subcontractUnitManage);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id) {
        subcontractUnitManageService.delete(id);
        return Constants.SUCCESS;
    }
}
