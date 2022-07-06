package com.perscholas.conhelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@RequestMapping("/login")
    public String login() {
        return "Login";
    }
	
	@RequestMapping("/signup")
    public String signUp() {
        return "SignUp";
    }
	
	@RequestMapping("/menu")
    public String menu() {
        return "NewMenu";
    }
	
	/*@RequestMapping("/newproduct")
    public String newProduct() {
        return "NewProduct";
    }*/
		
	@RequestMapping("/producttypes")
	public String productTypesPage(Model model) {
		User user = userService.getUserByEmail("eleanorshamble@yahoo.com");
		Set<Item> items =  user.getItems();
	    model.addAttribute("items", items);
	    return "ItemList";    
	}
	
	@RequestMapping("/designs")
	public String designsPage(Model model) {
		User user = userService.getUserByEmail("eleanorshamble@yahoo.com");
		Set<Design> designs =  user.getDesigns();
	    model.addAttribute("designs", designs);
	    return "DesignList";    
	}
	
	@RequestMapping("/fandoms")
	public String fandomsPage(Model model) {
		User user = userService.getUserByEmail("eleanorshamble@yahoo.com");
		Set<Fandom> fandoms =  user.getFandoms();
	    model.addAttribute("fandoms", fandoms);
	    return "FandomList";    
	}
	
	@RequestMapping("/newfandom")
    public String newFandom(Model model) {
		Fandom fandom = new Fandom();
		model.addAttribute("fandom", fandom);
        return "NewFandom";
    }
	
	@PostMapping("/fandoms")
	public String saveFandom(@ModelAttribute("fandom") Fandom fandom) {
		System.out.println("postmapping fandoms");
		userService.addFandom("eleanorshamble@yahoo.com", fandom);
		return "redirect:/fandoms";
	}
}
