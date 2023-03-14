/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Service;

/**
 *
 * @author Văn Bảo
 */
public class ServiceController {
    
    
    
    
    public List<Service> allService(){
        String selectQuery = "SELECT * FROM `service`";
        return select(selectQuery);
    }
    
    public List<Service> loadPrice(String service_name){
        String selectQuery = "SELECT * FROM `service` WHERE `service_name`= '"+service_name+"'";
        return select(selectQuery);
    }
    
    private List<Service> select(String selectQuery){
        List<Service> listType = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Service seivice = readRoom (rs);
                listType.add(seivice);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return listType;
    }
    private Service readRoom (ResultSet rs) throws SQLException {
        Service service = new Service();
        service.setId(rs.getInt("id"));
        service.setService_name(rs.getString("service_name"));
        service.setPrice_unit(rs.getFloat("price_unit"));
        return service;
    }
    
    
    
    
    
    
    
    
    public static void add (Service service)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `service`(`service_name`, `price_unit`) VALUES (?,?)";
            ps = connection.prepareCall(selectQuery);
  
            ps.setString(1, service.getService_name());
            ps.setFloat(2, service.getPrice_unit());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void update (Service service){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `service` SET `service_name`= ?, `price_unit`=? WHERE `id` = ?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setString(1, service.getService_name()); 
            ps.setFloat(2, service.getPrice_unit());
            ps.setInt(3, service.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void delete (int id){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            String selectQuery = "DELETE FROM `service` WHERE `id`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TypeRoomController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TypeRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TypeRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
