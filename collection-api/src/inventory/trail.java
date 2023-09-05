package inventory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class trail {

	private List<Product> products;
	
	public  trail() throws IOException {
		products = new ArrayList<Product>();
		
		try(Stream<String> lines = Files.lines(Paths.get("src/products.txt"))){
			products = lines.map(l -> {
				String[] record = l.split(",");
				return new Product(Integer.parseInt(record[0]), record[1], Double.parseDouble(record[2]));
			}).collect(Collectors.toList());
		}
		
		
	}
}
