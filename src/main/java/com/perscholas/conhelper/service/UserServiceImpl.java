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
	public void addConvention(User user, Convention con) {
		// TODO Auto-generated method stub
		user.addConvention(con);
	}

	@Override
	public List<Convention> getConventionsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDesign(User user, Design des) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Design> getDesignsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFandom(User user, Fandom fan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fandom> getFandomsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(User user, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> getItemsByUserId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
