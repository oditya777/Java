package com.online.restaurant.dao;

import com.online.restaurant.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";
private  DAOService daoService ;
public CustomerDAO(){
    daoService = new DAOService();
}

    public  void  insertCustomer(Customer customer) {
        try {
            Connection con = daoService.getConnection();
            String sql = "INSERT INTO " + TABLE_NAME
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1,customer.getCustomerID());
            ps.setString(2,customer.getName());
            ps.setString(3,customer.getCity());
            ps.setString(4,customer.getAddredd());
            ps.setLong(5,customer.getPhone());
            ps.setString(6,customer.getState());
            ps.setString(7,customer.getEmail());
            ps.executeUpdate();
            con.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void createTable() {
        try {


          Connection con = daoService.getConnection();
            Statement stmt = con.createStatement();
            String sql = "Select *from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL,"
                    + "name text,"
                    + " city text,"
                    + "address text,"
                    + "phone bigint,"
                    + "state text,"
                    + "email text,"
                    + "CONSTRAINT app_customer_pk PRIMARY KEY (id))";
            System.out.println("create table query " + query);
            stmt.executeUpdate(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

