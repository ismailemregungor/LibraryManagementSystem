
package library.management.system.book;

import library.management.system.category.CategoryItem;
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
import library.management.system.author.AuthorItem;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import library.management.system.operations.sign.IBookOperations;
import library.management.system.publisher.PublisherItem;


public class Book extends javax.swing.JFrame implements IBookOperations{

  
    public Book() {
        initComponents();
        bookLoad();
        categoryItemLoad();
        authorItemLoad();
        publisherItemLoad();
    }

   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;

   
    @Override
   public void bookLoad(){
        
         int rowCount;
          
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from book");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblBookTable.getModel();
            defaultTableModel.setRowCount(0);
                 
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("Id"));
                       vector.add(resultSet.getString("BookName"));
                       vector.add(resultSet.getString("Category"));
                       vector.add(resultSet.getString("Author"));
                       vector.add(resultSet.getString("Publisher"));
                       vector.add(resultSet.getString("Contents"));
                       vector.add(resultSet.getString("PageCount"));
                       vector.add(resultSet.getString("EditionYear"));
                        chkBookCategoryName.setSelectedIndex(-1);
                        chkBookAuthorName.setSelectedIndex(-1);
                        chkBookPublisherName.setSelectedIndex(-1);  
                                 
                }
                
                defaultTableModel.addRow(vector);
                                   
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }
        
    }

    @Override
   public void categoryItemLoad(){
       
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from category");
            resultSet = preparedStatement.executeQuery();
            chkBookCategoryName.removeAllItems();
      
            
            while(resultSet.next()){
                
                //abstract class implemente ettim
                chkBookCategoryName.addItem(new CategoryItem(resultSet.getInt(1), resultSet.getString(2)) {});
           
                  
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }

   }
   
    @Override
   public void authorItemLoad(){
       
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from author");
            resultSet = preparedStatement.executeQuery();
            chkBookAuthorName.removeAllItems();
      
            
            while(resultSet.next()){
                
                //abstract class implemente ettim
                chkBookAuthorName.addItem(new AuthorItem(resultSet.getInt(1), resultSet.getString(2)) {});
                
                  
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }

   }
   
    @Override
   public void publisherItemLoad(){
       
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from publisher");
            resultSet = preparedStatement.executeQuery();
            chkBookPublisherName.removeAllItems();
      
            
            while(resultSet.next()){
                
                //abstract class implemente ettim
                chkBookPublisherName.addItem(new PublisherItem(resultSet.getInt(1), resultSet.getString(2)) {} );
                
                  
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }

   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookUI = new javax.swing.JPanel();
        lblBookName = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        lblBookEditionYear = new javax.swing.JLabel();
        lblBookPublisherName = new javax.swing.JLabel();
        btnBookAdd = new javax.swing.JLabel();
        btnBookUpdate = new javax.swing.JLabel();
        btnBookDelete = new javax.swing.JLabel();
        btnBookBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookTable = new javax.swing.JTable();
        txtBookEditionYear = new javax.swing.JTextField();
        chkBookPublisherName = new javax.swing.JComboBox();
        chkBookCategoryName = new javax.swing.JComboBox();
        chkBookAuthorName = new javax.swing.JComboBox();
        lblBookCategoryName = new javax.swing.JLabel();
        lblBookAuthorName = new javax.swing.JLabel();
        lblBookContents = new javax.swing.JLabel();
        txtBookContents = new javax.swing.JTextField();
        lblBookPageCount = new javax.swing.JLabel();
        txtBookPageCount = new javax.swing.JTextField();
        lblBookSearch = new javax.swing.JLabel();
        txtBookSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Kitap İşlemleri");
        setResizable(false);

        BookUI.setBackground(new java.awt.Color(62, 71, 69));
        BookUI.setToolTipText("");
        BookUI.setFocusable(false);
        BookUI.setPreferredSize(new java.awt.Dimension(610, 455));
        BookUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookName.setForeground(new java.awt.Color(255, 255, 255));
        lblBookName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookName.setText("Kitap Adı");
        BookUI.add(lblBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 180, 30));

        txtBookName.setBackground(new java.awt.Color(62, 71, 69));
        txtBookName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBookName.setForeground(new java.awt.Color(255, 255, 255));
        txtBookName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 210, 50));

        lblBookEditionYear.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookEditionYear.setForeground(new java.awt.Color(255, 255, 255));
        lblBookEditionYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookEditionYear.setText("Basım Sayısı");
        BookUI.add(lblBookEditionYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 30));

        lblBookPublisherName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookPublisherName.setForeground(new java.awt.Color(255, 255, 255));
        lblBookPublisherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookPublisherName.setText("Yayıncı Adı");
        BookUI.add(lblBookPublisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 190, 30));

        btnBookAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnBookAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookAddMouseClicked(evt);
            }
        });
        BookUI.add(btnBookAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 220, 70));

        btnBookUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_update.png"))); // NOI18N
        btnBookUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookUpdateMouseClicked(evt);
            }
        });
        BookUI.add(btnBookUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 220, 70));

        btnBookDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnBookDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookDeleteMouseClicked(evt);
            }
        });
        BookUI.add(btnBookDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 220, 70));

        btnBookBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnBookBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookBackMouseClicked(evt);
            }
        });
        BookUI.add(btnBookBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 220, 70));

        tblBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Id", "Kitap", "Kategori", "Yazar", "Yayıncı", "İçerik", "Sayfa", "Basım"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBookTable);

        BookUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 650, 640));

        txtBookEditionYear.setBackground(new java.awt.Color(62, 71, 69));
        txtBookEditionYear.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBookEditionYear.setForeground(new java.awt.Color(255, 255, 255));
        txtBookEditionYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookEditionYear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtBookEditionYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 210, 50));

        chkBookPublisherName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkBookPublisherName.setForeground(new java.awt.Color(0, 0, 0));
        chkBookPublisherName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(chkBookPublisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 210, -1));

        chkBookCategoryName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkBookCategoryName.setForeground(new java.awt.Color(0, 0, 0));
        chkBookCategoryName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(chkBookCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 210, -1));

        chkBookAuthorName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkBookAuthorName.setForeground(new java.awt.Color(0, 0, 0));
        chkBookAuthorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(chkBookAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, -1));

        lblBookCategoryName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookCategoryName.setForeground(new java.awt.Color(255, 255, 255));
        lblBookCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookCategoryName.setText("Kategori Adı");
        BookUI.add(lblBookCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 30));

        lblBookAuthorName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        lblBookAuthorName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookAuthorName.setText("Yazar Adı");
        BookUI.add(lblBookAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 180, 30));

        lblBookContents.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookContents.setForeground(new java.awt.Color(255, 255, 255));
        lblBookContents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookContents.setText("İçerik");
        BookUI.add(lblBookContents, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 280, 180, 30));

        txtBookContents.setBackground(new java.awt.Color(62, 71, 69));
        txtBookContents.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBookContents.setForeground(new java.awt.Color(255, 255, 255));
        txtBookContents.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookContents.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtBookContents, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 50));

        lblBookPageCount.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookPageCount.setForeground(new java.awt.Color(255, 255, 255));
        lblBookPageCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookPageCount.setText("Sayfa Sayısı");
        BookUI.add(lblBookPageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 30));

        txtBookPageCount.setBackground(new java.awt.Color(62, 71, 69));
        txtBookPageCount.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBookPageCount.setForeground(new java.awt.Color(255, 255, 255));
        txtBookPageCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookPageCount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookUI.add(txtBookPageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 210, 50));

        lblBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblBookSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookSearch.setText("Kitap Ara");
        BookUI.add(lblBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 620, 180, 30));

        txtBookSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtBookSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBookSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtBookSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtBookSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookSearchKeyReleased(evt);
            }
        });
        BookUI.add(txtBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BookUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookUI, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookAddMouseClicked

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO Book(BookName, Category, Author, Publisher, Contents, PageCount, EditionYear) VALUES(?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, txtBookName.getText());
            preparedStatement.setString(2, chkBookCategoryName.getSelectedItem().toString());
            preparedStatement.setString(3, chkBookAuthorName.getSelectedItem().toString());
            preparedStatement.setString(4, chkBookPublisherName.getSelectedItem().toString());
            preparedStatement.setString(5, txtBookContents.getText());
            preparedStatement.setString(6, txtBookPageCount.getText());
            preparedStatement.setString(7, txtBookEditionYear.getText());
           
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Kitap Eklendi.");
                txtBookName.setText("");
                chkBookCategoryName.setSelectedIndex(-1);
                chkBookAuthorName.setSelectedIndex(-1);
                chkBookPublisherName.setSelectedIndex(-1);
                txtBookContents.setText("");
                txtBookPageCount.setText("");
                txtBookEditionYear.setText("");
                txtBookName.requestFocus();
                bookLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Kitap Eklenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnBookAddMouseClicked

    private void btnBookUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookUpdateMouseClicked

        defaultTableModel = (DefaultTableModel) tblBookTable.getModel();
        int selectIndex = tblBookTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("UPDATE book set BookName = ?, Category = ?, Author = ?, Publisher = ?, Contents = ?, PageCount = ?, EditionYear = ? where Id = ?");
            preparedStatement.setString(1, txtBookName.getText());
            preparedStatement.setString(2, chkBookCategoryName.getSelectedItem().toString());
            preparedStatement.setString(3, chkBookAuthorName.getSelectedItem().toString());
            preparedStatement.setString(4, chkBookPublisherName.getSelectedItem().toString());         
            preparedStatement.setString(5, txtBookContents.getText());
            preparedStatement.setString(6, txtBookPageCount.getText());
            preparedStatement.setString(7, txtBookEditionYear.getText());
            preparedStatement.setInt(8, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Kitap Güncellendi");
                txtBookName.setText("");
                chkBookCategoryName.setSelectedIndex(-1);
                chkBookAuthorName.setSelectedIndex(-1);
                chkBookPublisherName.setSelectedIndex(-1);
                txtBookContents.setText("");
                txtBookPageCount.setText("");
                txtBookEditionYear.setText("");
                txtBookName.requestFocus();
                bookLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Kitap Güncelenemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }

    }//GEN-LAST:event_btnBookUpdateMouseClicked

    private void btnBookDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookDeleteMouseClicked

        defaultTableModel = (DefaultTableModel) tblBookTable.getModel();
        int selectIndex = tblBookTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {

            preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM book where id = ?");
            preparedStatement.setInt(1, id);
            int successful = preparedStatement.executeUpdate();

            if(successful == 1){

                JOptionPane.showMessageDialog(this, "Kitap Silindi");
                txtBookName.setText("");
                chkBookCategoryName.setSelectedIndex(-1);
                chkBookAuthorName.setSelectedIndex(-1);
                chkBookPublisherName.setSelectedIndex(-1);
                txtBookContents.setText("");
                txtBookPageCount.setText("");
                txtBookEditionYear.setText("");
                txtBookName.requestFocus();
                bookLoad();

            }
            else{

                JOptionPane.showMessageDialog(this, "Kitap Silinemedi!");

            }

        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
        }
    }//GEN-LAST:event_btnBookDeleteMouseClicked

    private void btnBookBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnBookBackMouseClicked

    private void tblBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookTableMouseClicked

        defaultTableModel = (DefaultTableModel) tblBookTable.getModel();
        int selectIndex = tblBookTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtBookName.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        chkBookCategoryName.setSelectedItem(defaultTableModel.getValueAt(selectIndex, 2).toString());
        chkBookAuthorName.setSelectedItem(defaultTableModel.getValueAt(selectIndex, 3).toString());
        chkBookPublisherName.setSelectedItem(defaultTableModel.getValueAt(selectIndex, 4).toString());
        txtBookContents.setText(defaultTableModel.getValueAt(selectIndex, 5).toString());
        txtBookPageCount.setText(defaultTableModel.getValueAt(selectIndex, 6).toString());
        txtBookEditionYear.setText(defaultTableModel.getValueAt(selectIndex, 7).toString());

    }//GEN-LAST:event_tblBookTableMouseClicked

    private void txtBookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookSearchKeyReleased

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblBookTable.getModel();
        String search = txtBookSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblBookTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtBookSearchKeyReleased


    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookUI;
    private javax.swing.JLabel btnBookAdd;
    private javax.swing.JLabel btnBookBack;
    private javax.swing.JLabel btnBookDelete;
    private javax.swing.JLabel btnBookUpdate;
    private javax.swing.JComboBox chkBookAuthorName;
    private javax.swing.JComboBox chkBookCategoryName;
    private javax.swing.JComboBox chkBookPublisherName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookAuthorName;
    private javax.swing.JLabel lblBookCategoryName;
    private javax.swing.JLabel lblBookContents;
    private javax.swing.JLabel lblBookEditionYear;
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblBookPageCount;
    private javax.swing.JLabel lblBookPublisherName;
    private javax.swing.JLabel lblBookSearch;
    private javax.swing.JTable tblBookTable;
    private javax.swing.JTextField txtBookContents;
    private javax.swing.JTextField txtBookEditionYear;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookPageCount;
    private javax.swing.JTextField txtBookSearch;
    // End of variables declaration//GEN-END:variables

}
