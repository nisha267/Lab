package com.Spring.entity;

public class Lab_Object {
	private String name;
	private String address;
	private Lab_Object2 acc;

	public Lab_Object() {
		System.out.println("def cons");
	}

	public Lab_Object(String name, String address, Lab_Object2 acc) {
		super();
		this.name = name;
		this.address = address;
		this.acc = acc;
	}

	public void display() {
		System.out.println(name + " " + address);
		System.out.println(acc.toString());
	}

}
