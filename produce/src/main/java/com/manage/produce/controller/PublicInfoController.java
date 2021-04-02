package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.PublicInfo;
import com.manage.produce.service.PublicInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produce")
public class PublicInfoController {
    @Autowired
    private PublicInfoService publicInfoService;

    @GetMapping("/get")
    public List<PublicInfo> getInfo(@RequestParam("year") Long year, @RequestParam("workcompany") String workcompany){
        return publicInfoService.getInfo(year, workcompany);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody PublicInfo publicInfo){
        publicInfoService.saveData(publicInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        publicInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
