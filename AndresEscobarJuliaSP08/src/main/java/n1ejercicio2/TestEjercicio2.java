package n1ejercicio2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

public class TestEjercicio2 {
	// creating the stream of strings.
	private static Stream<String> getStream() {
		Stream<String> fruitesStream = Stream.of("mang 11", "graopes", "gaos","apple", "papaya", "jack fruit", "dragon fruit");
		return fruitesStream;

	}
	
	public TestEjercicio2() {
		// TODO Auto-generated constructor stub
	}
	
	
		public static void main(String[] args) {
			Predicate<String> noLetterOFilter = name -> name.contains("o");
			
			Predicate<String> nofruitWordFilter2 = name -> name.matches("[0-9]*[a-zA-Z]{5,}[0-9]*");
  
			// to remove the fruites with word "fruit" and with letter "o".
			List<String> result = getStream().filter(noLetterOFilter).filter(nofruitWordFilter2)
					.collect(Collectors.toList());

			// printing the final result
			System.out.println("Final result : " + result);
			
			
		}
		
		
}
