/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.TypeRoomController;
import model.TypeRoom;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Văn Bảo
 */
public class TypeRoomForm extends javax.swing.JFrame {

    /**
     * Creates new form TypeRoomForm
     */
    public TypeRoomForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_type_room = new javax.swing.JTextField();
        jButton_delete = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_type_room = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gg-circle.png"))); // NOI18N
        jLabel13.setText("Hotel");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Loại phòng:");

        jTextField_type_room.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_type_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_delete.setBackground(new java.awt.Color(242, 38, 19));
        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton_delete.setText("Xóa");
        jButton_delete.setPreferredSize(new java.awt.Dimension(106, 23));
        jButton_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_deleteMouseClicked(evt);
            }
        });

        jButton_update.setBackground(new java.awt.Color(0, 102, 204));
        jButton_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update _24px.png"))); // NOI18N
        jButton_update.setText("Cập nhật");
        jButton_update.setPreferredSize(new java.awt.Dimension(106, 23));
        jButton_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_updateMouseClicked(evt);
            }
        });

        jButton_add.setBackground(new java.awt.Color(0, 153, 0));
        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-new.png"))); // NOI18N
        jButton_add.setText("Thêm");
        jButton_add.setPreferredSize(new java.awt.Dimension(106, 23));
        jButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_addMouseClicked(evt);
            }
        });

        jTable_type_room.setAutoCreateRowSorter(true);
        jTable_type_room.setBackground(new java.awt.Color(255, 255, 255));
        jTable_type_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_type_room.setForeground(new java.awt.Color(44, 62, 80));
        jTable_type_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Loại phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_type_room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_type_room.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_type_room.setRowHeight(40);
        jTable_type_room.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jTable_type_room.setVerifyInputWhenFocusTarget(false);
        jTable_type_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_type_roomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_type_room);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type room");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Close)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_Close))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_type_room)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_type_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showTable(){
        TypeRoomController typedao = new TypeRoomController();
        jTable_type_room.setModel(new DefaultTableModel(null, new Object[]{"Id", "Loại phòng"}));
        DefaultTableModel tableModel = (DefaultTableModel) jTable_type_room.getModel();
        List<TypeRoom> list = typedao.listType();
        
        for (int i = 0; i < list.size(); i++) {
            TypeRoom type = (TypeRoom)list.get(i);
            Vector row = new Vector();
            row.add(type.getId_type());
            row.add(type.getType_room());
            tableModel.addRow(row);
        }
    }
    
    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable_type_room.getModel();
        int rowIndex = jTable_type_room.getSelectedRow();
        int id_type = Integer.parseInt(model.getValueAt(rowIndex,0).toString());
        TypeRoom type = new TypeRoom();
        type.setId_type(id_type);
        if(rowIndex >= 0){
           
            int a = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
            if(a==0){
                TypeRoomController.delete(type.getId_type());
                showTable();
                jTextField_type_room.setText("");
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn loại phòng cần xóa!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_deleteMouseClicked

    private void jButton_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_updateMouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable_type_room.getModel();
        int rowIndex = jTable_type_room.getSelectedRow();
        int id_type = Integer.parseInt(model.getValueAt(rowIndex,0).toString());
        String type_room = jTextField_type_room.getText();

        if(rowIndex >= 0){
            try {
                TypeRoom type = new TypeRoom(id_type, type_room);
                TypeRoomController.update(type);
                showTable();
                jTextField_type_room.setText("");
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn loại phòng cần cập nhật!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton_updateMouseClicked

    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked

        String type_room = jTextField_type_room.getText();
        
        //Kiểm tra điền đủ thông tin hay chưa?
        if(jTextField_type_room.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đủ thông tin!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                TypeRoom type = new TypeRoom();
                type.setType_room(type_room);
                TypeRoomController.add(type);
                showTable();
                jTextField_type_room.setText("");
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_addMouseClicked

    private void jTable_type_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_type_roomMouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable_type_room.getModel();
        int rowIndex = jTable_type_room.getSelectedRow();   
        jTextField_type_room.setText(model.getValueAt(rowIndex,1).toString());
    }//GEN-LAST:event_jTable_type_roomMouseClicked

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
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
            java.util.logging.Logger.getLogger(TypeRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypeRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypeRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypeRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypeRoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_type_room;
    private javax.swing.JTextField jTextField_type_room;
    // End of variables declaration//GEN-END:variables
}
