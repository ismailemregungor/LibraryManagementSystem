
package library.management.system.lendbook;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import javax.swing.*;
import javax.swing.table.TableRowSorter;
import library.management.system.log.BaseLogger;
import library.management.system.log.DatabaseLogger;
import library.management.system.log.TableLogger;
import library.management.system.operations.sign.ILendBookOperations;


public class LendBook extends javax.swing.JFrame implements ILendBookOperations{
    
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;
  
    public LendBook() {
        initComponents();
        bookItemLoad();
        lendBookLoad();
    }
    
        //Polimorfizm kullanımı için loglayıcı metodumuz
        public static void logger(BaseLogger baseLogger){
            
            baseLogger.log(""); 

        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookUI = new javax.swing.JPanel();
        lblLendBookMemberId = new javax.swing.JLabel();
        txtLendBookMemberId = new javax.swing.JTextField();
        lblLendBookLendDate = new javax.swing.JLabel();
        btnLendBookAdd = new javax.swing.JLabel();
        btnLendBookDelete = new javax.swing.JLabel();
        btnLendBookBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLendBookTable = new javax.swing.JTable();
        chkLendBookBookName = new javax.swing.JComboBox();
        lblLendBookMemberName = new javax.swing.JLabel();
        lblLendBookBookName = new javax.swing.JLabel();
        lblLendBookReturnDate = new javax.swing.JLabel();
        txtLendBookMemberName = new javax.swing.JTextField();
        dcLendBookReturnDate = new com.toedter.calendar.JDateChooser();
        dcLendBookLendDate = new com.toedter.calendar.JDateChooser();
        lblLendBookSearch = new javax.swing.JLabel();
        txtLendBookSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Kitap Çıkış İşlemleri");
        setResizable(false);

        BookUI.setBackground(new java.awt.Color(62, 71, 69));
        BookUI.setToolTipText("");
        BookUI.setFocusable(false);
        BookUI.setPreferredSize(new java.awt.Dimension(610, 455));
        BookUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLendBookMemberId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookMemberId.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookMemberId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookMemberId.setText("Üye Id");
        BookUI.add(lblLendBookMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 180, 30));

