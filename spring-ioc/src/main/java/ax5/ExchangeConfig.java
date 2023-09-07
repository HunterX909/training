package ax5;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

	public ExchangeServices set() {
		System.out.println("ExcahngeSerive Object Requested");
		return new ExchangeServices();
	}
}
