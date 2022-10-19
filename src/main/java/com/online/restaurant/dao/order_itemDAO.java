package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class customer_orderDAO {
    public static final String TABLE_NAME = "app_vendor";


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
                    + "rating decimal ,"
                    + "address text,"
                    + "pure_veg bool,"
                    + "phone bigint,"
                    + "state text,"
                    + "category text,"
                    + "email text,"
                    + "CONSTRAINT app_vendor_pk PRIMARY KEY (id))";
            System.out.println("create table query " + query);
            stmt.executeUpdate(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

