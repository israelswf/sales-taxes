package com.liferay.salestaxes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/cart")
	public Cart getCart() {
		return cartService.getCart();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/cart/items") 
	public Cart addItem(@RequestBody Item item) {
		
		Cart cart = cartService.addItem(item);
		return cart;
	}
}
