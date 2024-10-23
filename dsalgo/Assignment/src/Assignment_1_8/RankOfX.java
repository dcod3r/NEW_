package Assignment_1_8;

import java.util.Scanner;
import java.util.stream.Stream;

public class RankOfX {

	public static void main(String[] args) {
		
//		ArrayList<Integer> arr = new ArrayList<Integer>()
//				{{	add(10);	add(20);	add(15);
//					add(3);		add(4);		add(4);	add(1);
//				}};
			
		Stream<Integer> str = Stream.of( 10, 20, 15, 3, 4, 4, 1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rank");
		int x = sc.nextInt();
		str.filter(arr -> arr <= x).forEach(y -> System.out.print(y + " "));
	}
}
