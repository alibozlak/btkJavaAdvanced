package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements CustomerDal {
    
    @Value("${database.connectionString}")
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connection string : " + this.connectionString);
        System.out.println("MySQL veritabanına eklendi.");
    }
    
}
