package com.perscholas.conhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	
	@RequestMapping("/menu")
    @ResponseBody
    public String menu() {
        return "Menu";
    }
	
	@RequestMapping("/newproduct")
    @ResponseBody
    public String newProduct() {
        return "NewProduct";
    }
}
