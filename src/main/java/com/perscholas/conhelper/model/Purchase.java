package com.perscholas.conhelper.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Item> items;
	
	@Column(name = "sale")
	private boolean sale;
	
	public boolean addItem(Item i) {
		try {
			items.add(i);
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public boolean isSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

	public long getId() {
		return id;
	}
	
	
}
