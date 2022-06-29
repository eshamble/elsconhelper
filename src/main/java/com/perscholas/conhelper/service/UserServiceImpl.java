package com.perscholas.conhelper.service;

import java.util.*;

import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

public class UserServiceImpl implements UserService{
	
	private UserRepository repo;

	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}

	@Override
	public User getUserByEmail(String email) {
		return repo.findById(email).get();
	}

	@Override
	public void addConvention(String email, Convention con) {
		User u = getUserByEmail(email);
		u.addConvention(con);
	}

	@Override
	public Set<Convention> getConventionsByUserId(String email) {
		User u = getUserByEmail(email);
		return u.getConventions();
	}

	@Override
	public void addDesign(String email, Design des) {
		User u = getUserByEmail(email);
		u.addDesign(des);
		
	}

	@Override
	public Set<Design> getDesignsByUserId(String email) {
		User u = getUserByEmail(email);
		return u.getDesigns();
	}

	@Override
	public void addFandom(String email, Fandom fan) {
		User u = getUserByEmail(email);
		u.addFandom(fan);
	}

	@Override
	public Set<Fandom> getFandomsByUserId(String email) {
		User u = getUserByEmail(email);
		return u.getFandoms();
	}

	@Override
	public void addItem(String email, Item item) {
		User u = getUserByEmail(email);
		u.addItem(item);
	}

	@Override
	public Set<Item> getItemsByUserId(String email) {
		User u = getUserByEmail(email);
		return u.getItems();
	}

}
