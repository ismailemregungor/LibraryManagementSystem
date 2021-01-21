
package library.management.system.category;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import java.sql.*;
import java.util.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import library.management.system.operations.sign.ICategoryOperations;



public class Category extends javax.swing.JFrame implements ICategoryOperations{

   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null; 

    public Category() {
        
        
        initComponents();
        categoryLoad();
        
    }


   @Override
    public void categoryLoad() {

        int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from category");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblCategoryTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("Id"));
                       vector.add(resultSet.getString("Name"));
                       vector.add(resultSet.getString("Status"));

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

        CategoryUI = new javax.swing.JPanel();
        lblCategoryName = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        lblCategoryStatus = new javax.swing.JLabel();
        chkCategoryStatus = new javax.swing.JComboBox<>();
        btnCategoryAdd = new javax.swing.JLabel();
        btnCategoryUpdate = new javax.swing.JLabel();
        btnCategoryDelete = new javax.swing.JLabel();
        btnCategoryBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoryTable = new javax.swing.JTable();
        txtCategorySearch = new javax.swing.JTextField();
        lblCategorySearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Kategori İşlemleri");
        setResizable(false);

        CategoryUI.setBackground(new java.awt.Color(62, 71, 69));
        CategoryUI.setToolTipText("");
        CategoryUI.setFocusable(false);
        CategoryUI.setPreferredSize(new java.awt.Dimension(610, 455));
        CategoryUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoryName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCategoryName.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryName.setText("Kategori Adı");
        CategoryUI.add(lblCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 180, 30));

        txtCategoryName.setBackground(new java.awt.Color(62, 71, 69));
        txtCategoryName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCategoryName.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoryName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoryName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        CategoryUI.add(txtCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 210, 50));

        lblCategoryStatus.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCategoryStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryStatus.setText("Kategori Durumu");
        CategoryUI.add(lblCategoryStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 30));

        chkCategoryStatus.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkCategoryStatus.setForeground(new java.awt.Color(0, 0, 0));
        chkCategoryStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Deaktif" }));
        chkCategoryStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        CategoryUI.add(chkCategoryStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, -1));

        btnCategoryAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategoryAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_add.png"))); // NOI18N
        btnCategoryAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryAddMouseClicked(evt);
            }
        });
        CategoryUI.add(btnCategoryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, 70));

        btnCategoryUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategoryUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_update.png"))); // NOI18N
        btnCategoryUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryUpdateMouseClicked(evt);
            }
        });
        CategoryUI.add(btnCategoryUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 220, 70));

        btnCategoryDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategoryDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_delete.png"))); // NOI18N
        btnCategoryDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryDeleteMouseClicked(evt);
            }
        });
        CategoryUI.add(btnCategoryDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, 70));

        btnCategoryBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategoryBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnCategoryBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryBackMouseClicked(evt);
            }
        });
        CategoryUI.add(btnCategoryBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 220, 70));

        tblCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori Id", "Kategori Adı", "Kategori Durumu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategoryTable);

        CategoryUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 21, 560, 480));

        txtCategorySearch.setBackground(new java.awt.Color(62, 71, 69));
        txtCategorySearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCategorySearch.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorySearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategorySearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCategorySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCategorySearchKeyReleased(evt);
            }
        });
        CategoryUI.add(txtCategorySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 210, 50));

        lblCategorySearch.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCategorySearch.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorySearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategorySearch.setText("Kategori Ara");
        CategoryUI.add(lblCategorySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CategoryUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CategoryUI, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoryBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);
        
    }//GEN-LAST:event_btnCategoryBackMouseClicked

    private void btnCategoryAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryAddMouseClicked
            
        try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO category(Name, Status) VALUES(?, ?)");
           preparedStatement.setString(1, txtCategoryName.getText());
           preparedStatement.setString(2, chkCategoryStatus.getSelectedItem().toString());
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Kategori Eklendi.");
               

               txtCategoryName.setText("");
               chkCategoryStatus.setSelectedIndex(-1);
               txtCategoryName.requestFocus();
               categoryLoad();
               
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Kategori Eklenemedi!");
               
           }         
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }

    }//GEN-LAST:event_btnCategoryAddMouseClicked

    private void btnCategoryUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryUpdateMouseClicked
                
        defaultTableModel = (DefaultTableModel) tblCategoryTable.getModel();
        int selectIndex = tblCategoryTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        
         try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("UPDATE category set Name = ?, Status = ? where Id = ?");
           preparedStatement.setString(1, txtCategoryName.getText());
           preparedStatement.setString(2, chkCategoryStatus.getSelectedItem().toString());
           preparedStatement.setInt(3, id);
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Kategori Güncellendi");
               
              
               
               txtCategoryName.setText("");
               chkCategoryStatus.setSelectedIndex(-1);
               txtCategoryName.requestFocus();
                categoryLoad();
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Kategori Güncelenemedi!");
               
           }         
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }         
    }//GEN-LAST:event_btnCategoryUpdateMouseClicked

    private void btnCategoryDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryDeleteMouseClicked
      
        defaultTableModel = (DefaultTableModel) tblCategoryTable.getModel();
        int selectIndex = tblCategoryTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        
         try {
           
           preparedStatement = (PreparedStatement) connection.prepareStatement("DELETE FROM category where id = ?");
           preparedStatement.setInt(1, id);
           int successful = preparedStatement.executeUpdate();
           
           if(successful == 1){
               
               JOptionPane.showMessageDialog(this, "Kategori Silindi");
              
               txtCategoryName.setText("");
               chkCategoryStatus.setSelectedIndex(-1);
               txtCategoryName.requestFocus();
                categoryLoad();
               
           }
           else{
               
               JOptionPane.showMessageDialog(this, "Kategori Silinemedi!");
               
           }         
       } catch (SQLException sqlException) {
           System.out.println("MySQL Veritabanına veri eklerken hata oldu!: " + sqlException);
       }          
    }//GEN-LAST:event_btnCategoryDeleteMouseClicked

    private void tblCategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryTableMouseClicked
        
        defaultTableModel = (DefaultTableModel) tblCategoryTable.getModel();
        int selectIndex = tblCategoryTable.getSelectedRow();
        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());
        txtCategoryName.setText(defaultTableModel.getValueAt(selectIndex, 1).toString());
        chkCategoryStatus.setSelectedItem(defaultTableModel.getValueAt(selectIndex, 2).toString());
        
        
    }//GEN-LAST:event_tblCategoryTableMouseClicked

    private void txtCategorySearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategorySearchKeyReleased
        
            DefaultTableModel defaultTableModel = (DefaultTableModel) tblCategoryTable.getModel();
            String search = txtCategorySearch.getText();
            TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
            tblCategoryTable.setRowSorter(tableRowSorter);
            tableRowSorter.setRowFilter(RowFilter.regexFilter(search));             
    }//GEN-LAST:event_txtCategorySearchKeyReleased
   
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CategoryUI;
    private javax.swing.JLabel btnCategoryAdd;
    private javax.swing.JLabel btnCategoryBack;
    private javax.swing.JLabel btnCategoryDelete;
    private javax.swing.JLabel btnCategoryUpdate;
    private javax.swing.JComboBox<String> chkCategoryStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblCategorySearch;
    private javax.swing.JLabel lblCategoryStatus;
    private javax.swing.JTable tblCategoryTable;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCategorySearch;
    // End of variables declaration//GEN-END:variables

}
