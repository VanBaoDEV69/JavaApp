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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Discount;

/**
 *
 * @author Văn Bảo
 */
public class DiscountController {
    
    
    
    public List<Discount> allDiscount(){
        String selectQuery = "SELECT * FROM `discount`";
        return select(selectQuery);
    }
    
    public List<Discount> checkDiscount(String discount_code, String date_now){
        String selectQuery = "SELECT * FROM `discount` WHERE `discount_code`='"+discount_code+"' AND '"+date_now+"' BETWEEN `date_begin` AND `date_end`";
        return select(selectQuery);
    }
    
    private List<Discount> select(String selectQuery){
        List<Discount> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            
            // Đọc dữ liệu trả về:
            while(rs.next()){
                Discount discount = readRoom (rs);
                list.add(discount);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    private Discount readRoom (ResultSet rs) throws SQLException {
        Discount discount = new Discount();
        discount.setId(rs.getInt("id"));
        discount.setDiscount_code(rs.getString("discount_code"));
        discount.setDiscount_price(rs.getFloat("discount_price"));
        discount.setDate_begin(rs.getDate("date_begin"));
        discount.setDate_end(rs.getDate("date_end"));
        return discount;
    }
    
    
    
    
    
    
    
    
    public static void add (Discount discount)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `discount`(`discount_code`, `discount_price`, `date_begin`, `date_end`) VALUES (?,?,?,?)";
            ps = connection.prepareCall(selectQuery);
            
            ps.setString(1, discount.getDiscount_code());
            ps.setFloat(2, discount.getDiscount_price());
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String date_begin = date.format(discount.getDate_begin());
            String date_end = date.format(discount.getDate_end());
            ps.setString(3, date_begin);
            ps.setString(4, date_end);
            
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
    
    public static void update (Discount discount){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `discount` SET `discount_code`= ?, `discount_price`=?, `date_begin`=?, `date_end`=? WHERE `id` = ?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setString(1, discount.getDiscount_code()); 
            ps.setFloat(2, discount.getDiscount_price());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String date_begin = date.format(discount.getDate_begin());
            String date_end = date.format(discount.getDate_end());
            ps.setString(3, date_begin);
            ps.setString(4, date_end);
            ps.setInt(5, discount.getId());
            
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
            String selectQuery = "DELETE FROM `discount` WHERE `id`=?";
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
