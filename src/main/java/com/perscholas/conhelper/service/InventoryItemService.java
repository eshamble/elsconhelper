package com.perscholas.conhelper.service;

import com.perscholas.conhelper.model.*;
import com.perscholas.conhelper.repository.*;

public interface InventoryItemService {
	
	InventoryItem createInventoryItemByIds(long designId, long itemId);
	InventoryItem getInventoryItemById(long id);
	void changeQuantity(long inventoryItemId, int quantity);
	
}
