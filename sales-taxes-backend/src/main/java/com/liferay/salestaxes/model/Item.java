package com.liferay.salestaxes.model;

import java.io.Serializable;

public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private boolean imported;
	private double price;
	private ItemCategory category;
	
	public Item() {
	}
	public Item(String name, boolean imported, double price, ItemCategory category) {
		super();
		this.name = name;
		this.imported = imported;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isImported() {
		return imported;
	}
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ItemCategory getCategory() {
		return category;
	}
	public void setCategory(ItemCategory category) {
		this.category = category;
	}

}
