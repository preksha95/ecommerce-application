package com.learnspringboot.model;

public class SavedItems {
	private String saved_items_id;
	private String[] product_id;
	private String user_id;
	
	public SavedItems(String saved_items_id, String[] product_id, String user_id) {
		super();
		this.saved_items_id = saved_items_id;
		this.product_id = product_id;
		this.user_id = user_id;
	}
	public String getSaved_items_id() {
		return saved_items_id;
	}
	public void setSaved_items_id(String saved_items_id) {
		this.saved_items_id = saved_items_id;
	}
	public String[] getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String[] product_id) {
		this.product_id = product_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
	
}
