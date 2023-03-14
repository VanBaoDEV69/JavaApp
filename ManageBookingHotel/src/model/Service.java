/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Văn Bảo
 */
public class Service {
    int id;
    String service_name;
    float price_unit;

    public Service() {
    }

    public Service(int id, String service_name, float price_unit) {
        this.id = id;
        this.service_name = service_name;
        this.price_unit = price_unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public float getPrice_unit() {
        return price_unit;
    }

    public void setPrice_unit(float price_unit) {
        this.price_unit = price_unit;
    }
    
    
}
