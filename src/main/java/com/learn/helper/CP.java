package com.learn.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    private static Connection con=null;

    public static Connection getCon()
    {
        try {

            if(con!=null)
                return con;

            Class.forName("com.mysql.cj.jdbc.Driver");

            String userName = "root";
            String pwd = "arindam";
            String url = "jdbc:mysql://localhost:3306/CHANDANA_HOTEL_AND_LODGING";

            con = DriverManager.getConnection(url, userName, pwd);

        }
        catch (Exception e){
            e.printStackTrace();
            return con;
        }
        return con;
    }
}
