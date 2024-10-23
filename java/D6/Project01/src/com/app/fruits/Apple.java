package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits{

	
	public Apple() {
		super();
		setName("Apple");
	}

	public Apple(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
		this.setName("Apple");
	}

	public String taste()
	{
		return "sweet n sour";
	}

	@Override
	public void accept(Scanner scan) {
		super.accept(scan);
	}
	
}
