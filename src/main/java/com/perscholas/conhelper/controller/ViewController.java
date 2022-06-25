package com.perscholas.conhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	
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
}
