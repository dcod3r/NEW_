package com.app.car;

public class CarPooling {
	private int totalMilesPerDay;
	private int costPerGallonOfGasoline;
	private int averageMilesPerGallon;
	private int parkingFees;
	private int tollsPerDay;
	private int numberOfPeople;
	
	public CarPooling() {
		this(0,0,0,0,0);
	}
	public CarPooling(int totalMilesPerDay, int costPerGallonOfGasoline, int averageMilesPerGallon, int parkingFees,
			int tollsPerDay) {
		super();
		this.totalMilesPerDay = totalMilesPerDay;
		this.costPerGallonOfGasoline = costPerGallonOfGasoline;
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.parkingFees = parkingFees;
		this.tollsPerDay = tollsPerDay;
	}
	public int getTotalMilesPerDay() {
		return totalMilesPerDay;
	}
	public void setTotalMilesPerDay(int totalMilesPerDay) {
		this.totalMilesPerDay = totalMilesPerDay;
	}
	public int getCostPerGallonOfGasoline() {
		return costPerGallonOfGasoline;
	}
	public void setCostPerGallonOfGasoline(int costPerGallonOfGasoline) {
		this.costPerGallonOfGasoline = costPerGallonOfGasoline;
	}
	public int getAverageMilesPerGallon() {
		return averageMilesPerGallon;
	}
	public void setAverageMilesPerGallon(int averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}
	public int getParkingFees() {
		return parkingFees;
	}
	public void setParkingFees(int parkingFees) {
		this.parkingFees = parkingFees;
	}
	public int getTollsPerDay() {
		return tollsPerDay;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public void setTollsPerDay(int tollsPerDay) {
		this.tollsPerDay = tollsPerDay;
	}
	public double Total()
	{
		return (tollsPerDay + parkingFees + (totalMilesPerDay / averageMilesPerGallon) * costPerGallonOfGasoline);
	}
	public double PoolingCost()
	{
		return ((tollsPerDay + parkingFees + (totalMilesPerDay / averageMilesPerGallon) * costPerGallonOfGasoline)/numberOfPeople);
	}
}
