package com.app.fruits;

import java.util.Scanner;

public class Fruits {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	public Fruits() {
		this.color = null;
		this.weight = 0.0;
		this.name = null;
		this.isFresh = true;
	}
	public Fruits(String color, double weight, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste()
	{ 
		return "no specific taste";
	}
	public void accept(Scanner scan) {
		System.out.println("Enter the Fruit Colour");
		color = scan.next();
		System.out.println("Enter the Weight of Fruit");
		weight = scan.nextDouble();
//		System.out.println("Enter 1 for Fresh or Anything for Not Fresh");
//		int flag = scan.nextInt();
//		if(flag == 1)
//			isFresh = true;
//		else 
//			isFresh = false;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
}
