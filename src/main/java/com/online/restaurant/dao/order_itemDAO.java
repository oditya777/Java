package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class order_itemDAO {
    public static final String TABLE_NAME = "app_vendor";


    public void createTable() {
        try {



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
                    + "CONSTRAINT app_order_item_pk PRIMARY KEY (id))";
            System.out.println("create table query " + query);
            stmt.executeUpdate(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

