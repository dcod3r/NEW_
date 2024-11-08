package com.me;

import java.util.Scanner;

	interface Shape
	{
		
		void accept(Scanner sc);
		
		void calcArea();
		
		default void calcPeri() {	
			
		}
	
	static Shape ShapeFactory(int choice)
	{
		switch(choice ) {
			case 1:
				return new Circle();
			case 2:
				return new Rectanlge();		
		}
		return null;
	}

	void calculatePerimeter();
	}
	
	class Circle implements Shape{
		int radius;
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter Radius : ");
			radius = sc.nextInt();
		}

		@Override
		public void calcArea() {
			System.out.println("Area of Cicle = " + 3.14 * radius *  radius);
		}

		@Override
		public void calculatePerimeter() {
			System.out.println("Area of circle = " + 3.14 * radius * radius);	
			
		}
		
	}
	class Rectanlge implements Shape{
		int length;
		int breadth;
		
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter length");
			length = sc.nextInt();
			System.out.println("Enter Breadth");
			breadth = sc.nextInt();
		}
		@Override
		public void calcArea() {
			System.out.println("Area of Rectangle = " + length * breadth);	
		}
		@Override
		public void calculatePerimeter() {
			System.out.println("Perimeter of Rectangle = " + 2 * (length + breadth));
		}
	}
	public class practice {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Shape s = Shape.ShapeFactory(2);
			s.accept(sc);
			s.calcArea();
			s.calculatePerimeter();
		}
}
