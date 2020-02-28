package com.liferay.salestaxes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	
	public Cart getCart() {
		Cart cart = cartRepository.getCart();
		return cart;
	}

	public Cart addItem(Item item) {
		Cart cart = cartRepository.getCart();
		CartProcessor.processAddedItem(item, cart);
		 
		return cart;
	}

}
