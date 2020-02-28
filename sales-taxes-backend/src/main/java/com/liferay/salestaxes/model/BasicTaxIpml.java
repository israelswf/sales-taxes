package com.liferay.salestaxes.model;

import com.liferay.salestaxes.util.PriceFormat;

public class BasicTaxIpml implements Tax {

	private static final double BASIC_TAX = 0.1;

	@Override
	public double applyTax(Item item) {
		double taxes = 0.0;
		if (item.getCategory().equals(ItemCategoryEnum.OTHER)) {
			taxes += PriceFormat.roundValue(item.getPrice() * BASIC_TAX);
		}
		
		return taxes;
	}

}
