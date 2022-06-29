package com.perscholas.conhelper.service;

import java.util.List;

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
		// TODO Auto-generated method stub
	}

	@Override
	public List<Convention> getConventionsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDesign(String email, Design des) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Design> getDesignsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFandom(String email, Fandom fan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fandom> getFandomsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(String email, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> getItemsByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
