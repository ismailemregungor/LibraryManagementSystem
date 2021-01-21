
package library.management.system.member;

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
import library.management.system.operations.sign.IMemberOperations;

public class Member extends javax.swing.JFrame implements IMemberOperations {
    
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;

  
    public Member() {
        initComponents();
        memberLoad();
    }
    
   @Override
    public void memberLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from member");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblMemberTable.getModel();
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MemberUI = new javax.swing.JPanel();
        lblMemberName = new javax.swing.JLabel();
        txtMemberName = new javax.swing.JTextField();
        lblMemberAddress = new javax.swing.JLabel();
        lblMemberPhone = new javax.swing.JLabel();
        btnMemberAdd = new javax.swing.JLabel();
        btnMemberUpdate = new javax.swing.JLabel();
        btnMemberDelete = new javax.swing.JLabel();
        btnMemberBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMemberTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMemberAddress = new javax.swing.JTextArea();
        txtMemberPhone = new javax.swing.JTextField();
        lblMemberSearch = new javax.swing.JLabel();
        txtMemberSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Üye İşlemleri");
        setResizable(false);

        MemberUI.setBackground(new java.awt.Color(62, 71, 69));
        MemberUI.setToolTipText("");
        MemberUI.setFocusable(false);
        MemberUI.setPreferredSize(new java.awt.Dimension(610, 455));
        MemberUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMemberName.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberName.setText("Üye Adı");
        MemberUI.add(lblMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 180, 30));

        txtMemberName.setBackground(new java.awt.Color(62, 71, 69));
        txtMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMemberName.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MemberUI.add(txtMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, 50));

        lblMemberAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMemberAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberAddress.setText("Üye Adresi");
        MemberUI.add(lblMemberAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 180, 30));

        lblMemberPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMemberPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberPhone.setText("Üye Telefon No");
        MemberUI.add(lblMemberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 30));

        btnMemberAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMemberAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnMemberAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberAddMouseClicked(evt);
            }
        });
        MemberUI.add(btnMemberAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 70));

        btnMemberUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMemberUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_update.png"))); // NOI18N
        btnMemberUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberUpdateMouseClicked(evt);
            }
        });
        MemberUI.add(btnMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 220, 70));

        btnMemberDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMemberDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnMemberDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberDeleteMouseClicked(evt);
            }
        });
        MemberUI.add(btnMemberDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, 70));

        btnMemberBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMemberBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnMemberBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberBackMouseClicked(evt);
            }
        });
        MemberUI.add(btnMemberBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 220, 70));

        tblMemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Üye Id", "Üye Adı", "Üye Adresi", "Üye Telefon No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMemberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMemberTable);

        MemberUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 560, 540));

        txtMemberAddress.setColumns(20);
        txtMemberAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMemberAddress.setRows(5);
        txtMemberAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtMemberAddress);

        MemberUI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 210, 100));

        txtMemberPhone.setBackground(new java.awt.Color(62, 71, 69));
        txtMemberPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMemberPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MemberUI.add(txtMemberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 210, 50));

        lblMemberSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMemberSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberSearch.setText("Üye Ara");
        MemberUI.add(lblMemberSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 530, 180, 30));

        txtMemberSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtMemberSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMemberSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMemberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberSearchActionPerformed(evt);
            }
        });
        txtMemberSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMemberSearchKeyReleased(evt);
            }
        });
        MemberUI.add(txtMemberSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemberUI, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemberUI, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMemberAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberAddMouseClicked

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO Member(Name, Address, Phone) VALUES(?, ?, ?)");
            preparedStatement.setString(1, txtMemberName.getText());
            preparedStatement.setString(2, txtMemberAddress.getText());
            preparedStatement.setString(3, txtMemberPhone.getText());
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Üye Eklendi.");
                txtMemberName.setText("");
                txtMemberAddress.setText("");
                txtMemberPhone.setText("");
                txtMemberName.requestFocus();
                memberLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Üye Eklenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnMemberAddMouseClicked

    private void btnMemberUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberUpdateMouseClicked

        defaultTableModel = (DefaultTableModel) tblMemberTable.getModel();
        int selectIndex = tblMemberTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("UPDATE member set Name = ?, Address = ?, Phone = ? where Id = ?");
            preparedStatement.setString(1, txtMemberName.getText());
            preparedStatement.setString(2, txtMemberAddress.getText());
            preparedStatement.setString(3, txtMemberPhone.getText());
            preparedStatement.setInt(4, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Üye Güncellendi");
                txtMemberName.setText("");
                txtMemberAddress.setText("");
                txtMemberPhone.setText("");
                memberLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Üye Güncelenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnMemberUpdateMouseClicked

    private void btnMemberDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberDeleteMouseClicked

        defaultTableModel = (DefaultTableModel) tblMemberTable.getModel();
        int selectIndex = tblMemberTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM member where id = ?");
            preparedStatement.setInt(1, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Üye Silindi");
                txtMemberName.setText("");
                txtMemberAddress.setText("");
                txtMemberPhone.setText("");
                txtMemberName.requestFocus();
                memberLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Üye Silinemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }
    }//GEN-LAST:event_btnMemberDeleteMouseClicked

    private void btnMemberBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnMemberBackMouseClicked

    private void tblMemberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberTableMouseClicked

        defaultTableModel = (DefaultTableModel) tblMemberTable.getModel();
        int selectIndex = tblMemberTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtMemberName.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        txtMemberAddress.setText(defaultTableModel.getValueAt(selectIndex, 2).toString());
        txtMemberPhone.setText(defaultTableModel.getValueAt(selectIndex, 3).toString());

    }//GEN-LAST:event_tblMemberTableMouseClicked

    private void txtMemberSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberSearchKeyReleased

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblMemberTable.getModel();
        String search = txtMemberSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblMemberTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtMemberSearchKeyReleased

    private void txtMemberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberSearchActionPerformed
    }//GEN-LAST:event_txtMemberSearchActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MemberUI;
    private javax.swing.JLabel btnMemberAdd;
    private javax.swing.JLabel btnMemberBack;
    private javax.swing.JLabel btnMemberDelete;
    private javax.swing.JLabel btnMemberUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMemberAddress;
    private javax.swing.JLabel lblMemberName;
    private javax.swing.JLabel lblMemberPhone;
    private javax.swing.JLabel lblMemberSearch;
    private javax.swing.JTable tblMemberTable;
    private javax.swing.JTextArea txtMemberAddress;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JTextField txtMemberPhone;
    private javax.swing.JTextField txtMemberSearch;
    // End of variables declaration//GEN-END:variables

}
