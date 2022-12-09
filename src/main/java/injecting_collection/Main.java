package injecting_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
        JavaController jc = (JavaController) context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressPro();
    }
}
