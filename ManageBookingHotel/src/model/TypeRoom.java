/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;

/**
 *
 * @author Văn Bảo
 */
public class TypeRoom {
    private int id_type;
    private String type_room;

    public TypeRoom() {
    }

    public TypeRoom(int id_type, String type_room) {
        this.id_type = id_type;
        this.type_room = type_room;
    }

    public TypeRoom(String type_room) {
        
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getType_room() {
        return type_room;
    }

    public void setType_room(String type_room) {
        this.type_room = type_room;
    }

}
