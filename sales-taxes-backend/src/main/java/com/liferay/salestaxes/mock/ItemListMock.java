package com.liferay.salestaxes.mock;

import java.util.ArrayList;
import java.util.List;

import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategory;

public class ItemListMock {
	
	public static List<Item> getItemListMock() {
		Item chocolate = new Item("Chocolate", false, 0.85, 0.85, ItemCategory.FOOD);

		List<Item> itemList = new ArrayList<>();
		//itemList.add(chocolate);
		
		return itemList;
	}

}
