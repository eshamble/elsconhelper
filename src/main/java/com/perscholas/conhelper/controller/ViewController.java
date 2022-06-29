package com.perscholas.conhelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.perscholas.conhelper.service.*;

@Controller
public class ViewController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "Login";
    }
	
	@RequestMapping("/signup")
	@ResponseBody
    public String signUp() {
        return "SignUp";
    }
	
	@RequestMapping("/menu")
    public String menu() {
        return "Menu";
    }
	
	@RequestMapping("/newproduct")
    public String newProduct() {
        return "NewProduct";
    }
	
	// handler method to handle list students and return mode and view
		@GetMapping("/itens")
		public String listItems(Model model) {
			
			model.addAttribute("items", 
					userService.getUserByEmail("eleanorshamble@yahoo.com").getItems());
			return "ItemList";
		}
}
