/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Room;
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
public class RoomController {

    
    
    
    
    public List<Room> allRoom (){
        String selectQuery = "SELECT * FROM `room`";
        return select(selectQuery);
    }
    
    public List<Room> search(int room_number){
        String selectQuery = "SELECT * FROM `room` WHERE `room_number` = '"+room_number+"'";
        return select(selectQuery);
    }
    
    private List<Room> select(String selectQuery, Object... args){
        List<Room> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu :
            while(rs.next()){
                Room room = new Room(rs.getInt("room_number"), rs.getString("type_room"), rs.getInt("amount"), rs.getFloat("price_day"), rs.getFloat("price_hour"), rs.getString("status"));
                list.add(room);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
    
    
    
    
    // lấy danh sách phòng trống
    public List<Room> roomNumberEmpty (String type_room, int amount){
        String selectQuery = "SELECT `room_number`, `price_day` FROM `room` WHERE `type_room`= '"+type_room+"' AND `amount`='"+amount+"' AND `status`!='using'";
        return selectRoomNumber(selectQuery);
    }
    private List<Room> selectRoomNumber(String selectQuery){
        List<Room> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Room room = readRoomNumber(rs);
                list.add(room);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    private Room readRoomNumber(ResultSet rs) throws SQLException {
        Room room = new Room();
        room.setRoom_number(rs.getInt("room_number"));
        room.setPrice_day(rs.getFloat("price_day"));
        return room;
    }
    
    
    
    
    
    
    
    
    // thêm 1 phòng 
    public static void add (Room room)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `room`(`room_number`, `type_room`, `amount`, `price_day`, `price_hour`, `status`) VALUES (?,?,?,?,?,?)";
            ps = connection.prepareCall(selectQuery);
  
            ps.setInt(1, room.getRoom_number());
            ps.setString(2, room.getType_room());
            ps.setInt(3, room.getAmout());
            ps.setFloat(4, room.getPrice_day());
            ps.setFloat(5, room.getPrice_hour());
            ps.setString(6, room.getStatus());
            
            
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
    
    
    
    
    
    
    
    
    public static void update (Room room){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `room` SET `type_room`=?,`amount`=?,`price_day`=?,`price_hour`=?,`status`=? WHERE `room_number`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setString(1, room.getType_room());
            ps.setInt(2, room.getAmout());
            ps.setFloat(3, room.getPrice_day());
            ps.setFloat(4, room.getPrice_hour());
            ps.setString(5, room.getStatus());
            ps.setInt(6, room.getRoom_number());
            
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
     
    
    
    
    
    
    
    
    
    public static void delete (Room room){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "DELETE FROM `room` WHERE `room_number`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setInt(1, room.getRoom_number());
            
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
    
    
    
    
    
    
    public static void updateStatus(Room room) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `room` SET `status`=? WHERE `room_number`=?";
            ps = connection.prepareCall(selectQuery);
            
            ps.setString(1, room.getStatus());
            ps.setInt(2, room.getRoom_number());
            
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

    
}
