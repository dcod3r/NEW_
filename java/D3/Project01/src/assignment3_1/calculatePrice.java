package assignment3_1;

public class calculatePrice {

	public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "Hammer", 10, 15.99);
        Invoice invoice2 = new Invoice("5678", "Nails", -5, -1.50); // Invalid values to test validation

        Invoice invoice3 = new Invoice();	//creating a reference of Invoice 
        //taking input from user
        invoice3.acceptData();
        
        //Display the invoice details for invoice1
        invoice1.displayData();
        // Display the invoice details for invoice2
        invoice2.displayData();
        // Display the invoice details for invoice3
        invoice3.displayData();   
	}
}
