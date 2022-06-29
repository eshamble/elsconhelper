package com.perscholas.conhelper.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

@Service
public class ConventionServiceImpl implements ConventionService{
	
	private ConventionRepository repo;
	@Override
	public Convention getConventionById(long Id) {
		return repo.findById(Id).get();
	}

	@Override
	public Set<Purchase> getConventionPurchasesById(long Id) {
		return repo.findById(Id).get().getPurchases();
	}

	@Override
	public void addPurchase(long Id, Purchase pur) {
		repo.findById(Id).get().addPurchase(pur);
	}

}
