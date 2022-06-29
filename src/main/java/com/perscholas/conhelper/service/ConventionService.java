package com.perscholas.conhelper.service;

import java.util.*;
import com.perscholas.conhelper.model.*;
public interface ConventionService {

	Convention getConventionById(long Id);
	
	Set<Purchase> getConventionPurchasesById(long Id);
	void addPurchase(long Id, Purchase pur);
	
}
