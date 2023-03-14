/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Văn Bảo
 */
public class Room {
    private int room_number;
    private String type_room;
    private int amount;
    private float price_day;
    private float price_hour;
    private String status;

    public Room() {
    }

    public Room(int room_number, String type_room, int amount, float price_day, float price_hour, String status) {
        this.room_number = room_number;
        this.type_room = type_room;
        this.amount = amount;
        this.price_day = price_day;
        this.price_hour = price_hour;
        this.status = status;
    }

    public Room(int room_number, String status) {
        
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getType_room() {
        return type_room;
    }

    public void setType_room(String type_room) {
        this.type_room = type_room;
    }

    public int getAmout() {
        return amount;
    }

    public void setAmout(int amout) {
        this.amount = amout;
    }

    public float getPrice_day() {
        return price_day;
    }

    public void setPrice_day(float price_day) {
        this.price_day = price_day;
    }

    public float getPrice_hour() {
        return price_hour;
    }

    public void setPrice_hour(float price_hour) {
        this.price_hour = price_hour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
