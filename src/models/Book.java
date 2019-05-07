package models;
import java.lang.*;
import enums.Domains;
import pakage1.ConnectionVariables;
import pakage1.SqlQuerry2;
import pakage1.ConnectionObject;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static pakage1.SqlQuerry2.addNewBook;

public class Book implements SqlQuerry2 {
    private String title;
    private String author;
    private Domains domain;
   // private int ID;

    public Book() {
    }

    public Book(String author, String title, Domains domain) {
        this.author = author;
        this.title = title;
        this.domain = domain;
    }


    public Book(String title) {
        this.title = title;
    }


    public Book(Domains domain) {
        this.domain = domain;
    }



    //getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    //setters
    public void setAuthor(String author) {
        this.author = author;
    }


        public Domains getDomain() {
        return domain;
    }

    public void setDomain(Domains domain) {
        this.domain = domain;
    }

//   // public int getID() {
//        return ID;
//    }

//    public void setID(int ID) {
//        this.ID = ID;
//    }







}



