
package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc)
	{
		
		System.out.println("0 . Exit ");
		System.out.println("1 . ADD MANGO ");
		System.out.println("2 . ADD ORANGE ");
		System.out.println("3 . ADD APPLE ");
		System.out.println("4 . DISPLAY NAMES OF ALL FRUITS IN BASKET ");
		System.out.println("5 . DISPLAY EVERYTHING IN BASKET ");
		System.out.println("6 . DISPLAY TASTE OF ALL STALE FRUITS INT THE BASKET ");
		System.out.println("7 . MARK A FRUIT AS STALE ");
		System.out.println("8 . MARKS ALL SOUR FRUIT STALE\n ");
		System.out.println("Enter your Choice");
		
		int choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		System.out.print("Enter the Size of the Basket : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String clr;
		double w;
		boolean fi;
		Fruits[] basket = new Fruits[size];
		int choice;
		int count = 0;
		do  
		{
			choice = menu(sc);
			switch(choice)
			{
			case 0:
				System.out.println("Exiting...................");
				System.exit(1);
			break;
			case 1:
				System.out.println("\ntest");
				clr = sc.next();
				w = sc.nextDouble();
				fi = true;
				basket[count++] = new Mango(clr, w, fi);
				
//				basket[count-1].accept(sc);
			break;
			case 2: 
				System.out.println();
				basket[count++] = new Orange();
				basket[count-1].accept(sc);
			break;
			case 3: 
				System.out.println();
				basket[count++] = new Apple();
				basket[count-1].accept(sc);
			break;
			case 4:
				System.out.println("\nAll the basket list is");
				//if(basket[0].getName() == null)
				for(Fruits f : basket)
					if(f!=null)
						System.out.println(f.getName());	
			break;
			case 5:
				System.out.println("\nAll Stale fruits");
				for(Fruits f : basket)
					if(f!=null && f.isFresh() == true)
						System.out.println(f.toString());
			break;
			case 6: 
				System.out.println("\nAll Stale fruits");
				for(Fruits f : basket)
					if(f!=null && f.isFresh() == false)
						System.out.println(f.toString());
			break;
			case 7:
				System.out.println("\nMark a Friut as Stale");
				int index = sc.nextInt();
				if(basket[index] != null)
					basket[index].setFresh(false);
				else
					System.out.println("(in case of invalid index");
			break;
			case 8: 
				for(int i = 0; i < basket.length; i++)
					if(basket[i]!=null && basket[i].taste().equals("sour"))
						basket[i].setFresh(false);
			break;
			default : 
				System.out.println("ENTER A VALID CHOICE");
			}
			
		}while (choice >= 0);
	}
}
