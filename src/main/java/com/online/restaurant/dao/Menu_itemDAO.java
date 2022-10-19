package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Menu_itemDAO
{
    public static final String TABLE_NAME = "app_Menu_item";


    public void createTable() {
        try {


             Statement stmt = con.createStatement();
            String sql = "Select *from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL,"
                    + "menu_item_name text,"
                    + "price decimal ,"
                    + "is_veg bool,"
                    + "vendor_id bigint,"
                    + "state text,"
                    + "CONSTRAINT app_Menu_item_pk PRIMARY KEY (id))";
            System.out.println("create table query " + query);
            stmt.executeUpdate(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

