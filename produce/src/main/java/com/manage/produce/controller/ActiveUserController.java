package com.manage.produce.controller;

import com.manage.produce.data.ActiveUser;
import com.manage.produce.service.ActiveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activeuser")
public class ActiveUserController {
    @Autowired
    private ActiveUserService activeUserService;

    @GetMapping("/get")
    public List<ActiveUser> getInfo(){
        return activeUserService.getInfo();
    }
}
