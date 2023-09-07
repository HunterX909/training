package ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

    @Test
    public void testMessage() {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx.xml");

        // Corrected variable declarations with semicolons
        Hello h = (Hello) appCtx.getBean("hi");
//        Hello h2 = appCtx.getBean("hi", Hello.class);
//        Hello h3 = appCtx.getBean(Hello.class);

        System.out.println("Message: " + h.getMessage());
    }
}
