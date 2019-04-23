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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?autoReconnect=true&useSSL=false", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }


    static ConnectionObject getInstance() {
        if (connectionObject == null)
            connectionObject = new ConnectionObject();

        return connectionObject;
    }
}




  /*  Connection connection = null;
    ArrayList<Client> clients = new ArrayList<Client>();

        try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?autoReconnect=true&useSSL=false","root", "");
        PreparedStatement statement =  connection.prepareStatement("select * from clients");
        ResultSet rs = statement.executeQuery();


        int numberOfClients = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("PersonID"));
            Book newBook = new Book(rs.getString("titlu"), rs.getString("autor"), Domains.fromValue(rs.getInt(3)), rs.getInt("ID"));

            numberOfClients++;
        }

        for(Client o:clients){

            System.out.println("LastName: " + o.getLastName() + "\nFirstName: " + o.getFirstName() + "\nAge: " + o.getAge() + "\nCNP: " + o.getCNP());
            System.out.println("\n");
            o.print();
        }


    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (
    SQLException e) {
        e.printStackTrace();
    }
*/

