package course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dancer dancer = applicationContext.getBean("dancer", Dancer.class);
        System.out.println(dancer);
        applicationContext.close();
    }
}
