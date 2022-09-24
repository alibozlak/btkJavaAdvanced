package springIntro;

// Çıplak Class kalmasın!
// Implement veya Extends olmalı. Yoksa bağımlılık oluyor.
// CustomerManager'ı da soyutlamamız lazım.
public class CustomerManager implements CustomerService {

    private CustomerDal customerDal;

    // Constructor Dependency Injection : (Engin hocanın tavsiyesi)
    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    // Setter Dependency Injection :
    // public void setCustomerDal(CustomerDal customerDal) {
    //     this.customerDal = customerDal;
    // }

    public void add() {
        // İş kuralları yazılır

        // OracleCustomerDal customerDal = new OracleCustomerDal();
        // customerDal.add();

        customerDal.add();
    }
}
