package Services;

import enums.Domains;
import models.Book;
import pakage1.ConnectionVariables;

import java.sql.*;

public class BookService  extends Book {

    public BookService(String author, String title, Domains domain) {
        super(author, title, domain);
    }

    public BookService() {
    }



    public void addBook() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());
        PreparedStatement statement = myConn.prepareStatement(addNewBook);

        statement.setString(1,this.getAuthor());
        statement.setString(2,this.getTitle());
        statement.setString(3, String.valueOf(this.getDomain()));

        int i = statement.executeUpdate();
        System.out.println(i + " book inserted");

        myConn.close();
    }

    public void deleteBookByTitle() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());

        PreparedStatement statement = myConn.prepareStatement(deleteBookByTitle);

        statement.setString(1, this.getTitle());

        int i = statement.executeUpdate();

        System.out.println(i + " books were deleted from the data base");

        myConn.close();
    }

    public void deleteBookByAuthor() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());

        PreparedStatement statement = myConn.prepareStatement(deleteBookByAuthor);

        statement.setString(1, this.getAuthor());

        int i = statement.executeUpdate();

        System.out.println(i + " books were deleted from the data base");

        myConn.close();
    }

    public void deleteBookByDomain() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());

        PreparedStatement statement = myConn.prepareStatement(deleteBookByTitle);

        statement.setString(1, String.valueOf(this.getDomain()));

        int i = statement.executeUpdate();

        System.out.println(i + " books were deleted from the data base");

        myConn.close();
    }

    public void searchBookByAuthor() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());
        PreparedStatement statement = myConn.prepareStatement(searchBookByAuthor);

        statement.setString(1,this.getAuthor());
        int i = 0;
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            i++;
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");

            System.out.println(i + ".0 was found");
        }

        myConn.close();
    }

    public void searchBookByTitle() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());
        PreparedStatement statement = myConn.prepareStatement(searchBookByTitle);

        statement.setString(1, this.getTitle());
        int i = 0;
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            i++;
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");

            System.out.println(i + " books were found");
        }
        myConn.close();
    }

    public void searchBookByDomain() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(ConnectionVariables.getURL(), ConnectionVariables.getUser(), ConnectionVariables.getPassword());
        PreparedStatement statement = myConn.prepareStatement(searchBookByDomain);

        statement.setString(1, String.valueOf(this.getDomain()));
        int i = 0;
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            i++;
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");

            System.out.println(i + " books were found");
        }
        myConn.close();
    }

}
