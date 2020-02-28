package com.liferay.salestaxes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liferay.salestaxes.mock.ItemListMock;
import com.liferay.salestaxes.model.Item;

@Service
public class ItemService {
	
	public List<Item> getItems() {
		return ItemListMock.getItemListMock();
	}

}
