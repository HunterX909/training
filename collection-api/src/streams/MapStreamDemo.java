package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamDemo {

	public static void main(String[] args) {

		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Miller", "Mumbai");
		people.put("Dean", "Delhi");
		
//		people.keySet().stream().forEach(System.out::println);
		
		List<String> cities = people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());
		
		cities.forEach(System.out::println);
		
        List<String> peoples = people.keySet().stream().map(c -> c.toLowerCase()).sorted().collect(Collectors.toList());
		
		peoples.forEach(System.out::println);
	}

}
