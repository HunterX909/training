package ax6;

//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("temp")
public class TemperatureConverter {
	
	public int ctof(int c) {
		int f = (c * 9/5) +32;
		System.out.println(c + " celcius to fahrenheit is " + f);
		return f;
	}
	public int ftoc(int f) {
		int c = (f-32)*5/9;
		System.out.println(f + " fahrenheit to celcius is " + c);
		return c;
	}
}
