package app;

import Service.CustomerService;
import com.online.restaurant.dao.Menu_itemDAO;
import com.online.restaurant.dao.vendorDAO;
import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.dao.orderDAO;

public class Application
{
    public static void main(String[] args) {


        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();

        vendorDAO vendorDAO = new vendorDAO();
        vendorDAO.createTable();

        orderDAO orderDAO = new orderDAO();
        orderDAO.createTable();

        Menu_itemDAO menuItemDAO = new Menu_itemDAO();
        menuItemDAO.createTable();


        CustomerService cs = new CustomerService();
        cs.createDummyCustomers();

    }



    }

