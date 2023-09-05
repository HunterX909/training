import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("src/person.txt");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("city"));
	}

}
