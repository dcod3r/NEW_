package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits {

	public String taste()
	{
		return "sweet";
	}

	public Mango() {
		super();
		setName("Mango");
	}

	public Mango(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
		setName("Mango");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void accept(Scanner scan) {
		super.accept(scan);
	}
}
