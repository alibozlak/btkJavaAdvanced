package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 3 : Class Config-2 (Better Way)
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        AnnotationConfigApplicationContext context 
        = new AnnotationConfigApplicationContext(IocConfig.class);

        // CustomerDal customerDal = context.getBean("database", CustomerDal.class);
        // customerDal.add();

        CustomerService customerService = context.getBean("service", CustomerService.class);
        customerService.add();

        context.close();
    
    }
}
