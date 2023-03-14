/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Bill;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Văn Bảo
 */
public class BillController {
    
    
    public List<Bill> allBill (){
        String selectQuery = "SELECT * FROM `bill`";
        return select(selectQuery);
    }
    
    public List<Bill> findRoomNumber(int room_number){
        String selectQuery = "SELECT * FROM `bill` WHERE `room_number` = '"+room_number+"'";
        return select(selectQuery);
    }
    
    public List<Bill> findId(int id_bill){
        String selectQuery = "SELECT * FROM `bill` WHERE `id_bill` = '"+id_bill+"'";
        return select(selectQuery);
    }
    public List<Bill> search (String fullname_client, String phone_client, String mail){
        String selectQuery = "SELECT * FROM `bill` WHERE `fullname_client` LIKE '%"+fullname_client+"%' OR `phone_client` LIKE '%"+phone_client+"%' OR `mail` LIKE '%"+mail+"%'";
        return select(selectQuery);       
    }
    public List<Bill> findDate (String from_date, String to_date){
        String selectQuery = "SELECT * FROM `bill` WHERE `date_out` BETWEEN '"+from_date+"' AND '"+to_date+"'";
        return select(selectQuery);       
    }
    public List<Bill> findToDay (String to_day){
        String selectQuery = "SELECT * FROM `bill` WHERE `date_out` = '"+to_day+"'";
        return select(selectQuery);       
    }
    public List<Bill> findMonth (String month){
        String selectQuery = "SELECT * FROM `bill` WHERE `date_out` LIKE '%-"+month+"-%'";
        return select(selectQuery);       
    }
    private List<Bill> select(String selectQuery, Object... args){
        List<Bill> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu :
            while(rs.next()){
                Bill bill = new Bill(rs.getInt("id_bill"), rs.getString("fullname_client"), 
                        rs.getString("phone_client"),rs.getString("mail"), rs.getInt("room_number"), 
                        rs.getDate("date_in"), rs.getDate("date_out"), rs.getFloat("price_unit"),
                        rs.getFloat("service_chanrge"), rs.getFloat("discount_price"), rs.getFloat("price_total"), rs.getString("add_by"));
                list.add(bill);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
    
    
    
    
    public static void add (Bill bill)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `bill`(`fullname_client`, `phone_client`, `mail`, `room_number`, `date_in`, `date_out`, `price_unit`, `service_chanrge`, `discount_price`, `price_total`, `add_by`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareCall(selectQuery);
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = date.format(bill.getDate_in());
            String date_out = date.format(bill.getDate_out());
            
            ps.setString(1, bill.getFullname_client());
            ps.setString(2, bill.getPhone_client());
            ps.setString(3, bill.getMail());
            ps.setInt(4, bill.getRoom_number());
            ps.setString(5, date_in);
            ps.setString(6, date_out);
            ps.setFloat(7, bill.getPrice_unit());
            ps.setFloat(8, bill.getService_charge());
            ps.setFloat(9, bill.getDiscount_price());
            ps.setFloat(10, bill.getPrice_total());
            ps.setString(11, bill.getAdd_by());
            
            ps.executeUpdate();
            
        } catch (Exception ex) {
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
    
    
    public static void delete (int id_bill){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "DELETE FROM `bill` WHERE `id_bill`=?";
            ps = connection.prepareCall(selectQuery);
           
            ps.setInt(1, id_bill);
            
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
