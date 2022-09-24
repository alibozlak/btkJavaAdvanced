package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Intro
 */
public class App {

    // IoC : Inversion of Control
    // Tasarım Deseninin Adı : Dependency Injection (DI)

    // Önemli olan Değişime Direnç Göstermeyen Kodlama yapmak...

    // Yazılım : İnsanların gündelik hayattaki aktivitelerinin bilgisiyar destekli sistemlerle kolaylaştırılması.
    // İnsanların ihtiyaçları iyileşiyor...

    // if bloklarıyla Spagetti Kod oluşturmamalıyız.
    // IoC ile Birbirinin alternatifi olan işleri yönetiyoruz :
    // Birbirinin alternatifi olan işleri ayrı classlarda yazıyoruz.

    // SOLID'in O prensibi :
    // Yeni bir özellik ekleneceğinde mevcuttaki hiçbir koda dokunamazsın.

    public static void main(String[] args) {
        System.out.println();

        ClassPathXmlApplicationContext context 
        = new ClassPathXmlApplicationContext("applicationContext.xml");

        // CustomerManager customerManager = new CustomerManager();
        // customerManager.add();

        // Interface kendisini implemente eden classların referansını tutabiliyor :
        
        // CustomerManager customerManager 
        // = new CustomerManager(context.getBean("database",CustomerDal.class));
        // customerManager.add();

        CustomerService customerService 
        = context.getBean("service",CustomerService.class);
        customerService.add();
        
        context.close();
    }
}
