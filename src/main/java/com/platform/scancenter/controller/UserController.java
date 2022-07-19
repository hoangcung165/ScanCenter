package com.platform.scancenter.controller;

import com.platform.scancenter.constant.BaseUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TranCung
 * 17/07/2022
 * UserController
 */
@RestController
@RequestMapping(BaseUrl.API_V1 + "/user")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/get-password")
    public String getPassword(@RequestParam("password") String password){
        return passwordEncoder.encode(password);
    }

}
