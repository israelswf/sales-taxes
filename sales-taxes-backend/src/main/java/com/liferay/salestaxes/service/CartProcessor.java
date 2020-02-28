package com.liferay.salestaxes.service;

import com.liferay.salestaxes.model.Cart;
import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategoryEnum;
import com.liferay.salestaxes.util.PriceFormat;

public class CartProcessor {
	
	public static Cart processAddedItem(Item item, Cart cart) {
		double taxes = calculateTaxes(item);
		item.setGrossPrice(PriceFormat.formatValue(item.getPrice() + taxes));
		cart.getItems().add(item);
		cart.setTotalTaxes(cart.getTotalTaxes() + taxes);
		cart.setTotalAmmount(PriceFormat.formatValue(cart.getTotalAmmount() + item.getGrossPrice()));
		return cart;
	}
	
	private static double calculateTaxes(Item item) { 
		double taxes = 0;
		
		TaxProcessor taxProcessor = new TaxProcessor();
		taxes = taxProcessor.applyTaxes(item);
		
		return PriceFormat.roundValue(taxes);
	}
	
}
