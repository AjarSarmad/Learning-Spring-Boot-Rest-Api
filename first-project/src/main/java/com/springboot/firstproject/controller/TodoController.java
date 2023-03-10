package com.springboot.firstproject.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.firstproject.service.TodoService;

@Controller
@SessionAttributes("name") // It is used to store the name in the session attribute which can be used in
                           // all controllers
public class TodoController {
    @Autowired // @Autowired ==>> LoginService service = new LoginService();
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model) {
        String name = (String) model.get("name"); // get the name from the session attribute
        model.put("todos", service.retrieveTodos(name));

        return "list-todos";
    }
    
    @RequestMapping(value="/add-todos" , method = RequestMethod.GET)
    public String showAddTodos(ModelMap model) {
        return "add-todos";
    	
    }

    @RequestMapping(value="/add-todos" , method = RequestMethod.POST)
    public String addTodos(ModelMap model , @RequestParam String desc) {
    	String name = (String) model.get("name");
    	service.addTodo(name, desc, new Date(), false);
    	return("redirect:/list-todos");
    }

}
