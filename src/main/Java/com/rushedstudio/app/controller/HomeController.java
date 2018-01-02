package com.rushedstudio.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home", "/homepage"})
    public String homepage(){
        return "index";
    }
}
