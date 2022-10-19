package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOService {

    public Connection getconnection(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "pass123");
            return con;

        }catch (Exception ex)
        {
            ex.printStackTrace();
        } return null;
    }
}