        txtLendBookMemberId.setBackground(new java.awt.Color(62, 71, 69));
        txtLendBookMemberId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLendBookMemberId.setForeground(new java.awt.Color(255, 255, 255));
        txtLendBookMemberId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLendBookMemberId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtLendBookMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLendBookMemberIdKeyPressed(evt);
            }
        });
        BookUI.add(txtLendBookMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, 50));

        lblLendBookLendDate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookLendDate.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookLendDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookLendDate.setText("Veriliş Tarihi");
        BookUI.add(lblLendBookLendDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, 30));

        btnLendBookAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLendBookAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnLendBookAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLendBookAddMouseClicked(evt);
            }
        });
        BookUI.add(btnLendBookAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 220, 70));

        btnLendBookDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLendBookDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnLendBookDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLendBookDeleteMouseClicked(evt);
            }
        });
        BookUI.add(btnLendBookDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 220, 70));

        btnLendBookBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLendBookBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnLendBookBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLendBookBackMouseClicked(evt);
            }
        });
        BookUI.add(btnLendBookBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 220, 70));

        tblLendBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ödünc Id", "Üye Adı", "Kitap Adı", "Çıkış Tarihi", "Dönüş Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLendBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLendBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLendBookTable);

        BookUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 620, 620));

        chkLendBookBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkLendBookBookName.setForeground(new java.awt.Color(0, 0, 0));
        chkLendBookBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(chkLendBookBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 210, -1));

        lblLendBookMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookMemberName.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookMemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookMemberName.setText("Üye Adı");
        BookUI.add(lblLendBookMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 180, 30));

        lblLendBookBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookBookName.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookBookName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookBookName.setText("Kitap Adı");
        BookUI.add(lblLendBookBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 30));

        lblLendBookReturnDate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookReturnDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookReturnDate.setText("Dönüş Tarihi");
        BookUI.add(lblLendBookReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 180, 30));

        txtLendBookMemberName.setBackground(new java.awt.Color(62, 71, 69));
        txtLendBookMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLendBookMemberName.setForeground(new java.awt.Color(255, 255, 255));
        txtLendBookMemberName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLendBookMemberName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtLendBookMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, 50));

        dcLendBookReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        BookUI.add(dcLendBookReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 210, 40));

        dcLendBookLendDate.setForeground(new java.awt.Color(255, 255, 255));
        BookUI.add(dcLendBookLendDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 210, 40));

        lblLendBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLendBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblLendBookSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookSearch.setText("Ödunç Kitap Ara");
        BookUI.add(lblLendBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 180, 30));

        txtLendBookSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtLendBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLendBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtLendBookSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLendBookSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtLendBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLendBookSearchActionPerformed(evt);
            }
        });
        txtLendBookSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLendBookSearchKeyReleased(evt);
            }
        });
        BookUI.add(txtLendBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookUI, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
 
   @Override
    public void bookItemLoad(){
       
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from book");
            resultSet = preparedStatement.executeQuery();
            chkLendBookBookName.removeAllItems();
      
            
            while(resultSet.next()){
                
                chkLendBookBookName.addItem(new BookItem(resultSet.getInt(1), resultSet.getString(2)));               
                  
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }

   }
   
    

   @Override
    public void lendBookLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select l.Id, m.Name, b.BookName, l.LendDate, l.ReturnDate from lendbook l JOIN member m ON l.MemberId = m.id JOIN book b ON l.BookId = b.Id");
            resultSet = preparedStatement.executeQuery();
            
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            
            defaultTableModel = (DefaultTableModel) tblLendBookTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("l.Id"));
                       vector.add(resultSet.getString("m.Name"));
                       vector.add(resultSet.getString("b.BookName"));
                       vector.add(resultSet.getString("l.LendDate"));
                       vector.add(resultSet.getString("l.ReturnDate"));
                       chkLendBookBookName.setSelectedIndex(-1);

                }
                
                defaultTableModel.addRow(vector);
                                
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }
        
    }
    
    private void btnLendBookAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLendBookAddMouseClicked

        BookItem bookItem = (BookItem) chkLendBookBookName.getSelectedItem();
        
        SimpleDateFormat lendSimpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd");
        String lendDate = lendSimpleDateFormat.format(dcLendBookLendDate.getDate());
        
        SimpleDateFormat  returnSimpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd");
        String returnDate = returnSimpleDateFormat.format(dcLendBookReturnDate.getDate());
        
        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO lendbook(MemberId, MemberName, BookId, LendDate, ReturnDate) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, txtLendBookMemberId.getText());
            preparedStatement.setString(2, txtLendBookMemberName.getText());
            preparedStatement.setInt(3, bookItem.getId());
            preparedStatement.setString(4, lendDate);
            preparedStatement.setString(5, returnDate);

            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Kitap Ödünç Verme işlemi Gerçekleşti.");
                
                // Polimorfizm
               
               //BaseLogger baseLogger1 = new DatabaseLogger();
               //logger(baseLogger1);
               
                //BaseLogger baseLogger2 = new TableLogger();
               //logger(baseLogger2);
               
               //BaseLogger baseLogger = new BaseLogger();
               //logger(baseLogger);
               
               logger(new DatabaseLogger());
               logger(new TableLogger());
               logger(new BaseLogger());
               

               
               
                txtLendBookMemberId.setText("");
                txtLendBookMemberName.setText("");
                chkLendBookBookName.setSelectedIndex(-1);
                txtLendBookMemberId.requestFocus();
                lendBookLoad();
               
            }
            else{

                JOptionPane.showMessageDialog(this, "Kitap Ödünç Verme işlemi Başarılı Olmadı!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }
    }//GEN-LAST:event_btnLendBookAddMouseClicked

    private void btnLendBookDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLendBookDeleteMouseClicked

        defaultTableModel = (DefaultTableModel) tblLendBookTable.getModel();
        int selectIndex = tblLendBookTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM lendbook where id = ?");
            preparedStatement.setInt(1, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Ödünç Verme Kaydı Silindi.");
                
               logger(new DatabaseLogger());
               logger(new TableLogger());
               logger(new BaseLogger());
                
                txtLendBookMemberId.setText("");
                chkLendBookBookName.setSelectedIndex(-1);
                txtLendBookMemberId.setText("");
                txtLendBookMemberName.setText("");
                txtLendBookMemberId.requestFocus();
                lendBookLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Ödünç Verme Kaydı Silinemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }
    }//GEN-LAST:event_btnLendBookDeleteMouseClicked

    private void btnLendBookBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLendBookBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnLendBookBackMouseClicked

    private void tblLendBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLendBookTableMouseClicked

        defaultTableModel = (DefaultTableModel) tblLendBookTable.getModel();
        int selectIndex = tblLendBookTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtLendBookMemberId.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        txtLendBookMemberName.setText(defaultTableModel.getValueAt(selectIndex, 2).toString());

    }//GEN-LAST:event_tblLendBookTableMouseClicked

    private void txtLendBookMemberIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLendBookMemberIdKeyPressed
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
            String memberId = txtLendBookMemberId.getText();
            
            try {
                
                 preparedStatement = (PreparedStatement) connection.prepareStatement("select * from member where id = ?");
                 preparedStatement.setString(1, memberId);
                 resultSet = preparedStatement.executeQuery();
                 
                 if(resultSet.next() == false){
                     
                     JOptionPane.showMessageDialog(this, "Üye Id bulunamadı.");
                     txtLendBookMemberId.setText("");
                 
                 }
                 
                 else{
                     
                     String memberName = resultSet.getString("Name");
                     txtLendBookMemberName.setText(memberName.trim());
                 }
                
            } catch (Exception sqlException) {
                System.out.println("MySQL Veritabanından veri çekerken hata oldu!: " + sqlException);
            }
            
        }
        
    }//GEN-LAST:event_txtLendBookMemberIdKeyPressed

    private void txtLendBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLendBookSearchActionPerformed
    }//GEN-LAST:event_txtLendBookSearchActionPerformed

    private void txtLendBookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLendBookSearchKeyReleased

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblLendBookTable.getModel();
        String search = txtLendBookSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblLendBookTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtLendBookSearchKeyReleased


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LendBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookUI;
    private javax.swing.JLabel btnLendBookAdd;
    private javax.swing.JLabel btnLendBookBack;
    private javax.swing.JLabel btnLendBookDelete;
    private javax.swing.JComboBox chkLendBookBookName;
    private com.toedter.calendar.JDateChooser dcLendBookLendDate;
    private com.toedter.calendar.JDateChooser dcLendBookReturnDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLendBookBookName;
    private javax.swing.JLabel lblLendBookLendDate;
    private javax.swing.JLabel lblLendBookMemberId;
    private javax.swing.JLabel lblLendBookMemberName;
    private javax.swing.JLabel lblLendBookReturnDate;
    private javax.swing.JLabel lblLendBookSearch;
    private javax.swing.JTable tblLendBookTable;
    private javax.swing.JTextField txtLendBookMemberId;
    private javax.swing.JTextField txtLendBookMemberName;
    private javax.swing.JTextField txtLendBookSearch;
    // End of variables declaration//GEN-END:variables

}
