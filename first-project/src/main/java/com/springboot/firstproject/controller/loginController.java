package com.springboot.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.firstproject.service.LoginService;

@ComponentScan("com.springboot.firstproject.service") // It is used to scan the package in search of @Component for
                                                      // @Autowired
@Controller
@SessionAttributes("name") // It is used to store the name in the session attribute which can be used in
                           // all controllers


public class loginController {
    @Autowired // @Autowired ==>> LoginService service = new LoginService();
    LoginService service;
    // @ResponseBody // It is used to return other than a function like JSON or String.
    // If we dont use this annotation then it will return the view (if exists)

    /*
     * public String msg(@RequestParam String name, ModelMap model) { // ModelMap is
     * used to pass the data from controller to the view
     * // @RequestParam is used to get the data from the url
     * model.put("name", name); // "name" is data which is passed to the login.jsp
     * 
     * return "login";
     * }
     */

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String msg() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcome(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isValidUser = service.validateUser(name, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }

}
