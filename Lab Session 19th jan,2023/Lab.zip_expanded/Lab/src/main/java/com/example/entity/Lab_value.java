package com.example.entity;

public class Lab_value {
	private int product_id;
	private String product_name;

	public Lab_value(int product_id) {
		this.product_id = product_id;
	}

	public Lab_value(String product_name) {
		this.product_name = product_name;
	}

	public Lab_value(int product_id, String product_name) {
		this.product_id = product_id;
		this.product_name = product_name;
	}

	public void display() {
		System.out.println(product_id + " " + product_name);
	}
}
