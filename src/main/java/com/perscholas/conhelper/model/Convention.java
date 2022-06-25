package com.perscholas.conhelper.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "convention")
public class Convention {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private Date date;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Purchase> purchases;
	
	public Convention() {
		
	}
	
	public Convention(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public boolean addPurchase(Purchase p) {
		try {
			purchases.add(p);
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
	}

	public long getId() {
		return id;
	}
}
