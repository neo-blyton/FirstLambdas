import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CollectorsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<>();
		try{
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(CollectorsSample.class.getResourceAsStream("people.txt")));
			
			Stream<String> stream = reader.lines();
			
			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(Integer.parseInt(s[1]),s[0]);
				persons.add(p);
				return p;
			}).forEach(System.out::println);;
			
			Stream<Person> streamP = persons.stream();
			Optional<Person> opt = streamP.filter(p -> p.getAge() >= 10)
			.min(Comparator.comparing(Person::getAge));
			System.out.println(opt);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
