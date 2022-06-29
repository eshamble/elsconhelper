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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Design> getDesignsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFandom(String email, Fandom fan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Fandom> getFandomsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(String email, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Item> getItemsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
