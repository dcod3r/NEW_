package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits{

	public String taste()
	{
		return "sour";
	}

	public Orange() {
		super();
		setName("Orange");
	}

	public Orange(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
		setName("Orange");
	}
	@Override
	public void accept(Scanner scan) {
		super.accept(scan);
	}
}
