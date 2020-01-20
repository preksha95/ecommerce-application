package com.learnspringboot.model;

public class Store {

	private String store_id;
	public Store(String store_id, String product_id, String quantity) {
		super();
		this.store_id = store_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	private String product_id;
	private String quantity;
	
	
}
