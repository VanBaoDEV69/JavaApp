/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.TypeRoom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Văn Bảo
 */
public class TypeRoomController {

    public List<TypeRoom> allTypeRoom (){
        String selectQuery = "SELECT * FROM `type_room`";
        return select(selectQuery);
    }
    Connection connection = null;
    
    private List<TypeRoom> select(String selectQuery){
        List<TypeRoom> listType = new ArrayList<>();
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            
            // Đọc dữ liệu trả về:
            while(rs.next()){
                TypeRoom type = readRoom (rs);
                listType.add(type);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return listType;
    }
    private TypeRoom readRoom (ResultSet rs) throws SQLException {
        TypeRoom typeroom = new TypeRoom();
        typeroom.setType_room(rs.getString("type_room"));
        return typeroom;
    }
    
    
    public List<TypeRoom> listType (){
        String selectQuery = "SELECT * FROM `type_room`";
        return selectList(selectQuery);
    }
     private List<TypeRoom> selectList(String selectQuery){
        List<TypeRoom> listType = new ArrayList<>();
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            
            // Đọc dữ liệu trả về:
            while(rs.next()){
                TypeRoom type = readTypeRoom (rs);
                listType.add(type);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return listType;
    }
    private TypeRoom readTypeRoom (ResultSet rs) throws SQLException {
        TypeRoom typeroom = new TypeRoom();
        typeroom.setId_type(rs.getInt("id_type"));
        typeroom.setType_room(rs.getString("type_room"));
        return typeroom;
    }
    public static void add (TypeRoom type)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `type_room`(`type_room`) VALUES (?)";
            ps = connection.prepareCall(selectQuery);
  
            ps.setString(1, type.getType_room());
            
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
    
    public static void update (TypeRoom type){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `type_room` SET `type_room`= ? WHERE `id_type` = ?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setString(1, type.getType_room()); 
            ps.setInt(2, type.getId_type());
            
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
    
    public static void delete (int id_type){
        Connection connection = null;
        PreparedStatement ps = null;
        TypeRoom type = new TypeRoom();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            String selectQuery = "DELETE FROM `type_room` WHERE `id_type`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setInt(1, id_type);
            
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

    public List<TypeRoom> roomNumberEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
