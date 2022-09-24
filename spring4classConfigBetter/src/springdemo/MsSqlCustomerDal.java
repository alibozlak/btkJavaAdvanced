package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDal implements CustomerDal {

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
        System.out.println("MsSQL veritabanına eklendi.");
    }
    
}
