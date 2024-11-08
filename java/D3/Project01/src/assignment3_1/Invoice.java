package assignment3_1;

import java.util.Scanner;

public class Invoice {
    private String partno;
    private String partdesc;
    private int qty;
    private double pprice;
    
    public Invoice() {
    	this("0","0",0,0);
	}

	public Invoice(String partno, String partdesc, int qty, double pprice) {
		super();
		this.partno = partno;
		this.partdesc = partdesc;
		if(qty < 0)
			this.qty = 0;
		else
			this.qty = qty;
		if(pprice < 0)
			this.pprice= 0;
		else
			this.pprice = pprice;
	}
    
	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}
	public void setPartno(String partno) {
		this.partno = partno;
	}
	public void setPprice(double pprice) {
		if(pprice < 0)
			this.pprice = 0;
		else
			this.pprice = pprice;
	}
	public void setQty(int qty) {
		if (qty < 0)
			this.qty = 0; 
		else
			this.qty = qty; 
	}
	public String getPartdesc() {
		return partdesc;
	}
	public String getPartno() {
		return partno;
	}
	public double getPprice() {
		return pprice;
	}
	public int getQty() {
		return qty;
	}
	public double getInvoiceAmount() {
        return qty * pprice;
	}
	public void acceptData()
	{	
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter the part no");
		partno = sc.next();
		System.out.println("Enter the part desc");
		partdesc = sc.next();
		System.out.println("Enter the qty");
		setQty(sc.nextInt());
		System.out.println("Enter the per price");
		setPprice(sc.nextDouble());
	}
	
	public void displayData()
	{
		System.out.println("Part no = "+ partno);
		System.out.println("Part desc = "+ getPartdesc());
		System.out.println("The qty is " + qty);
		System.out.println("Per piece price = "+ getPprice());
		System.out.println("Invoice amount = "+ getInvoiceAmount());
	}
}
