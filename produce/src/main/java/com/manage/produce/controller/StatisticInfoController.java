package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.StatisticInfo;
import com.manage.produce.service.StatisticInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistic")
public class StatisticInfoController {
    @Autowired
    private StatisticInfoService statisticInfoService;

    @GetMapping("/get")
    public List<StatisticInfo> getInfo(@RequestParam("workunit") String workUnit){
        return statisticInfoService.getInfo(workUnit);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody StatisticInfo statisticInfo){
        statisticInfoService.saveData(statisticInfo);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        statisticInfoService.deleteData(id);
        return Constants.SUCCESS;
    }
}
