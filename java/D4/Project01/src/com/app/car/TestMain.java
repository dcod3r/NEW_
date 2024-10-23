package com.app.car;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		CarPooling user1 = new CarPooling();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total Miles Travelled Per Day");
		user1.setTotalMilesPerDay(sc.nextInt());
		
		System.out.println("Enter Cost Per Gallon of Gasoline");
		user1.setCostPerGallonOfGasoline(sc.nextInt());
		
		System.out.println("Enter Average Miles Per Gallon");
		user1.setAverageMilesPerGallon(sc.nextInt());
		
		System.out.println("Enter The Parking Fees");
		user1.setParkingFees(sc.nextInt());
		
		System.out.println("Enter Tolls Per Day");
		user1.setTollsPerDay(sc.nextInt());
		
		System.out.println("Enter the Number of Persons ");
		user1.setNumberOfPeople(sc.nextInt());
		
		System.out.println("Total Cost = " + user1.Total());
		
		System.out.println("Pooling Cost = " + user1.PoolingCost());
	}
}
