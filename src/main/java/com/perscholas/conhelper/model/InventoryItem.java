package com.perscholas.conhelper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.perscholas.conhelper.service.*;
import com.perscholas.conhelper.model.*;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "item_id")
	private long itemId;
	
	@Column(name = "design_id")
	private long designId;
	
	@Column(name = "stock")
	private int stock;
	
	public InventoryItem() {
		
	}
	
	public InventoryItem(long itemId, long designId) {
		this.itemId = itemId;
		this.designId = designId;
	}
	
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getDesignId() {
		return designId;
	}

	public void setDesignId(long designId) {
		this.designId = designId;
	}

	public long getId() {
		return id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/*@Override
    public String toString() {
		return "Inventory [id=" + id + " design=" + design.getName() +
				" item type=" + item.getType() + " item size=" + 
				item.getSize() + "]";
	}*/
}
