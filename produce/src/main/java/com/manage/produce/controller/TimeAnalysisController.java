package com.manage.produce.controller;

import com.manage.produce.data.TimeAnalysis;
import com.manage.produce.service.TimeAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/timeanalysis")
public class TimeAnalysisController {
    @Autowired
    private TimeAnalysisService timeAnalysisService;

    @GetMapping("/get")
    public List<TimeAnalysis> getInfo(@RequestParam("engineertime") Long engineerTime){
        return timeAnalysisService.getInfo(engineerTime);
    }
}
