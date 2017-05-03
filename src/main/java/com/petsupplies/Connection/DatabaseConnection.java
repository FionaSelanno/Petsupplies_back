package com.petsupplies.Connection;

/**
 * Created by FSELANNO on 2-5-2017.
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) throws Exception {
        getConnection();

    }

    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url= "jdbc:mysql://localhost:3306/petsupplies?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "123admin";
            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        } catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        return null;

    }
}
