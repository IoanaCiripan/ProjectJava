package models;

import java.util.ArrayList;
import java.lang.*;

public class Client {
   private String firstName;
   private String lastName;
   private int age;
   private String CNP;
 


   public Client(){};

   public Client(String firstNAme, String lastName, int age, String CNP){
       this.firstName = firstNAme;
       this.lastName = lastName;
       this.age = age;
       this.CNP = CNP;
   }

    public void print(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.CNP);
    }

   //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCNP() {
        return CNP;
    }

    //setters
    public void setFirstNAme(String firstNAme) {
        this.firstName = firstNAme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }


}
