package Service;

import com.online.restaurant.Customer;
public class CustomerService {

    private  void createDummyCustomers{
        for (int i= 0 ; i< 100 ;i++){
            Customer customer = new Customer();
            customer.setName(NameGenerator.getName());
            customer.setAddredd();
        }
    }
}
