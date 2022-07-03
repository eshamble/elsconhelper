package com.perscholas.conhelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.perscholas.conhelper.repository.*;
import com.perscholas.conhelper.service.*;
import com.perscholas.conhelper.model.*;

import java.util.*;

@Controller
public class ViewController {
	
	@Autowired
	private UserServiceImpl userService;
	
	ConventionRepository conRepo;
	DesignRepository designRepo;
	FandomRepository fanRepo;
	ItemRepository itemRepo;
	PurchaseRepository purchaseRepo;
	UserRepository userRepo;
	
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
		
		@RequestMapping("/itemsListPage")
	    public String itemListPage(Map<String, Object> model) {
	 
	       User user = userService.getUserByEmail("eleanorshamble@yahoo.com");
			Set<Item> items =  user.getItems();
	       model.put("items", items);
	 
	       return "ItemList";    
	    }
}
