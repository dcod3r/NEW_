import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer Value : ");
		int n1 = sc.nextInt();
		
		String b1 = Integer.toBinaryString(n1);
		System.out.println("\nThe Binary value of "+ n1 + " is : "+ b1);
		
		String o1 = Integer.toOctalString(n1);
		System.out.println("The Octal value of "+ n1 + " is : "+ o1);
		
		String h1 = Integer.toHexString(n1);
		System.out.println("The Hexal value of "+ n1 + " is : "+ h1);
		
		sc.close();
	}
}
