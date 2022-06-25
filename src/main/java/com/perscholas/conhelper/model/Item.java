package com.perscholas.conhelper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "type")
    private String type;
	
	@Column(name = "size")
    private String size;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "sale_price")
	private float salePrice;
	
	public Item() {
		
	}
	
	public Item(String type, String size, float price) {
		this.type = type;
		this.size = size;
		this.price = price;
		this.salePrice = price;
	}
	
	public Item(String type, String size, float price, float salePrice) {
		this.type = type;
		this.size = size;
		this.price = price;
		this.salePrice = salePrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public long getId() {
		return id;
	}
	
	@Override
    public String toString() {
		return "Item [id=" + id + " type=" + type + " size=" + size
				+ " price=" + price + " sale price=" + salePrice+ "]";
	}
}
