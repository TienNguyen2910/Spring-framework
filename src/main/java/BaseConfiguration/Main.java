package BaseConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloWorld hello = (HelloWorld) context.getBean(HelloWorld.class);
        hello.setMessage("Hello everyone. I'm Tien");
        hello.getMessage();
    }
}
