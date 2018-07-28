import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> sum = list1.stream().reduce(Integer::sum);
		System.out.println(sum);
	}
}
