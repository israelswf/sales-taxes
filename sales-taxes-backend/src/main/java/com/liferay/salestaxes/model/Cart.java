package com.liferay.salestaxes.model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Item> items;
	private double totalAmmount;
	private double totalTaxes;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}

	public double getTotalTaxes() {
		return totalTaxes;
	}

	public void setTotalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

}
