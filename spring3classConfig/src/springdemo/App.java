package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 3 : Class Config
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        AnnotationConfigApplicationContext context 
        = new AnnotationConfigApplicationContext(IocConfig.class);

        CustomerDal customerDal = context.getBean("database", CustomerDal.class);
        customerDal.add();

        context.close();
    
    }
}
