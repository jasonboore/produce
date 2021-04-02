package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.ConstructionUnitManage;
import com.manage.produce.data.ConstructionUnitType;
import com.manage.produce.service.ConstructionUnitManageService;
import net.sf.json.JSONObject;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conunitmanage")
public class ConstructionTypeManageController {
    @Autowired
    private ConstructionUnitManageService constructionUnitManageService;

    @GetMapping("/get")
    public List<ConstructionUnitManage> getInfo(@RequestParam("unittype") String unitType, @RequestParam("unitname") String unitName){
        return constructionUnitManageService.getInfo(unitType, "%" + unitName + "%");
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody ConstructionUnitManage constructionUnitManage){
        constructionUnitManageService.save(constructionUnitManage);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id) {
        constructionUnitManageService.delete(id);
        return Constants.SUCCESS;
    }
}
