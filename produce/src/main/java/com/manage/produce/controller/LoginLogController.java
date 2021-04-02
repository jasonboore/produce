package com.manage.produce.controller;

import com.manage.produce.data.LoginLog;
import com.manage.produce.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loginlog")
public class LoginLogController {
    @Autowired
    private LoginLogService loginLogService;

    @GetMapping("/get")
    public List<LoginLog> getInfo(){
        return loginLogService.getInfo();
    }
}
