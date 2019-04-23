package models;

import enums.Domains;

public class Book {
    private String title;
    private String author;
    private Domains domain;
    private int ID;

    public Book(){};

    public Book(String title, String author, Domains domain, int ID) {
        this.title = title;
        this.author = author;
        this.domain = domain;
        this.ID = ID;

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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}



