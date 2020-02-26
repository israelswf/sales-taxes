package com.liferay.salestaxes.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liferay.salestaxes.mock.ItemListMock;
import com.liferay.salestaxes.model.Item;

@Repository
public class ItemRepository {
	
	public List<Item> getItemsList() {
		return ItemListMock.getItemListMock();
	}
}
