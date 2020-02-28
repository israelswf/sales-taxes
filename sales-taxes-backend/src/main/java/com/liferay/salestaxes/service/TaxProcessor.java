package com.liferay.salestaxes.service;

import java.util.ArrayList;
import java.util.List;

import com.liferay.salestaxes.model.BasicTaxIpml;
import com.liferay.salestaxes.model.ImportTaxImpl;
import com.liferay.salestaxes.model.Item;
import com.liferay.salestaxes.model.Tax;

public class TaxProcessor {

	private List<Tax> activeTaxes;
	
	public TaxProcessor( ) {
		BasicTaxIpml basicTax = new BasicTaxIpml();
		ImportTaxImpl importTax = new ImportTaxImpl();

		activeTaxes = new ArrayList<>();
		activeTaxes.add(basicTax);
		activeTaxes.add(importTax);
	}
	
	public double applyTaxes(Item item) {
		double totalTaxes  = 0;
		totalTaxes = activeTaxes.stream().mapToDouble(tax->tax.applyTax(item)).sum();
		return totalTaxes;
	}
	
}
