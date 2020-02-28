package com.liferay.salestaxes.mock;

import java.util.ArrayList;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.model.Item;

public class CartMock {
	
	public static Cart getCart() {
		Cart cart = new Cart();
		cart.setItems(new ArrayList<Item>());
		return cart;
	}
	

}
