package com.perscholas.conhelper.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

@Service
public class ItemServiceImpl implements ItemService{
	
	private ItemRepository repo;

	@Override
	public Item getItemById(long Id) {
		return repo.findById(Id).get();
	}
	
}
