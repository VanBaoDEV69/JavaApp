/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.User;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Tìm username
    public List<User> findUsername (String username){
        String selectQuery = "SELECT * FROM `user` WHERE `username` = '"+username+"' ";
        return selectUser(selectQuery);
    }
    
    public List<User> search (String fullname, String username){
        String selectQuery = "SELECT * FROM `user` WHERE `fullname` LIKE '%"+fullname+"%' OR `username` LIKE '%"+username+"%' ";
        return selectUser(selectQuery);
    }
    //get all user
    public List<User> allUser (){
        String selectQuery = "SELECT * FROM `user`";
        return selectUser(selectQuery);
    }
   
    public List<User> selectUser(String selectQuery){
        List<User> list = new ArrayList<>();
        
        try{
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            ResultSet rs = null;
            PreparedStatement ps = connection.prepareCall(selectQuery);
            rs = ps.executeQuery(selectQuery);
            // Đọc dữ liệu trả về:
            while(rs.next()){
                User user = readUser(rs);
                list.add(user);
            }  
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    private User readUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setFullname(rs.getString("fullname"));
        user.setBirth_day(rs.getString("birth_day"));
        user.setPhonenumber(rs.getString("phonenumber"));
        user.setMail(rs.getString("mail"));
        user.setAddress(rs.getString("address"));
        user.setStatus(rs.getString("status"));
        return user;
    }
    
    
    
    
    
    
    
    public static void update(User user){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `user` SET `username`=?,`password`=?,`phonenumber`=?,`mail`=?,`address`=?,`status`=? WHERE `id` =?";
            ps = connection.prepareCall(selectQuery);
            
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword()); 
            ps.setString(3, user.getPhonenumber());
            ps.setString(4, user.getMail());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getStatus());
            ps.setInt(7, user.getId());
            
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void updatePassword(User user){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "UPDATE `user` SET `password`=? WHERE `username` = ? ";
            ps = connection.prepareCall(selectQuery);
            
            ps.setString(1, user.getPassword()); 
            ps.setString(2, user.getUsername());
            
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
    
    
    
    
    
    
    
    
    
    
    public static void add (User user)
    { 
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "INSERT INTO `user`(`fullname`, `username`, `password`, `birth_day`, `phonenumber`, `mail`, `address`, `status`) VALUES (?,?,?,?,?,?,?,?)";
            
            
            
            ps = connection.prepareCall(selectQuery);
            ps.setString(1, user.getFullname());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getBirth_day());
            ps.setString(5, user.getPhonenumber());
            ps.setString(6, user.getMail());
            ps.setString(7, user.getAddress());    
            ps.setString(8, user.getStatus());
            
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
    
    
    
    
    public static void delete (User user){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            String selectQuery = "DELETE FROM `user` WHERE `id`=?";
            ps = connection.prepareCall(selectQuery);
        
            ps.setInt(1, user.getId());
            
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
