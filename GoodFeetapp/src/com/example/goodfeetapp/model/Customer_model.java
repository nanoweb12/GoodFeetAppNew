
package com.example.goodfeetapp.model; 
 
public class Customer_model {
     
    //private variables
    int _id;
    String _name;
    String _email;
     
    // Empty constructor
    public Customer_model(){
         
    }
    // constructor
    public Customer_model(int id, String name, String email){
        this._id = id;
        this._name = name;
        this._email = email;
    }
     
    // constructor
    public Customer_model(String name, String email){
        this._name = name;
        this._email = email;
    }
    // getting ID
    public int getID(){
        return this._id;
    }
     
    // setting id
    public void setID(int id){
        this._id = id;
    }
     
    // getting name
    public String getName(){
        return this._name;
    }
     
    // setting name
    public void setName(String name){
        this._name = name;
    }
     
    // getting phone number
    public String getemail(){
        return this._email;
    }
     
    // setting phone number
    public void setemail(String email){
        this._email = email;
    }
}