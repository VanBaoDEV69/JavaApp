/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.IdentityGmailController;
import controller.UserController;
import model.User;
import java.sql.SQLException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static jdk.jfr.FlightRecorder.register;

/**
 *
 * @author Văn Bảo
 */
public class RegistorForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistorForm
     */
    int identity_code;
    public RegistorForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_fullname = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButtonCreate = new javax.swing.JButton();
        jTextField_username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField_retypepass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField_address = new javax.swing.JTextArea();
        jTextField_phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_mail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser_birth_day = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jTextField_identity_code = new javax.swing.JTextField();
        jButton_indetity_code = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registor");

        jLabel_Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Close)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_Close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ngày sinh:");

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mật khẩu:");

        jTextField_fullname.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_fullname.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField_password.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(0, 0, 0));

        jButtonCreate.setBackground(new java.awt.Color(0, 153, 0));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreate.setText("Đăng ký");
        jButtonCreate.setPreferredSize(new java.awt.Dimension(106, 23));
        jButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMouseClicked(evt);
            }
        });

        jTextField_username.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tên đăng nhập:");

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SDT:");

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nhập lại mật khẩu:");

        jPasswordField_retypepass.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_retypepass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_retypepass.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(236, 240, 241));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Địa chỉ:");

        jTextField_address.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_address.setColumns(20);
        jTextField_address.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_address.setRows(5);
        jScrollPane1.setViewportView(jTextField_address);

        jTextField_phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_phone.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(236, 240, 241));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Gmail:");

        jTextField_mail.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_mail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gg-circle.png"))); // NOI18N
        jLabel13.setText("Hotel");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setBackground(new java.awt.Color(236, 240, 241));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Họ và tên: ");

        jDateChooser_birth_day.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_birth_day.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser_birth_day.setDateFormatString("yyyy-MM-dd");

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mã xác nhận:");

        jTextField_identity_code.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_identity_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_identity_code.setForeground(new java.awt.Color(0, 0, 0));

        jButton_indetity_code.setBackground(new java.awt.Color(255, 153, 0));
        jButton_indetity_code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_indetity_code.setForeground(new java.awt.Color(255, 255, 255));
        jButton_indetity_code.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update _24px.png"))); // NOI18N
        jButton_indetity_code.setText("Nhận mã");
        jButton_indetity_code.setPreferredSize(new java.awt.Dimension(85, 25));
        jButton_indetity_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_indetity_codeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel6))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser_birth_day, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_username, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_retypepass, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(97, 97, 97)
                                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jTextField_identity_code, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton_indetity_code, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser_birth_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField_retypepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_identity_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_indetity_code, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMouseClicked
        String fullname = jTextField_fullname.getText();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String birth_day = date.format(jDateChooser_birth_day.getDate());
        String phonenumber = jTextField_phone.getText();
        String username = jTextField_username.getText();
        String password = String.valueOf(jPasswordField_password.getPassword());
        String repass = String.valueOf(jPasswordField_retypepass.getPassword());
        String mail = jTextField_mail.getText();
        String address = jTextField_address.getText();
        int identity = Integer.parseInt(jTextField_identity_code.getText());


        String status = "Open";
        try {
            //Kiểm tra điền đủ thông tin hay chưa?
            if(fullname.equals("")||birth_day.equals(null)||phonenumber.equals("")||username.equals("")||password.equals("")||repass.equals("")||mail.equals("")||address.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đủ thông tin!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
            else{
                UserController userdao = new UserController();
                List<User> listuser = userdao.findUsername(username); 
                if(listuser.size() >0){
                    for(User item:listuser)
                    {                       
                        if(item.getUsername().equals(username)){
                            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }else{
                    if(identity == identity_code){
                        if(password.equals(repass)){
                            User user = new User( fullname, username, password, birth_day, phonenumber, mail, address, status);
                            user.setFullname(fullname);
                            user.setUsername(username);
                            user.setPassword(password);
                            user.setBirth_day(birth_day);
                            user.setPhonenumber(phonenumber);
                            user.setMail(mail);
                            user.setAddress(address);
                            user.setStatus(status);
                            UserController.add(user);
                            reset();
                            JOptionPane.showMessageDialog(rootPane, "Đăng kí thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "Mã xác thực không chính xác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }    
                }

            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Đặt phòng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButtonCreateMouseClicked

    
    public void reset(){
        jTextField_fullname.setText("");
        jDateChooser_birth_day.setDate(null);
        jTextField_phone.setText("");
        jTextField_username.setText("");
        jPasswordField_password.setText("");
        jPasswordField_retypepass.setText("");
        jTextField_mail.setText("");
        jTextField_address.setText("");
        jTextField_identity_code.setText("");
    }
    
    
    
    
    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_indetity_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_indetity_codeActionPerformed
        // TODO add your handling code here:
        
        String to_gmail = jTextField_mail.getText();
        if(to_gmail.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Chưa điền địa chỉ gmail!", "Lỗi", JOptionPane.ERROR_MESSAGE);  
        }
        else{
            //tạo mã code xác thực ngẫu nhiên 6 chữ số;
            Random rnd = new Random();
            identity_code = 100000 + rnd.nextInt(900000);
            IdentityGmailController iden = new IdentityGmailController();
            iden.sendGmail(to_gmail, identity_code);
            //jButton_indetity_code.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "Đã gửi mã xác nhận!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_jButton_indetity_codeActionPerformed

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
            java.util.logging.Logger.getLogger(RegistorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButton_indetity_code;
    private com.toedter.calendar.JDateChooser jDateChooser_birth_day;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JPasswordField jPasswordField_retypepass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField_address;
    private javax.swing.JTextField jTextField_fullname;
    private javax.swing.JTextField jTextField_identity_code;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}