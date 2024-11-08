package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		System.out.println("Enter the value of X and Y for Point P1");
		p1.setX(sc.nextInt());
		p1.setY(sc.nextInt());
		
		System.out.println("Enter the value of X and Y for Point P2");
		p2.setX(sc.nextInt());
		p2.setY(sc.nextInt());
		
		System.out.println("P1 = " + p1.getDetails());
		System.out.println("P2 = " + p2.getDetails());
		
		if(p1.isEqual(p2))
			System.out.println("The points are Same\n");
		else
			System.out.println("The distance between P1 and P2 is : " + p1.calculateDistance(p2));
//		Point2D p1 = new Point2D(2,3);
//		Point2D p2 = new Point2D(2,3);
//		Point2D p3 = new Point2D(5,3);
//		
//		System.out.println("P1 = " + p1.getDetails());
//		System.out.println("P2 = " + p2.getDetails());
//		System.out.println("P3 = " + p3.getDetails());
//		
//		if(p1.isEqual(p2))
//			System.out.println("Same Point");
//		else {
//			System.out.println("The distance between points P1 and P2 is : " + p1.calculateDistance(p2));
//		}
//		if(p1.isEqual(p3))
//			System.out.println("Same Point");
//		else {
//			System.out.println("The distance between points P1 and P3 is : " + p1.calculateDistance(p3));
//		}
		sc.close();
	}
}
