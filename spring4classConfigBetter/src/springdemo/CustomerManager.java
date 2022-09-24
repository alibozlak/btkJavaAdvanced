package springdemo;

public class CustomerManager implements CustomerService {

    private CustomerDal customerDal;

    // Constructor Dependency Injection :
    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    @Override
    public void add() {
        // Business codes here ..
        System.out.println("Working business codes");
        customerDal.add();
    }
    
}
