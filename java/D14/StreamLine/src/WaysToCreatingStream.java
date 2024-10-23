import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class WaysToCreatingStream {

	public static void main(String[] args) {
		
		Collection<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
		}};
		
		//Type 1 : Using stream() menthod()
		System.out.println("\nType 1: Using stream() menthod()");
		list.stream().forEach(e -> System.out.print(e + " "));
		
		//Type 2 : Using Stream.of(T ... values);
		System.out.println("\nType 2 : Using Stream.of(T ... values);");
		Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(e -> System.out.print(e + " "));
		
		//Type 3 : Using Generate = generate(Supplier<T> s)
		System.out.println("\nGenertae generate(Supplier<T> s)");
		Stream.generate(() -> Math.random()).limit(2).forEach(e-> System.out.print(e + " "));
		
		//Type 4 : Using Iterator	;
		System.out.println("\nType 4\nUsing Iterate ,,, iterate(T seed, UnaryOperator<T> f)");
		Stream<Integer> S1 = Stream.iterate(1, i -> i+i).limit(10);
		S1.forEach(e -> System.out.print(e + " "));
	}
}
