/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Văn Bảo
 */
public class User {

    private int id;
    private String fullname;
    private String username;
    private String password;
    private String birth_day;
    private String phonenumber;
    private String mail;
    private String address;
    private String status;

    public User() {
    }

    public User(int id, String fullname, String username, String password, String birth_day, String phonenumber, String mail, String address, String question_identity, String answer, String status) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.birth_day = birth_day;
        this.phonenumber = phonenumber;
        this.mail = mail;
        this.address = address;
        this.status = status;
    }

    public User(String username, String password) { 
        
    }

    public User(String fullname, String username, String password, String birth_day, String phonenumber, String mail, String address, String status) {
        
    }

    
    public User(int id, String username, String password, String phonenumber, String mail, String address, String status) {
        
    }

  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }
    

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }     

}


