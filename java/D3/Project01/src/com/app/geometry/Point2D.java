package com.app.geometry;

import java.lang.Math;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D()
	{
		this(0,0);
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails()
	{
		String ans = "(" + x + " , " + y + ")";
		return ans ;
	}
	public boolean isEqual(Point2D p2)
	{
		if(x == p2.x && y == p2.y)
			return true;
		return false;
	}
	public double calculateDistance(Point2D p2)
	{
//		double ans = 0;
//		if(x == p2.x && y == p2.y)
//			return ans;
		 return Math.sqrt(Math.pow((p2.x - x),2) + Math.pow((p2.y - y), 2));
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
