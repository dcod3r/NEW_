import java.util.Scanner;

public class Assin1 {

	public static void main(String[] args) {
		double d1,d2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the D1 vlaue :");
		if(sc.hasNextDouble())
		{
			d1= sc.nextDouble();
			System.out.println("Enter the D2 vlaue :");
			if(sc.hasNextDouble())
			{
				d2 = sc.nextDouble();
				System.out.println("The sum of double values is "+(d1+d2)/2);
			}
			else 
			{
				System.out.println("NOT a Double Value");
			}
			
		}
		else
		{
			System.out.println("NOT a Double Value");
		}
		
		sc.close();
	}
}
