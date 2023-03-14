/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import controller.BookingController;
import controller.BookingDetailsController;
import controller.RoomController;
import controller.TypeRoomController;
import model.Booking;
import model.Room;
import model.TypeRoom;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;
import model.BookingDetails;



/**
 *
 * @author Văn Bảo
 */
public class ManageBookingForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageBookingForm
     */
    
    
    int id = 0;
    int roomnumber;
    public ManageBookingForm() {
        initComponents();
        this.setLocationRelativeTo(null);    
        showTable();
        loadAllData();
    }
    
    public void showTable(){
        BookingController bookingdao = new BookingController();
        jTable_booking.setModel(new DefaultTableModel(null, new Object[]{"Tên khách", "Ngày sinh", "Số điện thoại", "Mail", "Số người", "Loại phòng", "Số phòng", "Giá theo ngày", "Ngày nhận phòng", "Ngày trả dự kiến"}));
        DefaultTableModel tableModel = (DefaultTableModel) jTable_booking.getModel();
        List<Booking> list = bookingdao.allBooking();
        
        for (int i = 0; i < list.size(); i++) {
            Booking booking = (Booking)list.get(i);
            Vector row = new Vector();
            row.add(booking.getFullname_client());
            row.add(booking.getBirth_day());
            row.add(booking.getPhone());
            row.add(booking.getMail());
            row.add(booking.getAmount());
            row.add(booking.getType_room());
            row.add(booking.getRoom_number());
            row.add(booking.getPrice_day());
            row.add(booking.getDate_in());
            row.add(booking.getDate_out());
            tableModel.addRow(row);
        }
    }
    
    public void loadAllData(){
        RoomController roomC = new RoomController();
        List<Room> listRoomNumber = roomC.allRoom();
        jComboBox_room_number.removeAllItems();
        for(Room item: listRoomNumber)
        {
           jComboBox_room_number.addItem(String.valueOf(item.getRoom_number()));
        }
        
        TypeRoomController typeRoom = new TypeRoomController();
        List<TypeRoom> listType = typeRoom.allTypeRoom();
        jComboBox_type_room.removeAllItems();
        for(TypeRoom item: listType)
        {
           jComboBox_type_room.addItem(item.getType_room());
        }
    }
    
    public void loadRoomNumber(){
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int amount = Integer.parseInt(jTextField_amount.getText());
        RoomController RoomC = new RoomController();
        List<Room> listRoomNumber = RoomC.roomNumberEmpty(type_room, amount);
        jComboBox_room_number.removeAllItems();
        for(Room item: listRoomNumber)
        {
           jComboBox_room_number.addItem(String.valueOf(item.getRoom_number()));
        }    
    }
    
    
    public void loadPrice(){
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int amount = Integer.parseInt(jTextField_amount.getText());
        RoomController roomdao = new RoomController();
        List<Room> listRoomNumber = roomdao.roomNumberEmpty(type_room, amount);
        for(Room item: listRoomNumber)
        {
           jTextField_price_day.setText(String.valueOf(item.getPrice_day()));
        }    
    }
    
    public void reset(){
        jTextField_name_client.setText("");
        jTextField_phone.setText("");
        jTextField_mail.setText("");
        jTextField_amount.setText("");
        jComboBox_type_room.setSelectedItem(null);
        jComboBox_room_number.setSelectedItem(null);
        jTextField_price_day.setText("");
        jDateChooser_birth_day.setDate(null);
        jDateChooser_date_in.setDate(null);
        jDateChooser_date_out.setDate(null); 
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_price_day = new javax.swing.JTextField();
        jComboBox_type_room = new javax.swing.JComboBox<>();
        jButton_delete = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_name_client = new javax.swing.JTextField();
        jTextField_phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_mail = new javax.swing.JTextField();
        jTextField_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jComboBox_room_number = new javax.swing.JComboBox<>();
        jButton_check_in = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_booking = new javax.swing.JTable();
        jDateChooser_date_in = new com.toedter.calendar.JDateChooser();
        jDateChooser_date_out = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser_birth_day = new com.toedter.calendar.JDateChooser();
        jTextField_amount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 760));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 40));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage booking room");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
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

        jTextField_price_day.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_price_day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_price_day.setToolTipText("dd/mm/yyyy");

        jComboBox_type_room.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_type_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_type_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_type_roomMouseClicked(evt);
            }
        });

        jButton_delete.setBackground(new java.awt.Color(242, 38, 19));
        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton_delete.setText("Hủy đặt");
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
        jButton_add.setText("Đặt phòng");
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
        jButton_update.setText("Chỉnh sửa");
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
        jLabel9.setText("Tên khách:");

        jTextField_name_client.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_name_client.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Điện thoại:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mail:");

        jTextField_mail.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_search.setToolTipText("Tìm theo tên hoặc số điện thoại...");

        jButton_search.setBackground(new java.awt.Color(255, 255, 255));
        jButton_search.setForeground(new java.awt.Color(0, 0, 0));
        jButton_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton_search.setText("Tìm");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jComboBox_room_number.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_room_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_room_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_room_numberMouseClicked(evt);
            }
        });

        jButton_check_in.setBackground(new java.awt.Color(255, 153, 51));
        jButton_check_in.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_check_in.setForeground(new java.awt.Color(255, 255, 255));
        jButton_check_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-in.png"))); // NOI18N
        jButton_check_in.setText("Nhận phòng");
        jButton_check_in.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_check_in.setPreferredSize(new java.awt.Dimension(106, 23));
        jButton_check_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_check_inMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ngày nhận phòng:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ngày trả dự kiến:");

        jTable_booking.setAutoCreateRowSorter(true);
        jTable_booking.setBackground(new java.awt.Color(255, 255, 255));
        jTable_booking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_booking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên khách", "Ngày sinh", "Số điện thoại", "Mail", "Số người", "Loại phòng", "Số phòng", "Giá / ngày đêm", "Ngày nhận phòng", "Ngày trả dự kiến"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_booking.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_booking.setRowHeight(40);
        jTable_booking.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jTable_booking.setVerifyInputWhenFocusTarget(false);
        jTable_booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_bookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_booking);

        jDateChooser_date_in.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_date_in.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser_date_in.setDateFormatString("yyyy-MM-dd");
        jDateChooser_date_in.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser_date_out.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_date_out.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser_date_out.setDateFormatString("yyyy-MM-dd");
        jDateChooser_date_out.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ngày sinh:");

        jDateChooser_birth_day.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_birth_day.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser_birth_day.setDateFormatString("yyyy-MM-dd");
        jDateChooser_birth_day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_amount.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Số người:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_search))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(jTextField_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(86, 86, 86)
                                .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(93, 93, 93)
                        .addComponent(jDateChooser_birth_day, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_price_day)
                            .addComponent(jComboBox_room_number, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_date_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_date_out, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_type_room, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_type_room, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jDateChooser_birth_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser_date_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser_date_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox_room_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_price_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked

        int rowIndex = jTable_booking.getSelectedRow();
        Booking booking = new Booking();
        booking.setId(id);
        if(rowIndex >= 0){
            int a = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn hủy?", "Hủy", JOptionPane.YES_NO_OPTION);
            if(a==0){
                BookingController.delete(id);
                showTable();
                reset();
                
                JOptionPane.showMessageDialog(rootPane, "Hủy phòng thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn phòng cần hủy!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_jButton_deleteMouseClicked

    
    
     public void showRoom(){
        int room_number = Integer.parseInt((String) jComboBox_room_number.getSelectedItem());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String datein = date.format(jDateChooser_date_in.getDate());
        String dateout = date.format(jDateChooser_date_out.getDate());
        BookingController bookingC = new BookingController();
        jTable_booking.setModel(new DefaultTableModel(null, new Object[]{"Tên khách", "Ngày sinh", "Số điện thoại", "Mail", "Số người", "Loại phòng", "Số phòng", "Giá theo ngày", "Ngày nhận phòng", "Ngày trả dự kiến"}));
        DefaultTableModel tableModel = (DefaultTableModel) jTable_booking.getModel();
        List<Booking> list = bookingC.findDateIn(room_number, datein, dateout);
        
        for (int i = 0; i < list.size(); i++) {
            Booking booking = (Booking)list.get(i);
            Vector row = new Vector();
            row.add(booking.getFullname_client());
            row.add(booking.getBirth_day());
            row.add(booking.getPhone());
            row.add(booking.getMail());
            row.add(booking.getAmount());
            row.add(booking.getType_room());
            row.add(booking.getRoom_number());
            row.add(booking.getPrice_day());
            row.add(booking.getDate_in());
            row.add(booking.getDate_out());
            tableModel.addRow(row);
        }
    }
    
    
    
    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked
        
        String fullname_client = jTextField_name_client.getText();
        String phone = jTextField_phone.getText();
        String mail = jTextField_mail.getText();
        int amount = Integer.parseInt(jTextField_amount.getText());
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int room_number = Integer.parseInt((String) jComboBox_room_number.getSelectedItem());
        float price_day = Float.parseFloat(jTextField_price_day.getText());

        Date birth_day = jDateChooser_birth_day.getDate();

        Date date_in = jDateChooser_date_in.getDate();

        Date date_out = jDateChooser_date_out.getDate();   
        
        
        try {
            //Kiểm tra điền đủ thông tin hay chưa?
            if(jTextField_name_client.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } 
            else{
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                String datein = date.format(jDateChooser_date_in.getDate());
                String dateout = date.format(jDateChooser_date_out.getDate());
                List<Booking> list = new BookingController().findDateIn(room_number, datein, dateout);
                if(list.size()>0){
                    showRoom();
                    JOptionPane.showMessageDialog(rootPane, "Thời gian đặt cùng một phòng bị trùng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    
                }
                else{
                    Booking booking = new Booking(fullname_client, birth_day, phone, mail, amount, type_room, room_number, price_day, date_in, date_out);
                    booking.setFullname_client(fullname_client);
                    booking.setBirth_day(birth_day);
                    booking.setPhone(phone);
                    booking.setMail(mail);
                    booking.setAmount(amount);
                    booking.setType_room(type_room);
                    booking.setRoom_number(room_number);
                    booking.setPrice_day(price_day);
                    booking.setDate_in(date_in);
                    booking.setDate_out(date_out);
                    BookingController.add(booking);
                    showTable();
                    reset();
                    JOptionPane.showMessageDialog(rootPane, "Đặt phòng thành công!", "Thoát", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Đặt phòng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_addMouseClicked
    
    
    
    private void jButton_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_updateMouseClicked
        String fullname_client = jTextField_name_client.getText();
        String phone = jTextField_phone.getText();
        String mail = jTextField_mail.getText();
        int amount = Integer.parseInt(jTextField_amount.getText());
        String type_room = (String) jComboBox_type_room.getSelectedItem();
        int room_number = Integer.parseInt((String) jComboBox_room_number.getSelectedItem());
        float price_day = Float.parseFloat(jTextField_price_day.getText());

        Date birth_day = jDateChooser_birth_day.getDate();
        Date date_in = jDateChooser_date_in.getDate();
        Date date_out = jDateChooser_date_out.getDate();  
        
        int rowIndex = jTable_booking.getSelectedRow();

        if(rowIndex >= 0){
            try {
                Booking booking = new Booking(id, fullname_client, birth_day, phone, mail, amount, type_room, room_number, price_day, date_in, date_out);
                BookingController.update(booking);
                showTable();
                reset();
                
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn phòng cần cập nhật!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_updateMouseClicked
    
    private void jTable_bookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_bookingMouseClicked
        //load lại dữ liệu comboBox
        loadAllData();
        //lấy dữ liệu từ table đưa xuống các textbox
        DefaultTableModel model = (DefaultTableModel)jTable_booking.getModel();
        int rowIndex = jTable_booking.getSelectedRow();
        jTextField_name_client.setText(model.getValueAt(rowIndex,0).toString()); 
        jTextField_phone.setText(model.getValueAt(rowIndex,2).toString());
        jTextField_mail.setText(model.getValueAt(rowIndex,3).toString());
        jTextField_amount.setText(model.getValueAt(rowIndex,4).toString());
        jComboBox_type_room.setSelectedItem(model.getValueAt(rowIndex,5).toString());
        jComboBox_room_number.setSelectedItem(model.getValueAt(rowIndex,6).toString());
        jTextField_price_day.setText(model.getValueAt(rowIndex,7).toString());
        try {
            Date bithday = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex,1).toString());
            jDateChooser_birth_day.setDate(bithday);
            Date datein = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex,8).toString());
            jDateChooser_date_in.setDate(datein);
            Date dateout = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex,9).toString());
            jDateChooser_date_out.setDate(dateout);
        } catch (ParseException ex) {
            Logger.getLogger(ManageBookingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Lấy id của dòng được chọn
        getId();
    }//GEN-LAST:event_jTable_bookingMouseClicked
    
    public void getId(){
        int room_number = Integer.parseInt((String) jComboBox_room_number.getSelectedItem());
        BookingController bookingdao = new BookingController();
        List<Booking> list = bookingdao.findID(room_number); 
        if(list.size() >0){
            for(Booking item:list)
            {                       
                id = item.getId();
                roomnumber = item.getRoom_number();
            }
        }
    }
    
    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        String fullname_client = jTextField_search.getText();
        String phone = jTextField_search.getText();
        if(jTextField_search.getText().equals("")){
            showTable();
        }else{
            BookingController bookingC = new BookingController();
            jTable_booking.setModel(new DefaultTableModel(null, new Object[]{"Tên khách", "Ngày sinh", "Số điện thoại", "Mail", "Số người", "Loại phòng", "Số phòng", "Giá theo ngày", "Ngày nhận phòng", "Ngày trả dự kiến"}));
            DefaultTableModel tableModel = (DefaultTableModel) jTable_booking.getModel();
            List<Booking> list = bookingC.search(fullname_client, phone);
            
            if(list.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!", "Tìm kiếm", JOptionPane.OK_OPTION);
                showTable();
                jTextField_search.setText("");
            }else{
                for (int i = 0; i < list.size(); i++) {
                    Booking booking = (Booking)list.get(i);
                    Vector row = new Vector();
                    row.add(booking.getFullname_client());
                    row.add(booking.getBirth_day());
                    row.add(booking.getPhone());
                    row.add(booking.getMail());
                    row.add(booking.getAmount());
                    row.add(booking.getType_room());
                    row.add(booking.getRoom_number());
                    row.add(booking.getPrice_day());
                    row.add(booking.getDate_in());
                    row.add(booking.getDate_out());
                    tableModel.addRow(row);
                }
                jTextField_search.setText("");
            }
        }
        
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_check_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_check_inMouseClicked
        String fullname_client = jTextField_name_client.getText();
        String phone_number = jTextField_phone.getText();
        String mail = jTextField_mail.getText();
        int room_number = Integer.parseInt(jComboBox_room_number.getSelectedItem().toString());
        float price = Float.parseFloat(jTextField_price_day.getText());
        Calendar cal = Calendar.getInstance();
        Date date_in = cal.getTime();
        
        int rowIndex = jTable_booking.getSelectedRow();
        if(rowIndex >= 0){
            try {
                BookingDetails bd = new BookingDetails(fullname_client, phone_number, mail, room_number, price, date_in);
                
                bd.setFullname_client(fullname_client);
                bd.setPhone_number(phone_number);
                bd.setMail(mail);
                bd.setRoom_number(room_number);
                bd.setPrice(price);
                bd.setDate_in(date_in);
                
                BookingDetailsController.add(bd);
                
                // Xóa khỏi bảng đặt hàng.
                BookingController.delete(id);
                showTable();
                reset();
                
                
                //update status room 
                String status = "Using";
                Room room = new Room();
                room.setStatus(status);
                room.setRoom_number(room_number);
                RoomController.updateStatus(room);
                
                
                
                JOptionPane.showMessageDialog(rootPane, "Nhận phòng thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Nhận phòng thất bại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn đối tượng!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_check_inMouseClicked

    private void jComboBox_room_numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_room_numberMouseClicked
        if(jTextField_amount.getText().equals("")){
            // không làm gì cả
        }else{
            loadRoomNumber();
            loadPrice();
            
        }
    }//GEN-LAST:event_jComboBox_room_numberMouseClicked

    private void jComboBox_type_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_type_roomMouseClicked
        
        if(jTextField_amount.getText().equals("")){
            // không làm gì cả
        }else{
            loadRoomNumber();
            loadPrice();
            
        }
    }//GEN-LAST:event_jComboBox_type_roomMouseClicked

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
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_check_in;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<String> jComboBox_room_number;
    private javax.swing.JComboBox<String> jComboBox_type_room;
    private com.toedter.calendar.JDateChooser jDateChooser_birth_day;
    private com.toedter.calendar.JDateChooser jDateChooser_date_in;
    private com.toedter.calendar.JDateChooser jDateChooser_date_out;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_booking;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_name_client;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_price_day;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
