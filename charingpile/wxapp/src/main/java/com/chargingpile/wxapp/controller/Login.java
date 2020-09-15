package com.chargingpile.wxapp.controller;

import com.chargingpile.wxapp.constant.Constants;
import com.chargingpile.wxapp.data.User;
import com.chargingpile.wxapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        userService.saveUserInfo(user);
        System.out.println(Constants.CODE_AREA.size());
        return "success";
    }
}
