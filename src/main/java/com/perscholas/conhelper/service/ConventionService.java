package com.perscholas.conhelper.service;

import java.util.*;
import com.perscholas.conhelper.model.*;
public interface ConventionService {

	Convention getConventionById(long Id);
	List<Purchase> getConventionPurchasesById(long Id);
}
