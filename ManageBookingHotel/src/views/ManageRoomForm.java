/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.RoomController;
import controller.TypeRoomController;
import model.Room;
import model.TypeRoom;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageRoomForm extends javax.swing.JFrame {
    Room room = new Room();
    List<Room> list = new ArrayList<>();
    
    public ManageRoomForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
        showTypeRoom();
    }
    
    public void showTable(){
        RoomController roomdao = new RoomController();
        jTable_room.setModel(new DefaultTableModel(null, new Object[]{"Số phòng", "Loại phòng", "Số người", "Giá theo ngày", "Giá theo giờ", "Trạng thái"}));
        DefaultTableModel tableModel = (DefaultTableModel) jTable_room.getModel();
        List<Room> list = roomdao.allRoom();
        
        for (int i = 0; i < list.size(); i++) {
            Room room = (Room)list.get(i);
            Vector row = new Vector();
            row.add(room.getRoom_number());
            row.add(room.getType_room());
            row.add(room.getAmout());
            row.add(room.getPrice_day());
            row.add(room.getPrice_hour());
            row.add(room.getStatus());
            tableModel.addRow(row);
        }
    }
    
    
    
    
    public void showTypeRoom(){
        TypeRoomController typedao = new TypeRoomController();
        List<TypeRoom> listType = typedao.allTypeRoom();
        jComboBox_type_room.removeAllItems();
        for(TypeRoom item: listType)
        {
           jComboBox_type_room.addItem(item.getType_room());
        }
    }  
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_radio = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_price_hour = new javax.swing.JTextField();
        jTextField_price_day = new javax.swing.JTextField();
        jTextField_room_number = new javax.swing.JTextField();
        jRadioButton_empty = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_using = new javax.swing.JRadioButton();
        jComboBox_type_room = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_room = new javax.swing.JTable();
        jButton_delete = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_amount = new javax.swing.JTextField();
        jButton_add_type = new javax.swing.JButton();
        jTextField_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jLabel_search = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage room");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Close)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_Close))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Loại phòng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giá / ngày:");

        jTextField_price_hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_price_day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_room_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup_radio.add(jRadioButton_empty);
        jRadioButton_empty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_empty.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_empty.setText("Phòng trống");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Trạng thái:");

        buttonGroup_radio.add(jRadioButton_using);
        jRadioButton_using.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_using.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_using.setText("Có khách");

        jComboBox_type_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_type_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_type_roomMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giá / giờ:");

        jTable_room.setAutoCreateRowSorter(true);
        jTable_room.setBackground(new java.awt.Color(255, 255, 255));
        jTable_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số phòng", "Loại phòng", "Số người", "Giá theo ngày", "Giá theo giờ", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_room.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_room.setRowHeight(40);
        jTable_room.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jTable_room.setVerifyInputWhenFocusTarget(false);
        jTable_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_roomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_room);
        jTable_room.getAccessibleContext().setAccessibleName("");

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

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gg-circle.png"))); // NOI18N
        jLabel13.setText("Hotel");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Số phòng:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Số người");

        jButton_add_type.setBackground(new java.awt.Color(0, 204, 102));
        jButton_add_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-new.png"))); // NOI18N
        jButton_add_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_add_typeMouseClicked(evt);
            }
        });

        jTextField_search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_search.setToolTipText("Nhập số phòng để tìm kiếm...");
        jTextField_search.setDoubleBuffered(true);
        jTextField_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_searchMouseClicked(evt);
            }
        });

        jButton_search.setBackground(new java.awt.Color(255, 255, 255));
        jButton_search.setForeground(new java.awt.Color(0, 0, 0));
        jButton_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton_search.setText("Tìm");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_search.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_room_number)
                                    .addComponent(jTextField_price_hour)
                                    .addComponent(jTextField_price_day)
                                    .addComponent(jTextField_amount)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_empty)
                                                .addGap(42, 42, 42)
                                                .addComponent(jRadioButton_using))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox_type_room, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_add_type, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 3, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_search)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_room_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_type_room, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_price_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_price_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton_empty)
                    .addComponent(jRadioButton_using))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_search.getAccessibleContext().setAccessibleName("Nhập số phòng để tìm kiếm...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
//        HomeForm lg = new HomeForm();
//        lg.setVisible(true);
//        lg.pack();
//        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked
        
        int rowIndex = jTable_room.getSelectedRow();
        int room_number = Integer.parseInt(jTextField_room_number.getText());
        
        if(rowIndex >= 0){
            Room room = new Room();
            room.setRoom_number(room_number);
            int a = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
            if(a==0){
                RoomController.delete(room);
                showTable();
                JOptionPane.showMessageDialog(rootPane, "Xóa phòng thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn phòng cần xóa!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }       
    }//GEN-LAST:event_jButton_deleteMouseClicked
    
    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked
        
        int room_number = Integer.parseInt(jTextField_room_number.getText());       
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int amount = Integer.parseInt((String) jTextField_amount.getText());
        float price_day = Float.parseFloat(jTextField_price_day.getText());
        float price_hour = Float.parseFloat(jTextField_price_hour.getText());
        String status;
        if(jRadioButton_empty.isSelected()){
            status = "Empty";
        }
        else if(jRadioButton_using.isSelected()){
            status = "Using";
        }
        else{
            status = "Booked";
        }
        
        //Kiểm tra điền đủ thông tin hay chưa?
        if(jTextField_room_number.getText().equals("")||jTextField_price_day.getText().equals("")||jTextField_price_hour.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đủ thông tin!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                RoomController roomC = new RoomController();
                List<Room> list = roomC.search(room_number);
                if(list.size() >0){
                    JOptionPane.showMessageDialog(rootPane, "Số phòng đã tồn tại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
                }else{
                    Room room = new Room(room_number, type_room, amount, price_day, price_hour, status);
                    RoomController.add(room);
                    showTable();
                    JOptionPane.showMessageDialog(rootPane, "Thêm phòng thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
            
        }   
    }//GEN-LAST:event_jButton_addMouseClicked

    private void jButton_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_updateMouseClicked

        int room_number = Integer.parseInt(jTextField_room_number.getText());       
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int amount = Integer.parseInt((String) jTextField_amount.getText());
        float price_day = Float.parseFloat(jTextField_price_day.getText());
        float price_hour = Float.parseFloat(jTextField_price_hour.getText());
        String status;
        if(jRadioButton_empty.isSelected()){
            status = "Empty";
        }
        else{
            status = "Using";
        }
        //Kiểm tra điền đủ thông tin hay chưa?
        if(jTextField_room_number.getText().equals("")||jTextField_price_day.getText().equals("")||jTextField_price_hour.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đủ thông tin!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try {
                
                Room room = new Room(room_number, type_room, amount, price_day, price_hour, status);
                RoomController.update(room);
                showTable();
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
            
        }  
                    
    }//GEN-LAST:event_jButton_updateMouseClicked

    private void jTable_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_roomMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTable_room.getModel();
        int rowIndex = jTable_room.getSelectedRow();
        
        jTextField_room_number.setText(model.getValueAt(rowIndex,0).toString());
        jComboBox_type_room.setSelectedItem(model.getValueAt(rowIndex,1).toString()); 
        jTextField_amount.setText(model.getValueAt(rowIndex,2).toString());
        jTextField_price_day.setText(model.getValueAt(rowIndex,3).toString());
        jTextField_price_hour.setText(model.getValueAt(rowIndex,4).toString());
        
        if("Empty".equals(model.getValueAt(rowIndex,5).toString())){
            jRadioButton_empty.setSelected(true);
        }
        else if("Using".equals(model.getValueAt(rowIndex,5).toString())){
            jRadioButton_using.setSelected(true);
        }
    }//GEN-LAST:event_jTable_roomMouseClicked

    private void jButton_add_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_add_typeMouseClicked
        TypeRoomForm type = new TypeRoomForm();
        type.setVisible(true);
        type.pack();
        type.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton_add_typeMouseClicked

    private void jComboBox_type_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_type_roomMouseClicked
        // TODO add your handling code here:
        showTypeRoom();
    }//GEN-LAST:event_jComboBox_type_roomMouseClicked

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed

        
        if(jTextField_search.getText().equals("")){
            showTable();
        }
        else{
            if(Integer.parseInt(jTextField_search.getText())>=0){
                int room_number = Integer.parseInt(jTextField_search.getText());
                RoomController roomC = new RoomController();
                jTable_room.setModel(new DefaultTableModel(null, new Object[]{"Số phòng", "Loại phòng", "Số người", "Giá theo ngày", "Giá theo giờ", "Trạng thái"}));
                DefaultTableModel tableModel = (DefaultTableModel) jTable_room.getModel();
                List<Room> list = roomC.search(room_number);
                if(list.size() == 0){
                    JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!", "Tìm kiếm", JOptionPane.OK_OPTION);
                    showTable();
                    jTextField_search.setText("");
                }else{
                    for (int i = 0; i < list.size(); i++) {
                        Room room = (Room)list.get(i);
                        Vector row = new Vector();
                        row.add(room.getRoom_number());
                        row.add(room.getType_room());
                        row.add(room.getAmout());
                        row.add(room.getPrice_day());
                        row.add(room.getPrice_hour());
                        row.add(room.getStatus());
                        tableModel.addRow(row);
                    }
                    jTextField_search.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!", "Tìm kiếm", JOptionPane.OK_OPTION);
            }
            
            
        }
        

    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jTextField_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_searchMouseClicked
        jLabel_search.setText("Nhập số phòng:");
    }//GEN-LAST:event_jTextField_searchMouseClicked

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
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_radio;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_add_type;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<String> jComboBox_type_room;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_empty;
    private javax.swing.JRadioButton jRadioButton_using;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_room;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_price_day;
    private javax.swing.JTextField jTextField_price_hour;
    private javax.swing.JTextField jTextField_room_number;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
