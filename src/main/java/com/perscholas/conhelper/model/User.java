package com.perscholas.conhelper.model;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "email")
    private String email;
	
	@Column(name = "password")
    private String password;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Convention> conventions;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Design> designs;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Fandom> fandoms;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Item> items;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<InventoryItem> inventoryItems;
	
	public User() {

    }
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<Convention> getConventions() {
		return conventions;
	}

	public void setConventions(Set<Convention> conventions) {
		this.conventions = conventions;
	}

	public Set<Design> getDesigns() {
		return designs;
	}

	public void setDesigns(Set<Design> designs) {
		this.designs = designs;
	}

	public Set<Fandom> getFandoms() {
		return fandoms;
	}

	public void setFandoms(Set<Fandom> fandoms) {
		this.fandoms = fandoms;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public void addConvention(Convention c) {
		try {
			conventions.add(c);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void addDesign(Design d) {
		try {
			designs.add(d);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void addFandom(Fandom f) {
		try {
			fandoms.add(f);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void addItem(Item item) {
		try {
			items.add(item);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
    public String toString() {
        return "User [email=" + email + " password=" + password + "]";
    }
}
