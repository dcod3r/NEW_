
public class RecFact {

	public static int fact(int n)
	{
		System.out.println("Anupam");
		if(n == 0)
			return 1;
		//System.out.println("Anupam");
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		int n = 3;
		fact(n);
	}
}