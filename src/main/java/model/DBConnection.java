package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static final String HOST = "127.0.0.1";
    static final String PORT = "3306";
    static final String DB_NAME = "school_db";
    static final String USER = "root";
    static final String PASSWORD = "admin";

    private static Connection connection ;

    public static Connection getConnection(){
        try{
           connection = DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/"+DB_NAME,USER,PASSWORD);
           System.out.println("Database Connected Successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

}
