import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int ans = 0; 
		do
		{
			choice = menu();
			
			switch (choice)
			{
				case 0:
					System.out.println("You Order is Cancelled\n");
					System.exit(1);
					break;
				case 1:
					System.out.println("Enter the Quantity");
					int qty = sc.nextInt();
					ans = ans + qty*70;
					break;
				case 2:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*15;
					break;
				case 3:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*10;
					break;
				case 4:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*50;
					break;
				case 5:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*60;
					break;
				case 6:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*30;
					break;
				case 7:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*35;
					break;
				case 8:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*40;
					break;
				case 9:
					System.out.println("Enter the Quantity");
					qty = sc.nextInt();
					ans = ans + qty*20;
					break;
				case 10:
					System.out.println("The total amount is "+ ans);
					System.out.println("Do You Want to Add more????");
					System.out.println("Yes = 1");
					System.out.println("No = 0");
					int flag = sc.nextInt();
					if(flag == 0) {
						System.out.println("Thankyou :)......");
						System.exit(0);
					}
					break;
				default :
					System.out.println("Enter VALID input\n");
					break;
			}
			
		}while(choice >=0);
		
		sc.close();
	}
	 static int menu()
		{
		 	Scanner sc = new Scanner(System.in);

			System.out.println("Select 0 for Cancel the Order ");
			System.out.println("Select 1) Dosa - ₹70 Per pc");
			System.out.println("Select 2) Samosa - ₹15 Per pc");
			System.out.println("Select 3) Idli - ₹10 Per pc");
			System.out.println("Select 4) Masala Rice - ₹50 Per plate");
			System.out.println("Select 5) MOMO - ₹60 Per plate");
			System.out.println("Select 6) Poha - ₹30 Per plate");
			System.out.println("Select 7) Utappam - ₹35 Per plate");
			System.out.println("Select 8) Sabudalan - ₹40 Per plate");
			System.out.println("Select 9) Bread Pakoda - ₹20 Per pc");
			System.out.println("Select 10) Generate Bill..............");
			System.out.println("Enter Your Choice \n");
			int choice = sc.nextInt();
			return choice; 
		}
}
