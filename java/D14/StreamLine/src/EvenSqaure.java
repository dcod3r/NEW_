import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class EvenSqaure {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		Collections.addAll(l1, 1,2,3,4,5,6,7,8,9,10);
		
//		for(Integer i : l1) {
//			if( i%2 == 0)
//				System.out.print(i*i + " ");
//		}
		
		//Printing square of Even no. 1 to 10 using Stream;
		l1.stream().filter(e -> e%2 == 0).map(e -> e*e).forEach(System.out::println);
	}
}
