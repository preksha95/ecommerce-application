package com.learnspringboot.model;

public class Orders {
	private String orders_id;
	public String getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(String orders_id) {
		this.orders_id = orders_id;
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public Orders(String orders_id, String product_id, String quantity, String user_id, String invoice) {
		super();
		this.orders_id = orders_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.user_id = user_id;
		this.invoice = invoice;
	}
	private String product_id;
	private String quantity;
	private String user_id;
    private String invoice;
	

}
