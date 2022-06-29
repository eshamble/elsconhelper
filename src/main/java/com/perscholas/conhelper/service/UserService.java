package com.perscholas.conhelper.service;

import com.perscholas.conhelper.model.*;
import java.util.*;
public interface UserService {
	
	User saveUser(User user);
	User getUserByEmail(String email);
	
	void addConvention(User user, Convention con);
	List<Convention> getConventionsByUserId(long Id);
	
	void addDesign(User user, Design des);
	List<Design> getDesignsByUserId(long Id);
	
	void addFandom(User user, Fandom fan);
	List<Fandom> getFandomsByUserId(long Id);
	
	void addItem(User user, Item item);
	List<Item> getItemsByUserId(long id);
	
}
