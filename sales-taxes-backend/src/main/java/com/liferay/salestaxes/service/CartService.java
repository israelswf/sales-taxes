package com.liferay.salestaxes.service;

import org.springframework.stereotype.Service;

import com.liferay.salestaxes.mock.ItemListMock;
import com.liferay.salestaxes.model.Cart;

@Service
public class CartService {
	
	public Cart getCart() {
		
		Cart cart = new Cart();
		cart.setProducts(ItemListMock.getItemListMock());
		cart.setTotalAmmount(17.89);
		
		return cart;
	}

}
