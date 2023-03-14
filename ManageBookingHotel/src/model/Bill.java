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
public class Bill {
    int id_bill;
    String fullname_client;
    String phone_client;
    String mail;
    int room_number;
    Date date_in;
    Date date_out;
    float price_unit;
    float service_charge;
    float discount_price;
    float price_total;
    String add_by;

    public Bill() {
    }

    public Bill(int id_bill, String fullname_client, String phone_client, String mail, int room_number, Date date_in, Date date_out, float price_unit, float service_charge, float discount_price, float price_total, String add_by) {
        this.id_bill = id_bill;
        this.fullname_client = fullname_client;
        this.phone_client = phone_client;
        this.mail = mail;
        this.room_number = room_number;
        this.date_in = date_in;
        this.date_out = date_out;
        this.price_unit = price_unit;
        this.service_charge = service_charge;
        this.discount_price = discount_price;
        this.price_total = price_total;
        this.add_by = add_by;
    }

    public Bill(String fullname_client, String phone_client, String mail, int room_number, Date date_in, Date date_out, Float price_unit, float service_chanrge, float discount_price, float price_total, String add_by) {
        
    }
    

   

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public String getFullname_client() {
        return fullname_client;
    }

    public void setFullname_client(String fullname_client) {
        this.fullname_client = fullname_client;
    }

    public String getPhone_client() {
        return phone_client;
    }

    public void setPhone_client(String phone_client) {
        this.phone_client = phone_client;
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

    public float getPrice_unit() {
        return price_unit;
    }

    public void setPrice_unit(float price_unit) {
        this.price_unit = price_unit;
    }

    public float getService_charge() {
        return service_charge;
    }

    public void setService_charge(float service_charge) {
        this.service_charge = service_charge;
    }

    public float getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(float discount_price) {
        this.discount_price = discount_price;
    }

    public float getPrice_total() {
        return price_total;
    }

    public void setPrice_total(float price_total) {
        this.price_total = price_total;
    }

    public String getAdd_by() {
        return add_by;
    }

    public void setAdd_by(String add_by) {
        this.add_by = add_by;
    }
    
}
