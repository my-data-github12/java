package question6;
import java.util.Scanner;
import java.util.stream.Stream;


public class Factorial {
public static void main(String[]args) {
	
	int num =6;
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1)
				.limit(num);
		Integer fact = strm.reduce(1, (a,e) -> a * e);
		System.out.println("Sum : " + fact);
	}
}

