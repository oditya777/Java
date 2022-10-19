package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";


    public void createTable() {
        try {


            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "pass123");
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

