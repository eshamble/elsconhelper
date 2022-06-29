package com.perscholas.conhelper.service;

import com.perscholas.conhelper.model.*;
import java.util.*;
public interface UserService {
	
	User saveUser(User user);
	User getUserByEmail(String email);
	
	void addConvention(String email, Convention con);
	List<Convention> getConventionsByUserId(String email);
	
	void addDesign(String email, Design des);
	List<Design> getDesignsByUserId(String email);
	
	void addFandom(String email, Fandom fan);
	List<Fandom> getFandomsByUserId(String email);
	
	void addItem(String email, Item item);
	List<Item> getItemsByUserId(String email);
	
}
