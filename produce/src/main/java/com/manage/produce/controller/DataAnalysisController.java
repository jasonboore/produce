package com.manage.produce.controller;

import com.manage.produce.data.DataAnalysis;
import com.manage.produce.data.TimeAnalysis;
import com.manage.produce.service.DataAnalysisService;
import com.manage.produce.service.TimeAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dataanalysis")
public class DataAnalysisController {
    @Autowired
    private DataAnalysisService dataAnalysisService;

    @GetMapping("/get")
    public List<DataAnalysis> getInfo(@RequestParam("engineertime") Long engineerTime){
        return dataAnalysisService.getInfo(engineerTime);
    }
}
