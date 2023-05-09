package course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
<<<<<<< HEAD
//        Java java= applicationContext.getBean("java", Java.class);
//        JS js=applicationContext.getBean("js", JS.class);
//        Course course= applicationContext.getBean("course", Course.class);

//        System.out.println(java);
//        System.out.println(js);
//        System.out.println(course);

        Course course=applicationContext.getBean("course", Course.class);
//        course.getPrgLangs();

        applicationContext.close();

=======
        Dancer dancer = applicationContext.getBean("dancer", Dancer.class);
        System.out.println(dancer);

        applicationContext.close();
>>>>>>> bf58fbf (Initial commit)
    }
}
