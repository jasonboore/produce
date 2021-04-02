package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.CodeManage;
import com.manage.produce.service.CodeManageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codemanage")
public class CodeManageController {
    @Autowired
    private CodeManageService codeManageService;

    @GetMapping("/get")
    public List<CodeManage> getInfo(){
        return codeManageService.getInfo();
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody CodeManage codeManage){
        codeManageService.save(codeManage);
        return Constants.SUCCESS;
    }
}
