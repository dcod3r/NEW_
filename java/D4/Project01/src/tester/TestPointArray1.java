package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
static int  menu() {
	int choice;
	System.out.println("1. Display Details of Specific Point");
	System.out.println("2. Display x|y Co-ordinates of All Points");
	System.out.println("3. Input Two Point to calc distance...");
	System.out.println("4 Exit......");
	System.out.println("Enter YOUR CHOICE");
	Scanner sc = new Scanner(System.in);
	choice = sc.nextInt();
	return choice;
}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points");
		
		Point2D[] points = new Point2D[sc.nextInt()];
		
		//taking points input
		for(int i=0; i < points.length; i++)
		{
			System.out.print("Enter the X value for Point[" + i + "] :" );
			points[i]= new Point2D();
			points[i].setX(sc.nextInt());
			System.out.print("Enter the Y value for Point[" + i + "] :" );
			points[i].setY(sc.nextInt());
		}
		int choice;
		do {
			choice = menu();
			switch(choice)
			{
				case 1:
					System.out.println("Enter point to be displayed");
					int n = sc.nextInt();
					if(n >=0 && n < points.length)
						System.out.println("Point[" + n + "] = " + points[n].getDetails());
					else
						System.out.println("Enter the VALID INDEX");
					break;
				case 2:
					//display points
					for(int i = 0; i < points.length; i++)
					{
						System.out.println("Point[" + i + "] = " + points[i].getDetails());
					}
					break;
				case 3:
					System.out.println("Enter the Indexes");
					int index1 = sc.nextInt();
					int index2 = sc.nextInt();
					if(index1 >= 0 && index1 < points.length && index2 >= 0 && index2 < points.length) {
						if(points[index1].isEqual(points[index2]))
							System.out.println("SAME POINT");
						else	
							System.out.println(points[index1].calculateDistance(points[index2]));
					}
				  	else 
						System.out.println("ExceptionForArrayOutOfBound");
					break;
				case 4:
					System.out.println("BYE-BYE");
					System.exit(1);
					break;
				default :
					System.out.println("Enter the Valid Choice");
			}
		}while(choice != 0);
		sc.close();
	}
}
