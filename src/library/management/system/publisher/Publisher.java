
package library.management.system.publisher;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import library.management.system.operations.sign.IPublisherOperations;


public class Publisher extends javax.swing.JFrame implements IPublisherOperations{

    public Publisher() {
        initComponents();
        publisherLoad();
    }
    
    @Override
    public void publisherLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from publisher");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblPublisherTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("Id"));
                       vector.add(resultSet.getString("Name"));
                       vector.add(resultSet.getString("Address"));
                       vector.add(resultSet.getString("Phone"));

                }
                
                defaultTableModel.addRow(vector);
                                
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }
        
    }
    
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PublisherUI = new javax.swing.JPanel();
        lblPublisherName = new javax.swing.JLabel();
        txtPublisherName = new javax.swing.JTextField();
        lblPublisherAddress = new javax.swing.JLabel();
        lblPublisherPhone = new javax.swing.JLabel();
        btnPublisherAdd = new javax.swing.JLabel();
        btnPublisherUpdate = new javax.swing.JLabel();
        btnPublisherDelete = new javax.swing.JLabel();
        btnPublisherBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPublisherTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPublisherAddress = new javax.swing.JTextArea();
        txtPublisherPhone = new javax.swing.JTextField();
        lblPublisherSearch = new javax.swing.JLabel();
        txtPublisherSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Yayıncı İşlemleri");
        setResizable(false);

        PublisherUI.setBackground(new java.awt.Color(62, 71, 69));
        PublisherUI.setToolTipText("");
        PublisherUI.setFocusable(false);
        PublisherUI.setPreferredSize(new java.awt.Dimension(610, 455));
        PublisherUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPublisherName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPublisherName.setForeground(new java.awt.Color(255, 255, 255));
        lblPublisherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublisherName.setText("Yayıncı Adı");
        PublisherUI.add(lblPublisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 30));

        txtPublisherName.setBackground(new java.awt.Color(62, 71, 69));
        txtPublisherName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPublisherName.setForeground(new java.awt.Color(255, 255, 255));
        txtPublisherName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPublisherName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PublisherUI.add(txtPublisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 210, 50));

        lblPublisherAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPublisherAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPublisherAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublisherAddress.setText("Yayıncı Adresi");
        PublisherUI.add(lblPublisherAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 30));

        lblPublisherPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPublisherPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPublisherPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublisherPhone.setText("Yayıncı Telefeon No");
        PublisherUI.add(lblPublisherPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, 30));

        btnPublisherAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPublisherAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnPublisherAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublisherAddMouseClicked(evt);
            }
        });
        PublisherUI.add(btnPublisherAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 70));

        btnPublisherUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPublisherUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_update.png"))); // NOI18N
        btnPublisherUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublisherUpdateMouseClicked(evt);
            }
        });
        PublisherUI.add(btnPublisherUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 220, 70));

        btnPublisherDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPublisherDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnPublisherDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublisherDeleteMouseClicked(evt);
            }
        });
        PublisherUI.add(btnPublisherDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 70));

        btnPublisherBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPublisherBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnPublisherBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublisherBackMouseClicked(evt);
            }
        });
        PublisherUI.add(btnPublisherBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 220, 70));

        tblPublisherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yayıncı  Id", "Yayıncı Adı", "Yayıncı Adresi", "Yayıncı Telefon No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPublisherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPublisherTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPublisherTable);

        PublisherUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 560, 610));

        txtPublisherAddress.setColumns(20);
        txtPublisherAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPublisherAddress.setRows(5);
        txtPublisherAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtPublisherAddress);

        PublisherUI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 210, 110));

        txtPublisherPhone.setBackground(new java.awt.Color(62, 71, 69));
        txtPublisherPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPublisherPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtPublisherPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPublisherPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PublisherUI.add(txtPublisherPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 210, 50));

        lblPublisherSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPublisherSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblPublisherSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublisherSearch.setText("Yayıncı Ara");
        PublisherUI.add(lblPublisherSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 180, 30));

        txtPublisherSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtPublisherSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPublisherSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtPublisherSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPublisherSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPublisherSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPublisherSearchKeyReleased(evt);
            }
        });
        PublisherUI.add(txtPublisherSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PublisherUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PublisherUI, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPublisherAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublisherAddMouseClicked

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO Publisher(Name, Address, Phone) VALUES(?, ?, ?)");
            preparedStatement.setString(1, txtPublisherName.getText());
            preparedStatement.setString(2, txtPublisherAddress.getText());
            preparedStatement.setString(3, txtPublisherPhone.getText());
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Yayıncı Eklendi.");
                txtPublisherName.setText("");
                txtPublisherAddress.setText("");
                txtPublisherPhone.setText("");
                txtPublisherName.requestFocus();
                publisherLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Yayıncı Eklenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnPublisherAddMouseClicked

    private void btnPublisherUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublisherUpdateMouseClicked

        defaultTableModel = (DefaultTableModel) tblPublisherTable.getModel();
        int selectIndex = tblPublisherTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("UPDATE publisher set Name = ?, Address = ?, Phone = ? where Id = ?");
            preparedStatement.setString(1, txtPublisherName.getText());
            preparedStatement.setString(2, txtPublisherAddress.getText());
            preparedStatement.setString(3, txtPublisherPhone.getText());
            preparedStatement.setInt(4, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Yayıncı Güncellendi");
                txtPublisherName.setText("");
                txtPublisherAddress.setText("");
                txtPublisherPhone.setText("");
                publisherLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Yayıncı Güncelenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnPublisherUpdateMouseClicked

    private void btnPublisherDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublisherDeleteMouseClicked

        defaultTableModel = (DefaultTableModel) tblPublisherTable.getModel();
        int selectIndex = tblPublisherTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM publisher where id = ?");
            preparedStatement.setInt(1, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Yayıncı Silindi");
                txtPublisherName.setText("");
                txtPublisherAddress.setText("");
                txtPublisherPhone.setText("");
                txtPublisherName.requestFocus();
                publisherLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Yayıncı Silinemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }
    }//GEN-LAST:event_btnPublisherDeleteMouseClicked

    private void btnPublisherBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublisherBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnPublisherBackMouseClicked

    private void tblPublisherTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPublisherTableMouseClicked

        defaultTableModel = (DefaultTableModel) tblPublisherTable.getModel();
        int selectIndex = tblPublisherTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtPublisherName.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        txtPublisherAddress.setText(defaultTableModel.getValueAt(selectIndex, 2).toString());
        txtPublisherPhone.setText(defaultTableModel.getValueAt(selectIndex, 3).toString());

    }//GEN-LAST:event_tblPublisherTableMouseClicked

    private void txtPublisherSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPublisherSearchKeyReleased

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblPublisherTable.getModel();
        String search = txtPublisherSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblPublisherTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtPublisherSearchKeyReleased


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publisher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PublisherUI;
    private javax.swing.JLabel btnPublisherAdd;
    private javax.swing.JLabel btnPublisherBack;
    private javax.swing.JLabel btnPublisherDelete;
    private javax.swing.JLabel btnPublisherUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPublisherAddress;
    private javax.swing.JLabel lblPublisherName;
    private javax.swing.JLabel lblPublisherPhone;
    private javax.swing.JLabel lblPublisherSearch;
    private javax.swing.JTable tblPublisherTable;
    private javax.swing.JTextArea txtPublisherAddress;
    private javax.swing.JTextField txtPublisherName;
    private javax.swing.JTextField txtPublisherPhone;
    private javax.swing.JTextField txtPublisherSearch;
    // End of variables declaration//GEN-END:variables

}
