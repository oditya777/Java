package app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.sql.SQLOutput;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer oditya = new Customer();

        oditya.setName("oditya");
        oditya.setCity("Nagpure");
        oditya.setAddredd("New Nandanwan, Nagpure");
        oditya.setState("Maharastre");
        oditya.setEmail("odityakatre12@gmail.com");
        oditya.setPhone(9823373248L);

        System.out.println("customer detailed");
        System.out.println("Name :" + oditya.getName());
        System.out.println("City :" + oditya.getCity());
        System.out.println("Address :" + oditya.getAddredd());
        System.out.println("State :" + oditya.getState());
        System.out.println("Email Id :" + oditya.getEmail());
        System.out.println("Phone :" + oditya.getPhone());



        Vendor haldiram= new Vendor();
        haldiram.setName("Haldiram Veg Restraurant");
        haldiram.setAddresss("Ajni square, nagpure");
        haldiram.setCategory("veg");
        haldiram.setRating(5.0);
        haldiram.setCity("nagpure");
        haldiram.setState("Maharastra");
        haldiram.setPhone(67496);

        System.out.println("Vender detail");
        System.out.println("Name :" + haldiram.getName());
        System.out.println("address :" + haldiram.getAddresss());
        System.out.println("category :" + haldiram.getCategory());
        System.out.println("Phone  :" + haldiram.getPhone());
        System.out.println("Rating :" + haldiram.getRating());
        System.out.println("State :" + haldiram.getState());
        System.out.println("City :" + haldiram.getCity());



        Order order= new Order();
        order.setOrderdate(new Date());
        order.setAmount(999.00);
        order.setDelivery_add("101,civil lines, nagpure");
        order.setVendor(haldiram);
        order.setCustomer(oditya);


        System.out.println("order detailed");
        System.out.println("Amount :" + order.getAmount());
        System.out.println("order date:" + order.getOrderdate());
        System.out.println("Address :" + order.getDelivery_add());




    }
}
