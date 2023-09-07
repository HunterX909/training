package ax7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ax7.MessageProcessor;

public class TestMessageProcessor {
	
	@Test
	public void testProcess() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
		mp.process("sms", "98098765", "howdy");
		mp.process("whatsApp", "98098765", "whatsapped");
		mp.process("email", "@Tarun567", "mailed");
	}

}
