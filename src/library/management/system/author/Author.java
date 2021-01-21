
package library.management.system.author;

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
import library.management.system.operations.sign.IAuthorOperations;


public class Author extends javax.swing.JFrame implements IAuthorOperations{

  
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;
    
    public Author() {
        initComponents();
        authorLoad();
    }

   @Override
    public void authorLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from author");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblAuthorTable.getModel();
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

        AuthorUI = new javax.swing.JPanel();
        lblAuthorName = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        lblAuthorPhone = new javax.swing.JLabel();
        btnAuthorAdd = new javax.swing.JLabel();
        btnAuthorUpdate = new javax.swing.JLabel();
        btnAuthorDelete = new javax.swing.JLabel();
        btnAuthorBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuthorTable = new javax.swing.JTable();
        txtAuthorSearch = new javax.swing.JTextField();
        lblAuthorSearch = new javax.swing.JLabel();
        lblAuthorAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAuthorAddress = new javax.swing.JTextArea();
        txtAuthorPhone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Yazar İşlemleri");
        setResizable(false);

        AuthorUI.setBackground(new java.awt.Color(62, 71, 69));
        AuthorUI.setToolTipText("");
        AuthorUI.setFocusable(false);
        AuthorUI.setPreferredSize(new java.awt.Dimension(610, 455));
        AuthorUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAuthorName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthorName.setText("Yazar Adı");
        AuthorUI.add(lblAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 180, 30));

        txtAuthorName.setBackground(new java.awt.Color(62, 71, 69));
        txtAuthorName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAuthorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        AuthorUI.add(txtAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 210, 50));

        lblAuthorPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAuthorPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthorPhone.setText("Yazar Telefon");
        AuthorUI.add(lblAuthorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 180, 30));

        btnAuthorAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAuthorAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnAuthorAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorAddMouseClicked(evt);
            }
        });
        AuthorUI.add(btnAuthorAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 70));

        btnAuthorUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAuthorUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_update.png"))); // NOI18N
        btnAuthorUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorUpdateMouseClicked(evt);
            }
        });
        AuthorUI.add(btnAuthorUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 220, 70));

        btnAuthorDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAuthorDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnAuthorDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorDeleteMouseClicked(evt);
            }
        });
        AuthorUI.add(btnAuthorDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, 70));

        btnAuthorBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAuthorBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnAuthorBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorBackMouseClicked(evt);
            }
        });
        AuthorUI.add(btnAuthorBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 220, 70));

        tblAuthorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazar Id", "Yazar Adı", "Yazar Durumu", "Yazar Telefon No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAuthorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAuthorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAuthorTable);

        AuthorUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 21, 560, 590));

        txtAuthorSearch.setBackground(new java.awt.Color(62, 71, 69));
        txtAuthorSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAuthorSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthorSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAuthorSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAuthorSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAuthorSearchKeyReleased(evt);
            }
        });
        AuthorUI.add(txtAuthorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 210, 50));

        lblAuthorSearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAuthorSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthorSearch.setText("Yazar Ara");
        AuthorUI.add(lblAuthorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 550, 180, 30));

        lblAuthorAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAuthorAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthorAddress.setText("Yazar Adres");
        AuthorUI.add(lblAuthorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, 180, 30));

        txtAuthorAddress.setColumns(20);
        txtAuthorAddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAuthorAddress.setRows(5);
        txtAuthorAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtAuthorAddress);

        AuthorUI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 100));

        txtAuthorPhone.setBackground(new java.awt.Color(62, 71, 69));
        txtAuthorPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAuthorPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthorPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAuthorPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        AuthorUI.add(txtAuthorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AuthorUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AuthorUI, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAuthorAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorAddMouseClicked

  try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO Author(Name, Address, Phone) VALUES(?, ?, ?)");
           preparedStatement.setString(1, txtAuthorName.getText());
           preparedStatement.setString(2, txtAuthorAddress.getText());
           preparedStatement.setString(3, txtAuthorPhone.getText());
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Yazar Eklendi.");
               txtAuthorName.setText("");
               txtAuthorAddress.setText("");
               txtAuthorPhone.setText("");
               txtAuthorName.requestFocus();
               authorLoad();
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Yazar Eklenemedi!");
               
           }
           
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }
    }//GEN-LAST:event_btnAuthorAddMouseClicked

    private void btnAuthorUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorUpdateMouseClicked

        defaultTableModel = (DefaultTableModel) tblAuthorTable.getModel();
        int selectIndex = tblAuthorTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        
         try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("UPDATE author set Name = ?, Address = ?, Phone = ? where Id = ?");
           preparedStatement.setString(1, txtAuthorName.getText());
           preparedStatement.setString(2, txtAuthorAddress.getText());
           preparedStatement.setString(3, txtAuthorPhone.getText());
           preparedStatement.setInt(4, id);
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Yazar Güncellendi");
                txtAuthorName.setText("");
                txtAuthorAddress.setText("");
                txtAuthorPhone.setText("");
                authorLoad();
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Yazar Güncelenemedi!");
               
           }
           
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }
    }//GEN-LAST:event_btnAuthorUpdateMouseClicked

    private void btnAuthorDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorDeleteMouseClicked

defaultTableModel = (DefaultTableModel) tblAuthorTable.getModel();
        int selectIndex = tblAuthorTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        
         try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM author where id = ?");
           preparedStatement.setInt(1, id);
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Yazar Silindi");
               txtAuthorName.setText("");
               txtAuthorAddress.setText("");
               txtAuthorPhone.setText("");
               txtAuthorName.requestFocus();
               authorLoad();
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Yazar Silinemedi!");
               
           }
           
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }
    }//GEN-LAST:event_btnAuthorDeleteMouseClicked

    private void btnAuthorBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);

    }//GEN-LAST:event_btnAuthorBackMouseClicked

    private void tblAuthorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAuthorTableMouseClicked

        defaultTableModel = (DefaultTableModel) tblAuthorTable.getModel();
        int selectIndex = tblAuthorTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtAuthorName.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        txtAuthorAddress.setText(defaultTableModel.getValueAt(selectIndex, 2).toString());
        txtAuthorPhone.setText(defaultTableModel.getValueAt(selectIndex, 3).toString());

    }//GEN-LAST:event_tblAuthorTableMouseClicked

    private void txtAuthorSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAuthorSearchKeyReleased

       DefaultTableModel defaultTableModel = (DefaultTableModel) tblAuthorTable.getModel();
       String search = txtAuthorSearch.getText();
       TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
       tblAuthorTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtAuthorSearchKeyReleased

 
    public static void main(String args[]) {
     


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Author().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AuthorUI;
    private javax.swing.JLabel btnAuthorAdd;
    private javax.swing.JLabel btnAuthorBack;
    private javax.swing.JLabel btnAuthorDelete;
    private javax.swing.JLabel btnAuthorUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthorAddress;
    private javax.swing.JLabel lblAuthorName;
    private javax.swing.JLabel lblAuthorPhone;
    private javax.swing.JLabel lblAuthorSearch;
    private javax.swing.JTable tblAuthorTable;
    private javax.swing.JTextArea txtAuthorAddress;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtAuthorPhone;
    private javax.swing.JTextField txtAuthorSearch;
    // End of variables declaration//GEN-END:variables

}
