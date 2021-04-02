package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.DepartmentManagement;
import com.manage.produce.service.DepartmentManageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DeparetmentManageController {
    @Autowired
    private DepartmentManageService departmentManageService;

    @GetMapping("/get")
    public List<DepartmentManagement> getInfo(){
        return departmentManageService.getInfo();
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody DepartmentManagement departmentManagement){
        departmentManageService.saveData(departmentManagement);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        departmentManageService.deleteData(id);
        return Constants.SUCCESS;
    }
}
