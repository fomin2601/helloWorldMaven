package sut.ist012m.Fomin.Lab1_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab1SpringApplication {
    public static void main(String[] argv) {
        ApplicationContext appCont = SpringApplication.run(Lab1SpringApplication.class, argv);
        HelloWorld message = (HelloWorld) appCont.getBean("helloWorld");
        message.main();
    }
}
