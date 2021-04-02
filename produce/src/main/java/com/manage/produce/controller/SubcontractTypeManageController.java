package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.SubcontractTypeManage;
import com.manage.produce.service.SubcontractTypeManageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subtypemanage")
public class SubcontractTypeManageController {
    @Autowired
    private SubcontractTypeManageService subcontractTypeManageService;

    @GetMapping("/get")
    public List<SubcontractTypeManage> getInfo(){
        return subcontractTypeManageService.getInfo();
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody SubcontractTypeManage subcontractTypeManage){
        subcontractTypeManageService.save(subcontractTypeManage);
        return Constants.SUCCESS;
    }
}
