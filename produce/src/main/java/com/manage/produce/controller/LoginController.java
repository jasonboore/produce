package com.manage.produce.controller;

import com.manage.produce.data.User;
import com.manage.produce.data.NewUser;
import com.manage.produce.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public JSONObject login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping("update")
    public JSONObject update(@RequestBody NewUser newUser) {
        return userService.save(newUser);
    }
}
