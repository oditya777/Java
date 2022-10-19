package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";
private  DAOService daoService ;
public CustomerDAO(){
    daoService = new DAOService();
}
    public void createTable() {
        try {


          connection con = daoService.getconnection();
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

