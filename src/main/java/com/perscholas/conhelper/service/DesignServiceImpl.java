package com.perscholas.conhelper.service;

import org.springframework.stereotype.Service;

import java.util.*;
import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

@Service
public class DesignServiceImpl implements DesignService{

	private DesignRepository repo;

	@Override
	public Design getDesignById(long Id) {
		return repo.findById(Id).get();
	}
}
