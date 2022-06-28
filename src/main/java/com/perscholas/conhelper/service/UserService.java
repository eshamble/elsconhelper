package com.perscholas.conhelper.service;

import com.perscholas.conhelper.model.*;
import java.util.*;
public interface UserService {
	
	User saveUser(User user);
	User getUserByEmail(String email);
	
	Convention addConvention(Convention con);
	List<Convention> getConventionsByUserId(long Id);
	
	Design addDesign(Design des);
	List<Design> getDesignsByUserId(long Id);
	
	Fandom addFandom(Fandom fan);
	List<Fandom> getFandomsByUserId(long Id);
	
	Item addItem(Item item);
	List<Item> getItemsByUserId(long id);
	
}
