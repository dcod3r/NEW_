package Assignment_1_7;

import java.util.ArrayList;

public class FirstNonRepeatingElement {

	public static int firstNonRepeatingElement(ArrayList<Integer> arr)
	{
		int flag;
		for(int i = 0; i < arr.size(); i++)
		{
			flag = 0;
			for(int j=0; j<arr.size(); j++)
			{
				if(i != j && arr.get(i) == arr.get(j))
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				return arr.get(i);
		}
		return (Integer) null;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>() {{ 
								add(1);add(2); add(3)
								;add(-1); add(2);
								add(1); add(0); add(4);
								add(-1); add(7); add(8); }};
		System.out.println("Non Repeating Element = " + firstNonRepeatingElement(arr));
	}
}
