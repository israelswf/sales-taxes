package com.liferay.salestaxes.mock;

import java.util.ArrayList;
import java.util.List;

import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategory;

public class ItemListMock {
	
	public static List<Item> getItemListMock() {
		Item book = new Item("Book", false, 12.49, ItemCategory.BOOK);
		Item cd = new Item("CD", false, 14.99, ItemCategory.OTHER);

		List<Item> itemList = new ArrayList<>();
		itemList.add(book);
		itemList.add(cd);
		
		return itemList;
	}

}
