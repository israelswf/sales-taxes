package com.liferay.salestaxes.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategory;

public class CartProcessor {
	
	private final static double IMPORTED_TAX = 0.05;
	private final static double BASIC_TAX = 0.1;
	

	public static Cart processAddedItem(Item item, Cart cart) {
		double taxes = calculateTaxes(item);
		item.setGrossPrice(formatValue(item.getPrice() + taxes));
		cart.getItems().add(item);
		cart.setTotalTaxes(cart.getTotalTaxes() + taxes);
		cart.setTotalAmmount(formatValue(cart.getTotalAmmount() + item.getGrossPrice()));
		return cart;
	}
	
	private static double calculateTaxes(Item item) { 
		double taxes = 0;
		if (item.isImported()) {
			taxes += roundValue(item.getPrice() * IMPORTED_TAX);
		}
		
		if (item.getCategory().equals(ItemCategory.OTHER)) {
			taxes += roundValue(item.getPrice() * BASIC_TAX);
		}
		
		return roundValue(taxes);
	}
	
	private static double roundValue(double value) {
		double roundedValue = Math.round(value * 20) / 20.00;
		return roundedValue;
	}
	
	private static double formatValue(double value) {
		BigDecimal bd = new BigDecimal(value).setScale(2, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}
}
