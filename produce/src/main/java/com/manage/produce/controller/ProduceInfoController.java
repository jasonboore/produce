package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.ProduceInfo;
import com.manage.produce.service.ProduceInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProduceInfoController {
    @Autowired
    private ProduceInfoService produceInfoService;

    @GetMapping("/get")
    public List<ProduceInfo> getInfo(@RequestParam("workunit") String workUnit){
        return produceInfoService.getInfo(workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody ProduceInfo produceInfo){
        produceInfoService.saveData(produceInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        produceInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
