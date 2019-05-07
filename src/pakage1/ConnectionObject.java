package pakage1;

import enums.Domains;
import models.Book;
import models.Client;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionObject {
    private static ConnectionObject connectionObject = null;
    Connection connection;

    private ConnectionObject() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-eap?autoReconnect=true&useSSL=false", "root", "");
            System.out.println("Connection twerks");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}

//
//    static ConnectionObject getInstance() {
//        if (connectionObject == null)
//            connectionObject = new ConnectionObject();
//
//        return connectionObject;
//    }
//}
//



