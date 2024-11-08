import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

public class StreamOpertaions {

	public static void main(String[] args) {
		
		//Using Stream.of(); for creating Stream object
		System.out.println("s1");
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		s1.forEach(s -> System.out.print(s + " ")); //forEach use for Printing
		
		//Filtering Even nos. in Stream
		System.out.println("\n\ns2\nFlitering even");
		Stream<Integer> s2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		s2.filter(e -> e%2 == 0).forEach(e -> System.out.print(e + " "));
		
		//count() is use to count() the no of elements in the stream
		System.out.println("\n\ns3");
		Stream<Integer> s3 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("The number of Elements in Steam = " + s3.count());
		
		//Printing Distinct values
		System.out.println("\ns4\nPrinting Distinct values");
		Stream<Integer> s4 = Stream.of(7, 3, 5, 7, 5, 2, 1, 4, 1);
		s4.distinct().forEachOrdered(e -> System.out.print(e + " "));
		
		//Created Anonymous class and applied stream() operation on it
		System.out.println("\n\ns5");
		System.out.println("Anonymous Class, Limited only 3 values");
		new ArrayList<Integer>(){{
	        add(9);
	        add(10);
	        add(11);
	        add(12);
	        add(13);
	           }}.stream().limit(3).forEach(e -> System.out.print(e + " "));
	           
	   System.out.println("\n\ns6");
	   System.out.println("using asList of Arrays Helper Class");
	   System.out.println("Skipped first 4 element from Array "
	   		+ "");
	   ArrayList<Integer> s6 = new ArrayList<Integer>(Arrays.asList
			   (1,2,3,4,5,6,7,8,9,10));
	   s6.stream().skip(4).forEach(e -> System.out.print(e + " "));
	   
	   System.out.println("\n\ns7");
	   System.out.println("Skipping first 4 and prinitng only 5 values ");
	   Stream<Integer> s7 = Stream.of(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);
	   s7.skip(4).limit(5).forEach(e -> System.out.print(e + " "));
	}

}
