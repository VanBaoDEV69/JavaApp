/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.UserController;
import java.awt.Color;
import model.LoadUserName;
import model.User;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Văn Bảo
 */
public class ChangePasswordForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordForm
     */
    public ChangePasswordForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadForm();
    }
    
    public void loadForm(){
        LoadUserName l = new LoadUserName();
        this.jLabel_user_name1.setText(l.getUser_name());
        String username = l.getUser_name();
        UserController userdao = new UserController();
        List<User> listuser = userdao.findUsername(username);
        if(listuser.size() >0){
            for(User item : listuser){
                jTextField_username.setText(item.getUsername());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_user_name1 = new javax.swing.JLabel();
        jButton_change_password = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_old_pass = new javax.swing.JPasswordField();
        jPasswordField_new_pass = new javax.swing.JPasswordField();
        jPasswordField_retype_pass = new javax.swing.JPasswordField();
        jLabel_pass_old = new javax.swing.JLabel();
        jLabel_pass_new = new javax.swing.JLabel();
        jLabel_retype_pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(512, Short.MAX_VALUE)
                .addComponent(jLabel_Close)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Close)
                .addGap(651, 651, 651))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Staff_94px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gg-circle.png"))); // NOI18N
        jLabel9.setText("Hotel");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tên đăng nhập:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mật khẩu mới:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nhập lại:");

        jLabel_user_name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_user_name1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user_name1.setText("User");

        jButton_change_password.setBackground(new java.awt.Color(255, 255, 255));
        jButton_change_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_change_password.setForeground(new java.awt.Color(0, 0, 0));
        jButton_change_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/change.png"))); // NOI18N
        jButton_change_password.setText("Đổi mật khẩu");
        jButton_change_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_change_passwordMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mật khẩu cũ:");

        jTextField_username.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField_old_pass.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_old_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_old_pass.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField_new_pass.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_new_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_new_pass.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField_retype_pass.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_retype_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_retype_pass.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_pass_old.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel_pass_new.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel_retype_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel_user_name1))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton_change_password))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_pass_old, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jPasswordField_old_pass)
                            .addComponent(jPasswordField_new_pass)
                            .addComponent(jPasswordField_retype_pass)
                            .addComponent(jLabel_pass_new, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jLabel_retype_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel_user_name1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel10)))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jPasswordField_old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_pass_old, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordField_new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_pass_new, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jPasswordField_retype_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_retype_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton_change_password)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNullLabel(){
        jLabel_pass_old.setText("");
        jLabel_pass_new.setText("");
        jLabel_retype_pass.setText("");
    }
    
    private void jButton_change_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_change_passwordMouseClicked
        setNullLabel();
        
        if(String.valueOf(jPasswordField_old_pass.getPassword()).equals("")){
            jLabel_pass_old.setForeground(Color.red);
            jLabel_pass_old.setText("Nhập mật khẩu cũ...");
        }
        else if(String.valueOf(jPasswordField_new_pass.getPassword()).equals("")){
            jLabel_pass_new.setText("Nhập mật khẩu mới...");
            jLabel_pass_new.setForeground(Color.red);
        }
        else if(String.valueOf(jPasswordField_retype_pass.getPassword()).equals("")){
            jLabel_retype_pass.setText("Nhập lại mật khẩu...");
            jLabel_retype_pass.setForeground(Color.red);
        }
        else{ 
            UserController userdao = new UserController();
            String username = jTextField_username.getText();
            String oldpassword = String.valueOf(jPasswordField_old_pass.getPassword());
            String password = String.valueOf(jPasswordField_new_pass.getPassword());
            String retypePass = String.valueOf(jPasswordField_retype_pass.getPassword());
            if(password.equals(retypePass)){
                try {
                    List<User> listuser = userdao.findUsername(username); 
                    if(listuser.size() >0){
                        for(User item:listuser)
                        {                       
                            if(item.getPassword().equals(oldpassword)){
                                User user = new User(username, password);
                                user.setUsername(username);
                                user.setPassword(password);
                                UserController.updatePassword(user);
                                JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                                this.setVisible(false);
                            }
                            else{
                                jLabel_pass_old.setForeground(Color.red);
                                jLabel_pass_old.setText("Mật khẩu cũ không đúng...");
                            }
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "Người dùng không tồn tại!", "Lỗi", 2);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thất bại!", "Lỗi", 2);
                }
            }else{
                jLabel_pass_new.setText("Mật khẩu mới không khớp...");
                jLabel_pass_new.setForeground(Color.red);
                jLabel_retype_pass.setText("Mật khẩu mới không khớp...");
                jLabel_retype_pass.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jButton_change_passwordMouseClicked

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
        new UserForm().setVisible(true);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_change_password;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_pass_new;
    private javax.swing.JLabel jLabel_pass_old;
    private javax.swing.JLabel jLabel_retype_pass;
    private javax.swing.JLabel jLabel_user_name1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_new_pass;
    private javax.swing.JPasswordField jPasswordField_old_pass;
    private javax.swing.JPasswordField jPasswordField_retype_pass;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
