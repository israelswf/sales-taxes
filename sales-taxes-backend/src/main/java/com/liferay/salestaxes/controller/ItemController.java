package com.liferay.salestaxes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public List<Item> getItems() {
		return itemService.getItems();
	}

}
