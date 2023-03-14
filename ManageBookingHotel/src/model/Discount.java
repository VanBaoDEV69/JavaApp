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
public class Discount {
    int id;
    String discount_code;
    float discount_price;
    Date date_begin;
    Date date_end;

    public Discount() {
    }

    public Discount(int id, String discount_code, float discount_price, Date date_begin, Date date_end) {
        this.id = id;
        this.discount_code = discount_code;
        this.discount_price = discount_price;
        this.date_begin = date_begin;
        this.date_end = date_end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscount_code() {
        return discount_code;
    }

    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public float getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(float discount_price) {
        this.discount_price = discount_price;
    }

    public Date getDate_begin() {
        return date_begin;
    }

    public void setDate_begin(Date date_begin) {
        this.date_begin = date_begin;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }
    
}
