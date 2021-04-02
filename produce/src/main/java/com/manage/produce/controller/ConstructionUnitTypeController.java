package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.ConstructionUnitType;
import com.manage.produce.service.ConstructionUnitTypeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conunittype")
public class ConstructionUnitTypeController {
    @Autowired
    private ConstructionUnitTypeService constructionUnitTypeService;

    @GetMapping("/get")
    public List<ConstructionUnitType> getInfo(){
        return constructionUnitTypeService.getInfo();
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody ConstructionUnitType constructionUnitType){
        constructionUnitTypeService.save(constructionUnitType);
        return Constants.SUCCESS;
    }
}
