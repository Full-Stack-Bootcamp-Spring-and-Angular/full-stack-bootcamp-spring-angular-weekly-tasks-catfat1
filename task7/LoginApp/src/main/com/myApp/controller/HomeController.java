package main.com.myApp.controller;

import main.com.myApp.dao.DatabaseOperation;
import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
public class HomeController {
    @Autowired
    DatabaseOperation dbo;


    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("userModel", new UserModel());

        return "userRegistration";
    }

    @RequestMapping("/processForm")
    public String submitForm(@Valid @ModelAttribute("userModel") UserModel userModel, BindingResult result, Model model) throws SQLException {
        //to return back to the form page with the errors
        if (result.hasErrors()) {
            return "userRegistration";
        } else {
            dbo.saveUser(userModel);
            model.addAttribute("userModel", userModel);
            return "previewUserData";
        }


        // String usernameAsUpperCase = userModel.getUserName().toUpperCase();
        // userModel.setUserName(usernameAsUpperCase);

        //step1: add bean to model
        // model.addAttribute("userModelResult" , userModel);

        //step2: return view page


    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, editor);
    }
}