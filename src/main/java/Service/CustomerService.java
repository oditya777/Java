package Service;

import com.online.restaurant.Customer;
import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.utils.AddressGenerator;
import com.online.restaurant.utils.EmailIdGenerator;
import com.online.restaurant.utils.NameGenerator;
import com.online.restaurant.utils.PhoneNumberGenerator;

public class CustomerService {
private CustomerDAO customerDAO;
public CustomerService (){

}
    public void createDummyCustomers(){
        for(int i = 0; i < 100; i++){
            Customer customer = new Customer();
            customer.setCustomerID(i + 1);
            customer.setName(NameGenerator.getName());
            customer.setAddredd(AddressGenerator.getAddress());
            customer.setEmail(EmailIdGenerator.
                    getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setState("Maharashtra");
            customer.setPhone(PhoneNumberGenerator.getPhoneNumber());
            //TODO: Insert Customer into Database


            customerDAO.insertCustomer(customer);

            System.out.println(" Customer Details: ");
            System.out.println("Name : " + customer.getName());
            System.out.println("City : " + customer.getCity());
            System.out.println("Address : " + customer.getAddredd());
            System.out.println("State : "+ customer.getState());
            System.out.println("Email Id : " + customer.getEmail());
            System.out.println("Phone : " + customer.getPhone());
        }
    }
}