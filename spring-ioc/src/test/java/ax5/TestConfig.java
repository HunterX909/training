package ax5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	@Test
	public void testExchange() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ExchangeConfig.class);
		
		ExchangeServices service  = (ExchangeServices) appCtx.getBean("xe");
		
		service.conversion();
	}
}
