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
public class ServiceDetail {
    int room_number;
    String service_name;
    float price_unit;
    int amount;
    float price_total;
    Date date_buy;

    public ServiceDetail() {
    }

    public ServiceDetail(int room_number, String service_name, float price_unit, int amount, float price_total, Date date_buy) {
        this.room_number = room_number;
        this.service_name = service_name;
        this.amount = amount;
        this.price_unit = price_unit;
        this.price_total = price_total;
        this.date_buy = date_buy;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice_unit() {
        return price_unit;
    }

    public void setPrice_unit(float price_unit) {
        this.price_unit = price_unit;
    }

    public float getPrice_total() {
        return price_total;
    }

    public void setPrice_total(float price_total) {
        this.price_total = price_total;
    }

    public Date getDate_buy() {
        return date_buy;
    }

    public void setDate_buy(Date date_buy) {
        this.date_buy = date_buy;
    }
    
    
}
