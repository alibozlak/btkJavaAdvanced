package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 2 : IoC Annotation Bazlı Injection
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        ClassPathXmlApplicationContext context 
        = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerDal customerDal = context.getBean("database", CustomerDal.class);
        customerDal.add();

        context.close();
    
    }
}
