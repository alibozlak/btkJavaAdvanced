package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:values.properties")
public class IocConfig {
    
    @Bean
    public CustomerDal database() {
        return new OracleCustomerDal();
    }

    @Bean
    public CustomerService service() {
        return new CustomerManager(database());
    }

}
