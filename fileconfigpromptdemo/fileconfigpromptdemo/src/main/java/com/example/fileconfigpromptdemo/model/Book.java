package com.example.fileconfigpromptdemo.model;

public class Book {

	private int price;
	private String  name;
	
	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	
	
}
