import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(7,8,9);
		List<Integer> list3 = Arrays.asList(10,11,12,13,14);
		
		List<List<Integer>> lists = Arrays.asList(list1, list2, list3);
		Function<List<?>,Integer> mapper = l -> l.size();
		Function<List<Integer>,Stream<Integer>> flatMapper = l -> l.stream();
		lists.stream()
				.flatMap(flatMapper)
				.forEach(System.out::println);
	}
}
