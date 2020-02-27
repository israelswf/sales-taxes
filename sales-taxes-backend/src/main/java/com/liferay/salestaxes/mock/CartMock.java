package com.liferay.salestaxes.mock;

import com.liferay.salestaxes.model.Cart;

public class CartMock {
	
	public static Cart getCart() {
		Cart cart = new Cart();
		cart.setItems(ItemListMock.getItemListMock());
		//cart.setTotalAmmount(0.85);
		return cart;
	}
	

}
