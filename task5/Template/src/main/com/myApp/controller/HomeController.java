package main.com.myApp.controller;

import main.com.myApp.dao.DatabaseOperation;
import main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @Autowired
    DatabaseOperation databaseOperation;

    @RequestMapping("/")
    public String showHomePage() {
        return "userRegistration";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        //@getting parameters from request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dateOfBirth = request.getParameter("dob");
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dateOfBirth, formatter);
        String city = request.getParameter("city");

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setDob(dob);
        user.setCity(city);

        user = databaseOperation.saveUser(user);

        //adding data to the model
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("dob", user.getDob());
        model.addAttribute("city", user.getCity());

        //return the view with model
        return "previewUserData";

    }
}


