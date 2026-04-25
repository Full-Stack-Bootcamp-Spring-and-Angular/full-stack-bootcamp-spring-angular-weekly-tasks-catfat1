package demoapp.controller;

import demoapp.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome()
    {
        return "home";
    }

    @GetMapping("/showMyLoginPage")
    public String showLoginPage()
    {
        return "loginPage";
    }


}



