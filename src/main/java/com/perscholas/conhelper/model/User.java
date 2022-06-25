package com.perscholas.conhelper.model;
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
    private Set<Purchase> purchases;
	
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
	
	@Override
    public String toString() {
        return "User [email=" + email + " password=" + password + "]";
    }
}
