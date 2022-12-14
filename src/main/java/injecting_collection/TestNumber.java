package injecting_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNumber {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("number.xml");
        Number number = (Number) context.getBean("number",Number.class);
        number.getNum();
    }
}
