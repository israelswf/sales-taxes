package com.liferay.salestaxes.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceFormat {
	
	public static double roundValue(double value) {
		double roundedValue = Math.round(value * 20) / 20.00;
		return roundedValue;
	}
	
	public static double formatValue(double value) {
		BigDecimal bd = new BigDecimal(value).setScale(2, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}

}
