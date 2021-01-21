package library.management.system.returnbook;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import java.sql.*;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import library.management.system.log.BaseLogger;
import library.management.system.log.DatabaseLogger;
import library.management.system.log.TableLogger;
import library.management.system.operations.sign.IReturnBookOperations;

public class ReturnBook extends javax.swing.JFrame implements IReturnBookOperations {
    
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;
  
    public ReturnBook() {
        initComponents();
        returnBookLoad();
    }
    

        //Polimorfizm  için loglayıcı metodumuz
        public static void logger(BaseLogger baseLogger){
            
            baseLogger.log(""); 

        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookUI = new javax.swing.JPanel();
        lblReturnBookMemberId = new javax.swing.JLabel();
        btnReturnBookAdd = new javax.swing.JLabel();
        btnReturnBookDelete = new javax.swing.JLabel();
        btnReturnBookBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnBookTable = new javax.swing.JTable();
        lblReturnBookMemberName = new javax.swing.JLabel();
        lblReturnBookBookName = new javax.swing.JLabel();
        lblReturnBookPassingDay = new javax.swing.JLabel();
        txtReturnBookMemberId = new javax.swing.JTextField();
        txtReturnBookPassingDay = new javax.swing.JTextField();
        lblReturnBookReturnDate = new javax.swing.JLabel();
        txtReturnBookMemberName = new javax.swing.JTextField();
        txtReturnBookReturnDate = new javax.swing.JTextField();
        txtReturnBookBookName = new javax.swing.JTextField();
        lblReturnBookSearch = new javax.swing.JLabel();
        txtReturnBookSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Kitap Dönüş İşlemleri");
        setResizable(false);

        BookUI.setBackground(new java.awt.Color(62, 71, 69));
        BookUI.setToolTipText("");
        BookUI.setFocusable(false);
        BookUI.setPreferredSize(new java.awt.Dimension(610, 455));
        BookUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReturnBookMemberId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookMemberId.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookMemberId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookMemberId.setText("Üye Id");
        BookUI.add(lblReturnBookMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 30, 180, 30));

        btnReturnBookAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturnBookAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnReturnBookAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBookAddMouseClicked(evt);
            }
        });
        BookUI.add(btnReturnBookAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 220, 70));

        btnReturnBookDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturnBookDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnReturnBookDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBookDeleteMouseClicked(evt);
            }
        });
        BookUI.add(btnReturnBookDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 220, 70));

        btnReturnBookBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturnBookBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnReturnBookBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBookBackMouseClicked(evt);
            }
        });
        BookUI.add(btnReturnBookBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 220, 70));

        tblReturnBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teslim Id", "Üye Id", "Üye Adı", "Kitap Adı", "Dönüş Tarihi", "Geçen Gün"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReturnBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReturnBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReturnBookTable);

        BookUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 620, 630));

        lblReturnBookMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookMemberName.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookMemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookMemberName.setText("Üye Adı");
        BookUI.add(lblReturnBookMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 110, 170, 30));

        lblReturnBookBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookBookName.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookBookName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookBookName.setText("Kitap Adı");
        BookUI.add(lblReturnBookBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 190, 180, 30));

        lblReturnBookPassingDay.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookPassingDay.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookPassingDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookPassingDay.setText("Geçen Gün");
        BookUI.add(lblReturnBookPassingDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 350, 190, 30));

        txtReturnBookMemberId.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookMemberId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookMemberId.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookMemberId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookMemberId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtReturnBookMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReturnBookMemberIdKeyPressed(evt);
            }
        });
        BookUI.add(txtReturnBookMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 50));

        txtReturnBookPassingDay.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookPassingDay.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookPassingDay.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookPassingDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookPassingDay.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtReturnBookPassingDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 210, 50));

        lblReturnBookReturnDate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookReturnDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookReturnDate.setText("Dönüş Tarihi");
        BookUI.add(lblReturnBookReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 180, 30));

        txtReturnBookMemberName.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookMemberName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookMemberName.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookMemberName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookMemberName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtReturnBookMemberName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReturnBookMemberNameKeyPressed(evt);
            }
        });
        BookUI.add(txtReturnBookMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, 50));

        txtReturnBookReturnDate.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookReturnDate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookReturnDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookReturnDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtReturnBookReturnDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReturnBookReturnDateKeyPressed(evt);
            }
        });
        BookUI.add(txtReturnBookReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 210, 50));

        txtReturnBookBookName.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookBookName.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookBookName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtReturnBookBookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReturnBookBookNameKeyPressed(evt);
            }
        });
        BookUI.add(txtReturnBookBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 210, 50));

        lblReturnBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblReturnBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblReturnBookSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookSearch.setText("Dönen Kitap Ara");
        BookUI.add(lblReturnBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 180, 30));

        txtReturnBookSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtReturnBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReturnBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnBookSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReturnBookSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtReturnBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnBookSearchActionPerformed(evt);
            }
        });
        txtReturnBookSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReturnBookSearchKeyReleased(evt);
            }
        });
        BookUI.add(txtReturnBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookUI, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookUI, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void returnBookLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from returnbook");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblReturnBookTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("Id"));
                       vector.add(resultSet.getString("MemberId"));
                       vector.add(resultSet.getString("MemberName"));
                       vector.add(resultSet.getString("BookName"));
                       vector.add(resultSet.getString("ReturnDate"));
                       vector.add(resultSet.getString("PassingDay"));
                      

                }
                
                defaultTableModel.addRow(vector);
                                
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }
        
    }

    
    private void btnReturnBookAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBookAddMouseClicked

            String memberId = txtReturnBookMemberId.getText();
        
        
                try {
            
                        preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO returnbook(MemberId, MemberName, BookName, ReturnDate, PassingDay) VALUES (?, ?, ?, ?, ?)");
                        preparedStatement.setString(1, txtReturnBookMemberId.getText());
                        preparedStatement.setString(2, txtReturnBookMemberName.getText());
                        preparedStatement.setString(3, txtReturnBookBookName.getText());
                        preparedStatement.setString(4, txtReturnBookReturnDate.getText());
                        preparedStatement.setString(5, txtReturnBookPassingDay.getText());
     
                        int successful = preparedStatement.executeUpdate();
                        
                        preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM lendbook where MemberId = ?");
                        preparedStatement.setString(1, memberId);
                        preparedStatement.executeUpdate();
                      
                        if(successful == 1){
                
                                JOptionPane.showMessageDialog(this, "Dönen Kitap Eklendi!");
                                
                                  logger(new DatabaseLogger());
                                  logger(new TableLogger());
                                  logger(new BaseLogger());
                                
                                txtReturnBookMemberId.setText("");
                                txtReturnBookMemberName.setText("");
                                txtReturnBookBookName.setText("");
                                txtReturnBookReturnDate.setText("");
                                txtReturnBookPassingDay.setText("");
                                txtReturnBookMemberId.requestFocus();
                                returnBookLoad();
                                

                            }
                        else{
                
                                JOptionPane.showMessageDialog(this, "Dönen Kitap Eklendi!");
                
                            }
            
                    } catch (SQLException sqlException) {
                        System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
                    }
                
    }//GEN-LAST:event_btnReturnBookAddMouseClicked

    private void btnReturnBookDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBookDeleteMouseClicked

                defaultTableModel = (DefaultTableModel) tblReturnBookTable.getModel();
                int selectIndex = tblReturnBookTable.getSelectedRow();
                int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        
                try {
            
                        preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM returnbook where id = ?");
                        preparedStatement.setInt(1, id);
                        int successful = preparedStatement.executeUpdate();
            
                        if(successful == 1){
                
                                JOptionPane.showMessageDialog(this, "Kitap Geri Dönüş İşlemi Silindi");
                                
                                
                                  logger(new DatabaseLogger());
                                  logger(new TableLogger());
                                  logger(new BaseLogger());
                                
                                txtReturnBookMemberId.setText("");
                                txtReturnBookMemberName.setText("");
                                txtReturnBookBookName.setText("");
                                txtReturnBookReturnDate.setText("");
                                txtReturnBookPassingDay.setText("");
                                returnBookLoad();
                
                            }
                        else{
                
                                JOptionPane.showMessageDialog(this, "Kitap Silinemedi!");
                
                            }
            
                    } catch (SQLException sqlException) {
                        System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
                    }
    }//GEN-LAST:event_btnReturnBookDeleteMouseClicked

    private void btnReturnBookBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBookBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnReturnBookBackMouseClicked

    private void tblReturnBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReturnBookTableMouseClicked

        
    }//GEN-LAST:event_tblReturnBookTableMouseClicked

    private void txtReturnBookMemberIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReturnBookMemberIdKeyPressed
        
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
            String memberId = txtReturnBookMemberId.getText();
            
            try {
                
                 preparedStatement = (PreparedStatement) connection.prepareStatement("select m.Name, b.BookName, l.ReturnDate, DATEDIFF(now(), l.ReturnDate) as elap from lendbook l JOIN member m ON l.MemberId = m.Id JOIN book b ON l.BookId = b.Id and l.MemberId = ?");
                 preparedStatement.setString(1, memberId);
                 resultSet = preparedStatement.executeQuery();
                 
                 if(resultSet.next() == false){
                     
                     JOptionPane.showMessageDialog(this, "Üye Id bulunamadı.");
                     txtReturnBookMemberId.setText("");
                 
                 }
                 
                 else{
                     
                     String memberName = resultSet.getString("m.Name");
                     txtReturnBookMemberName.setText(memberName.trim());
                     
                     String bookName = resultSet.getString("b.BookName");  
                     txtReturnBookBookName.setText(bookName.trim());
                     
                     String returnDate = resultSet.getString("l.ReturnDate");  
                     txtReturnBookReturnDate.setText(returnDate.trim());
                     
                     String passingDay = resultSet.getString("elap");  
                     int passing = Integer.parseInt(passingDay);
                     
                     if(passing > 0){
                         
                         txtReturnBookPassingDay.setText(passingDay);
                      
                     }
                     
                     else{
                     
                         txtReturnBookPassingDay.setText("0");
                     }
                             
                     
                 }
                
            } catch (Exception sqlException) {
                System.out.println("MySQL Veritabanından veri çekerken hata oldu!: " + sqlException);
            }
            
        }
               
    }//GEN-LAST:event_txtReturnBookMemberIdKeyPressed

    private void txtReturnBookMemberNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReturnBookMemberNameKeyPressed
    }//GEN-LAST:event_txtReturnBookMemberNameKeyPressed

    private void txtReturnBookReturnDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReturnBookReturnDateKeyPressed
    }//GEN-LAST:event_txtReturnBookReturnDateKeyPressed

    private void txtReturnBookBookNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReturnBookBookNameKeyPressed
    }//GEN-LAST:event_txtReturnBookBookNameKeyPressed

    private void txtReturnBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnBookSearchActionPerformed
    }//GEN-LAST:event_txtReturnBookSearchActionPerformed

    private void txtReturnBookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReturnBookSearchKeyReleased

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblReturnBookTable.getModel();
        String search = txtReturnBookSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblReturnBookTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtReturnBookSearchKeyReleased

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookUI;
    private javax.swing.JLabel btnReturnBookAdd;
    private javax.swing.JLabel btnReturnBookBack;
    private javax.swing.JLabel btnReturnBookDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReturnBookBookName;
    private javax.swing.JLabel lblReturnBookMemberId;
    private javax.swing.JLabel lblReturnBookMemberName;
    private javax.swing.JLabel lblReturnBookPassingDay;
    private javax.swing.JLabel lblReturnBookReturnDate;
    private javax.swing.JLabel lblReturnBookSearch;
    private javax.swing.JTable tblReturnBookTable;
    private javax.swing.JTextField txtReturnBookBookName;
    private javax.swing.JTextField txtReturnBookMemberId;
    private javax.swing.JTextField txtReturnBookMemberName;
    private javax.swing.JTextField txtReturnBookPassingDay;
    private javax.swing.JTextField txtReturnBookReturnDate;
    private javax.swing.JTextField txtReturnBookSearch;
    // End of variables declaration//GEN-END:variables

}
