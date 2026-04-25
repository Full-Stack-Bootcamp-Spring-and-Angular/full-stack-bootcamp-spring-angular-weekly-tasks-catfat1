package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController
{

    @GetMapping("/")
    public String showHomePage()
    {
        return "homePage";
    }

    @GetMapping("/showAdminPage")
    public String showAdminPage()
    {
        return "adminPage";
    }

    @GetMapping("/showSystemPage")
    public String showSystemPage()
    {
        return "systemPage";
    }

    @GetMapping("/showManagerPage")
    public String showManagerPage()
    {
        return "managerPage";
    }
}
