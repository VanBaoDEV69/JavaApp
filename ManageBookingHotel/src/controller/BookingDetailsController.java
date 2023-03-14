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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookingDetails;



/**
 *
 * @author Văn Bảo
 */
public class BookingDetailsController {
    
    
    
    
    public List<BookingDetails> allBookingDetail(){
        String selectQuery = "SELECT * FROM `booking_details`";
        return select(selectQuery);
    }
    
    public List<BookingDetails> search(int room_number){
        String selectQuery = "SELECT * FROM `booking_details` WHERE `room_number` = "+room_number+"";
        return select(selectQuery);
    }

    private List<BookingDetails> select(String selectQuery) {
        List<BookingDetails> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                BookingDetails bd = new BookingDetails(rs.getString("fullname_client"), rs.getString("phone_number"),rs.getString("mail"), rs.getInt("room_number"), rs.getFloat("price"), rs.getDate("date_in"));
                list.add(bd);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
    
    
    
    
    
    
    
    public static void add (BookingDetails bd)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `booking_details`(`fullname_client`, `phone_number`, `mail`, `room_number`, `price`, `date_in`) VALUES (?,?,?,?,?,?)";
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date_in = date.format(bd.getDate_in());
            
            ps = connection.prepareCall(selectQuery);
            ps.setString(1, bd.getFullname_client());
            ps.setString(2, bd.getPhone_number());
            ps.setString(3, bd.getMail());
            ps.setInt(4, bd.getRoom_number());
            ps.setFloat(5, bd.getPrice());
            ps.setString(6, date_in);
            
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
    
    
    public static void delete (int room_number){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "DELETE FROM `booking_details` WHERE `room_number`=?";
            ps = connection.prepareCall(selectQuery);
           
            ps.setInt(1, room_number);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
}
