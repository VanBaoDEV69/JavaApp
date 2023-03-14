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
public class Booking {
    private int id;
    private String fullname_client;
    private Date birth_day;
    private String phone;
    private String mail;
    private int amount;
    private String type_room;
    private int room_number;
    private float price_day;
    private Date date_in;
    private Date date_out;

    public Booking() {
    }

    public Booking(int id, String fullname_client, Date birth_day, String phone, String mail, int amount, String type_room, int room_number, float price_day, Date date_in, Date date_out) {
        this.id = id;
        this.fullname_client = fullname_client;
        this.birth_day = birth_day;
        this.phone = phone;
        this.mail = mail;
        this.amount = amount;
        this.type_room = type_room;
        this.room_number = room_number;
        this.price_day = price_day;
        this.date_in = date_in;
        this.date_out = date_out;
    }

    public Booking(String fullname_client, Date birth_day, String phone, String mail, int amount, String type_room, int room_number, float price_day, Date date_in, Date date_out) {
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname_client() {
        return fullname_client;
    }

    public void setFullname_client(String fullname_client) {
        this.fullname_client = fullname_client;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType_room() {
        return type_room;
    }

    public void setType_room(String type_room) {
        this.type_room = type_room;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public float getPrice_day() {
        return price_day;
    }

    public void setPrice_day(float price_day) {
        this.price_day = price_day;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public Date getDate_out() {
        return date_out;
    }

    public void setDate_out(Date date_out) {
        this.date_out = date_out;
    }

    
    
}
