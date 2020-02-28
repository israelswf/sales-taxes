package com.liferay.salestaxes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.ItemCategoryEnum;

class TaxProcessorTest {

	static TaxProcessor taxProcessor;
	
	@BeforeAll
	public static void setup() {
		taxProcessor = new TaxProcessor();
	}

	@Test
	void taxesShouldBeZero() {
		Item item = new Item("Chocolate", false, 0.85, 0.85, ItemCategoryEnum.FOOD);
		double taxes = taxProcessor.applyTaxes(item);
		assertEquals(0.0, taxes, "Taxes should be zero");
	}

}
