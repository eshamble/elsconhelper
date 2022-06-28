package com.perscholas.conhelper.service;

import java.util.List;

import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

public class UserServiceImpl implements UserService{
	
	private UserRepository repo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Convention addConvention(User user, Convention con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Convention> getConventionsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Design addDesign(User user, Design des) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Design> getDesignsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fandom addFandom(User user, Fandom fan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fandom> getFandomsByUserId(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item addItem(User user, Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItemsByUserId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
