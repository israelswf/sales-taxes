package com.liferay.salestaxes.mock;

import java.util.ArrayList;
import java.util.List;

import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategoryEnum;

public class ItemListMock {
	
	public static List<Item> getItemListMock() {
		Item chocolate = new Item(1L, "Chocolate", false, 0.85, 0.0, ItemCategoryEnum.FOOD);
		Item book = new Item(2L, "Book", false, 12.49, 0.0, ItemCategoryEnum.BOOK);
		Item cd = new Item(3L, "music CD", false, 14.99, 0.0, ItemCategoryEnum.OTHER);

		List<Item> itemList = new ArrayList<>();
		itemList.add(chocolate);
		itemList.add(book);
		itemList.add(cd);
		
		return itemList;
	}

}
