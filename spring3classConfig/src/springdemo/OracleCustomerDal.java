package springdemo;

public class OracleCustomerDal implements CustomerDal {
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add() {
        System.out.println("Connection string : " + this.connectionString);
        System.out.println("Oracle veritabanına eklendi.");
    }
}
