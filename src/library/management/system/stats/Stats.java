
package library.management.system.stats;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import library.management.system.database.DatabaseHelper;
import library.management.system.mainmenu.MainMenu;
import library.management.system.operations.sign.IStatsOperations;


public class Stats extends javax.swing.JFrame implements IStatsOperations{

    
    public Stats() {
        initComponents();
        lendBookLoad();
        returnBookLoad();
    }
    
   static Connection connection = DatabaseHelper.getConnection();
   static PreparedStatement preparedStatement = null;
   
   static ResultSet resultSet = null;
   static DefaultTableModel defaultTableModel = null;
   static ResultSetMetaData resultSetMetaData = null;
    
    @Override
    public void lendBookLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select l.Id, m.Name, b.BookName, l.LendDate, l.ReturnDate from lendbook l JOIN member m ON l.MemberId = m.id JOIN book b ON l.BookId = b.Id");
            resultSet = preparedStatement.executeQuery();
            
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            
            defaultTableModel = (DefaultTableModel) tblStatsLendBookTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                
                for(int i = 1; i<=rowCount; i++){
                
                       vector.add(resultSet.getString("l.Id"));
                       vector.add(resultSet.getString("m.Name"));
                       vector.add(resultSet.getString("b.BookName"));
                       vector.add(resultSet.getString("l.LendDate"));
                       vector.add(resultSet.getString("l.ReturnDate"));

                }
                
                defaultTableModel.addRow(vector);
                                
            }
            
        } catch (SQLException sqlException) {
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);
        }
        
    }
        
    @Override
    public void returnBookLoad(){
        
         int rowCount;
        
        try {
            
            preparedStatement = (PreparedStatement) connection.prepareStatement("select * from returnbook");
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            rowCount = resultSetMetaData.getColumnCount();
            defaultTableModel = (DefaultTableModel) tblStatsReturnBookTable.getModel();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StatsUI = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatsReturnBookTable = new javax.swing.JTable();
        lblStatsReturnBookTable = new javax.swing.JLabel();
        lblStatsLendBookTable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStatsLendBookTable = new javax.swing.JTable();
        btnStatsBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - İstatistik Ekranı");
        setResizable(false);

        StatsUI.setBackground(new java.awt.Color(62, 71, 69));
        StatsUI.setToolTipText("");
        StatsUI.setFocusable(false);
        StatsUI.setPreferredSize(new java.awt.Dimension(610, 455));
        StatsUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStatsReturnBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Üye Adı", "Kitap Adı", "Çıkış Tarihi", "Dönüş Tarihi", "Geçen Gün"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStatsReturnBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStatsReturnBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStatsReturnBookTable);

        StatsUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 780, 230));

        lblStatsReturnBookTable.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblStatsReturnBookTable.setForeground(new java.awt.Color(255, 255, 255));
        lblStatsReturnBookTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatsReturnBookTable.setText("Kitap Dönüş");
        StatsUI.add(lblStatsReturnBookTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 180, 30));

        lblStatsLendBookTable.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblStatsLendBookTable.setForeground(new java.awt.Color(255, 255, 255));
        lblStatsLendBookTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatsLendBookTable.setText("Kitap Çıkış");
        StatsUI.add(lblStatsLendBookTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 180, 50));

        tblStatsLendBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Üye Adı", "Kitap Adı", "Çıkış Tarihi", "Dönüş Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStatsLendBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStatsLendBookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStatsLendBookTable);

        StatsUI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 780, 200));

        btnStatsBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStatsBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnStatsBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatsBackMouseClicked(evt);
            }
        });
        StatsUI.add(btnStatsBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatsUI, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatsUI, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblStatsReturnBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStatsReturnBookTableMouseClicked

     
    }//GEN-LAST:event_tblStatsReturnBookTableMouseClicked

    private void tblStatsLendBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStatsLendBookTableMouseClicked
    }//GEN-LAST:event_tblStatsLendBookTableMouseClicked

    private void btnStatsBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsBackMouseClicked

        MainMenu mainMenu = new MainMenu();
        this.hide();
        mainMenu.setVisible(true);

    }//GEN-LAST:event_btnStatsBackMouseClicked

    
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
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StatsUI;
    private javax.swing.JLabel btnStatsBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblStatsLendBookTable;
    private javax.swing.JLabel lblStatsReturnBookTable;
    private javax.swing.JTable tblStatsLendBookTable;
    private javax.swing.JTable tblStatsReturnBookTable;
    // End of variables declaration//GEN-END:variables

}
