package com.liferay.salestaxes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;

	@GetMapping("/cart")
	public Cart getCart() {
		
		return cartService.getCart();
	}
}
