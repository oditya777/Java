package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Menu_itemDAO
{
    public static final String TABLE_NAME = "app_menu_item";

    private DAOService daoService;

    public Menu_itemDAO() {
        // Inside Constructor
        daoService = new DAOService();
    }

    public void createTable() {
        try {
            Connection con = daoService.getConnection();

            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL, "
                    + " vendor_id bigint ,"
                    + " menu_item_name text, "
                    + " price decimal, "
                    + " category text, "
                    + " is_veg bool , "
                    + " CONSTRAINT app_menu_item_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}