import java.util.Scanner;

public class Ssum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		System.out.println("Enter the value for n1 - ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		System.out.println("Enter the value for n2 - ");
		n2 = sc.nextInt();
		System.out.println("The sum of n1 and n2 = " + (n1+n2));
		sc.close();
	}
}