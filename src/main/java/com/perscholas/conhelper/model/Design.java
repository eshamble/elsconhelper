package com.perscholas.conhelper.model;

import javax.persistence.*;

@Entity
@Table(name = "design")
public class Design {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	@Column(name = "userId")
	private long userId;
	
    @Column(name = "name")
    private String name;
    
    @Column(name = "fandom")
    private long fandom;
    
    @Column (name = "active")
    private boolean active;
    
    public Design() {
    	
    }
    
    public Design(long userId, String name, long fandom) {
    	this.userId = userId;
    	this.name = name;
    	this.fandom = fandom;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getFandom() {
		return fandom;
	}

	public void setFandom(long fandom) {
		this.fandom = fandom;
	}

	public long getId() {
		return id;
	}
    
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
    public String toString() {
		return "Design [id=" + id + " name=" + name + " fandom=" + fandom
				+ "]";
	}
    
}
