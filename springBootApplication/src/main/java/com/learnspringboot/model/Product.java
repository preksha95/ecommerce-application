package com.learnspringboot.model;

public class Product {
	private String id;
	private String name;
	private String description;
	private String discount;
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Product(String id, String name, String description, String discount, String price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discount = discount;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
