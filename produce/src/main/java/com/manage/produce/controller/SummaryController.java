package com.manage.produce.controller;


import com.manage.produce.data.SummaryInfo;
import com.manage.produce.service.SummaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/summary")
public class SummaryController {
    @Autowired
    private SummaryInfoService summaryInfoService;

    @GetMapping("/get")
    public List<SummaryInfo> getInfo(@RequestParam("isfin") String isFin, @RequestParam("workunit") String workUnit){
        return summaryInfoService.getInfo(isFin, workUnit);
    }
}
