package pakage1;

import Services.BookService;
import enums.Domains;
import models.Book;
import Services.BookService;
import models.Client;

import java.sql.*;
import java.util.*;
import java.lang.*;


public class Test1 {
    public  static  void main(String[] args) throws SQLException, ClassNotFoundException {

        BookService book1 = new BookService("Ion Creanga", "SSS2", Domains.FIZICA);
       // book1.addBook();
        book1.searchBookByDomain();


//        book1.searchBookByTitle();
//        book1.searchBookByAuthor();
//        book1.deleteBookByTitle();


    }


}











