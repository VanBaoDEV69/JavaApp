/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.Booking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookingDetails;


/**
 *
 * @author Văn Bảo
 */
public class BookingController {

 
    public List<Booking> allBooking (){
        String selectQuery = "SELECT `id`, `fullname_client`, `birth_day`, `phone`, `mail`, `amount`, `type_room`, `room_number`, `price_day`, `date_in`, `date_out` FROM `booking`";
        return select(selectQuery);
    }
    
    public List<Booking> findDateIn (int room_number, String datein, String dateout){
        String selectQuery = "SELECT * FROM `booking` WHERE `room_number` = '"+room_number+"' AND '"+datein+"' BETWEEN `date_in` AND `date_out` OR '"+dateout+"' BETWEEN `date_in` AND `date_out`";
        return select(selectQuery);
    }
    
    private List<Booking> select(String selectQuery){
        List<Booking> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Booking booking = new Booking(rs.getInt("id"), rs.getString("fullname_client"), rs.getDate("birth_day"), rs.getString("phone"), rs.getString("mail"), rs.getInt("amount"), rs.getString("type_room"), rs.getInt("room_number"), rs.getFloat("price_day"), rs.getDate("date_in"), rs.getDate("date_out"));
                list.add(booking);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
    
    
    
    public List<Booking> findID (int room_number){
        String selectQuery = "SELECT * FROM `booking` WHERE `room_number`='"+room_number+"'";
        return selectQuery(selectQuery);
    }
    private List<Booking> selectQuery(String selectQuery){
        List<Booking> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Booking booking = readFromResultSet(rs);
                list.add(booking);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    private Booking readFromResultSet(ResultSet rs) throws SQLException {
        Booking booking = new Booking();
        booking.setId(rs.getInt("id"));
        //booking.setFullname_client(rs.getString("fullname_client"));
        booking.setRoom_number(rs.getInt("room_number"));
        return booking;
    }
    
    
    
    
    public static void add (Booking booking)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `booking`(`fullname_client`, `birth_day`, `phone`, `mail`, `amount`, `type_room`, `room_number`, `price_day`, `date_in`, `date_out`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String birth_day = date.format(booking.getBirth_day());
            String date_in = date.format(booking.getDate_in());
            String date_out = date.format(booking.getDate_out());
            
            ps = connection.prepareCall(selectQuery);
            ps.setString(1, booking.getFullname_client());
            ps.setString(2, birth_day);
            ps.setString(3, booking.getPhone());
            ps.setString(4, booking.getMail());
            ps.setInt(5, booking.getAmount());
            ps.setString(6, booking.getType_room());
            ps.setInt(7, booking.getRoom_number());
            ps.setFloat(8, booking.getPrice_day());
            ps.setString(9, date_in);
            ps.setString(10, date_out);
            
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
    
    public static void update (Booking booking){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `booking` SET `fullname_client`=?,`birth_day`=?,`phone`=?,`mail`=?,`amount`=?,`type_room`=?,`room_number`=?,`price_day`=?,`date_in`=?,`date_out`=? WHERE `id`=?";
        
            SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
            String birth_day = date.format(booking.getBirth_day());
            String date_in = date.format(booking.getDate_in());
            String date_out = date.format(booking.getDate_out());
            
            ps = connection.prepareCall(selectQuery);
            ps.setString(1, booking.getFullname_client());
            ps.setString(2, birth_day);
            ps.setString(3, booking.getPhone());
            ps.setString(4, booking.getMail());
            ps.setInt(5, booking.getAmount());
            ps.setString(6, booking.getType_room());
            ps.setInt(7, booking.getRoom_number());
            ps.setFloat(8, booking.getPrice_day());
            ps.setString(9, date_in);
            ps.setString(10, date_out);
            ps.setInt(11, booking.getId());
            
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
            
            String selectQuery = "DELETE FROM `booking` WHERE `id`=?";
            ps = connection.prepareCall(selectQuery);
            
            ps.setInt(1, id);
            
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
    
    
    
    
    
    
    
    
    public List<Booking> search (String fullname_client, String phone){

        List<Booking> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM `booking` WHERE `fullname_client` LIKE '%"+fullname_client+"%' OR `phone` LIKE '%"+phone+"%'";
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Booking booking = new Booking(rs.getInt("id"), rs.getString("fullname_client"), rs.getDate("birth_day"), rs.getString("phone"), rs.getString("mail"), rs.getInt("amount"), rs.getString("type_room"), rs.getInt("room_number"), rs.getFloat("price_day"), rs.getDate("date_in"), rs.getDate("date_out"));
                list.add(booking);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;  
    }
}
