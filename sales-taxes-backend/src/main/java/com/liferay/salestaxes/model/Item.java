package com.liferay.salestaxes.model;

import java.io.Serializable;

public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private boolean imported;
	private double price;
	private double grossPrice;
	private ItemCategoryEnum category;
	
	public Item() {
	}
	
	public Item(String name, boolean imported, double price, double grossPrice, ItemCategoryEnum category) {
		super();
		this.name = name;
		this.imported = imported;
		this.price = price;
		this.grossPrice = grossPrice;
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
	
	public ItemCategoryEnum getCategory() {
		return category;
	}
	
	public void setCategory(ItemCategoryEnum category) {
		this.category = category;
	}

	public double getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(double grossPrice) {
		this.grossPrice = grossPrice;
	}
}
