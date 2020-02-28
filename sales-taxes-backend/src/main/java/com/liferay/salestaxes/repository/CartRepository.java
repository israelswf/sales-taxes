package com.liferay.salestaxes.repository;

import org.springframework.stereotype.Repository;

import com.liferay.salestaxes.mock.CartMock;
import com.liferay.salestaxes.model.Cart;

@Repository
public class CartRepository {
	
	private Cart cart = CartMock.getCart();

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
