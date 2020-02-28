package com.liferay.salestaxes.model;

import com.liferay.salestaxes.util.PriceFormat;

public class ImportTaxImpl implements Tax {

	private static final double IMPORTED_TAX = 0.05;

	@Override
	public double applyTax(Item item) {
		double taxes = 0.0;
		if (item.isImported()) {
			taxes += PriceFormat.roundValue(item.getPrice() * IMPORTED_TAX);
		}
		
		return taxes;
	}
	

}
