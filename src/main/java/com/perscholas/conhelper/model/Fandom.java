package com.perscholas.conhelper.model;

import javax.persistence.*;

@Entity
@Table(name = "fandom")
public class Fandom {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "name")
    private String name;
	
	public Fandom(){
		
	}
	
	public Fandom(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}
	
	@Override
    public String toString() {
		return "Fandom [id=" + id + " name=" + name +"]";
	}
}
