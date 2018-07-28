import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("one", "two", "three", "four", "five");
		
		Predicate<String> p1 = s -> s.length() % 2 != 0;
		Predicate<String> p2 = s -> s.length() % 2 == 0;
		
		strings.filter(p1.and(p2) )
				.forEach(System.out::println);
	}
}
