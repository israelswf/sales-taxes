package com.liferay.salestaxes.model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Item> items;
	private double totalAmmount;

	public List<Item> getProducts() {
		return items;
	}

	public void setProducts(List<Item> items) {
		this.items = items;
	}

	public double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}

}
