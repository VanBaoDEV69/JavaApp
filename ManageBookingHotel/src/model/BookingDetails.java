/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Văn Bảo
 */
public class BookingDetails {
    String fullname_client;
    String phone_number;
    String mail;
    int room_number;
    float price;
    Date date_in;

    public BookingDetails() {
    }

    public BookingDetails(String fullname_client, String phone_number, String mail, int room_number, float price, Date date_in) {
        this.fullname_client = fullname_client;
        this.phone_number = phone_number;
        this.mail = mail;
        this.room_number = room_number;
        this.price = price;
        this.date_in = date_in;
    }

    

    public String getFullname_client() {
        return fullname_client;
    }

    public void setFullname_client(String fullname_client) {
        this.fullname_client = fullname_client;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }
    
    
}


