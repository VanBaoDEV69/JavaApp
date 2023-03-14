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
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ServiceDetail;

/**
 *
 * @author Văn Bảo
 */
public class ServiceDetailController {
    
    
    
    public List<ServiceDetail> allService(){
        String selectQuery = "SELECT * FROM `service_detail`";
        return select(selectQuery);
    }
    
    public List<ServiceDetail> allServiceBill(int room_number){
        String selectQuery = "SELECT * FROM `service_detail` WHERE `room_number`='"+room_number+"'";
        return select(selectQuery);
    }
    
    private List<ServiceDetail> select(String selectQuery){
        List<ServiceDetail> listType = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            
            // Đọc dữ liệu trả về:
            while(rs.next()){
                ServiceDetail seivice = readRoom (rs);
                listType.add(seivice);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return listType;
    }
    private ServiceDetail readRoom (ResultSet rs) throws SQLException {
        ServiceDetail service = new ServiceDetail();
        service.setRoom_number(rs.getInt("room_number"));
        service.setService_name(rs.getString("service_name"));
        service.setPrice_unit(rs.getFloat("price_unit"));
        service.setAmount(rs.getInt("amount"));
        service.setPrice_total(rs.getFloat("price_total"));
        service.setDate_buy(rs.getDate("date_buy"));
        return service;
    }
    
    
    
    
    
    
    
    
    public static void add (ServiceDetail service)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `service_detail`(`room_number`, `service_name`, `price_unit`, `amount`, `price_total`, `date_buy`) VALUES (?,?,?,?,?,?)";
            ps = connection.prepareCall(selectQuery);
            
            ps.setInt(1, service.getRoom_number());
            ps.setString(2, service.getService_name());
            ps.setFloat(3, service.getPrice_unit());
            ps.setInt(4, service.getAmount());
            ps.setFloat(5, service.getPrice_total());
            
            DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = simpleDateFormat.format(service.getDate_buy());
            ps.setString(6, date);
            
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
            String selectQuery = "DELETE FROM `service_detail` WHERE `room_number`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setInt(1, room_number);
            
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
