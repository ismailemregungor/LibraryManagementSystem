
package library.management.system.register;

import javax.swing.JOptionPane;
import library.management.system.login.Login;
import library.management.system.user.User;
import library.management.system.user.UserController;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterScreenUI = new javax.swing.JPanel();
        lblRSUsername = new javax.swing.JLabel();
        txtRSUsername = new javax.swing.JTextField();
        lblRSPassword = new javax.swing.JLabel();
        txtRSPassword = new javax.swing.JPasswordField();
        btnRSRegister = new javax.swing.JLabel();
        btnRSBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Kayıt Ekranı");
        setResizable(false);

        RegisterScreenUI.setBackground(new java.awt.Color(62, 71, 69));
        RegisterScreenUI.setToolTipText("");
        RegisterScreenUI.setFocusable(false);
        RegisterScreenUI.setPreferredSize(new java.awt.Dimension(610, 455));
        RegisterScreenUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRSUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblRSUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblRSUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRSUsername.setText("Kullanıcı Adı");
        RegisterScreenUI.add(lblRSUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 30));

        txtRSUsername.setBackground(new java.awt.Color(62, 71, 69));
        txtRSUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRSUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtRSUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRSUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        RegisterScreenUI.add(txtRSUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 420, 50));

        lblRSPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblRSPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRSPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRSPassword.setText("Parola");
        RegisterScreenUI.add(lblRSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 30));

        txtRSPassword.setBackground(new java.awt.Color(62, 71, 69));
        txtRSPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRSPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtRSPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRSPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        RegisterScreenUI.add(txtRSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 420, 50));

        btnRSRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRSRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_register2.png"))); // NOI18N
        btnRSRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRSRegisterMouseClicked(evt);
            }
        });
        RegisterScreenUI.add(btnRSRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 60));

        btnRSBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRSBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back.png"))); // NOI18N
        btnRSBack.setToolTipText("");
        btnRSBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRSBackMouseClicked(evt);
            }
        });
        RegisterScreenUI.add(btnRSBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterScreenUI, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterScreenUI, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRSBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRSBackMouseClicked
        
        Login loginScreen = new Login();
        this.hide();
        loginScreen.setVisible(true);
        
    }//GEN-LAST:event_btnRSBackMouseClicked

    private void btnRSRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRSRegisterMouseClicked
       
        String userName = txtRSUsername.getText();
        String password = txtRSPassword.getText();
        
        User user = new User();   
        user.setUserName(userName);
        user.setPassword(password);
        
        UserController userController = new UserController();
        int result =  userController.createUser(user);
        
            txtRSUsername.setText("");
            txtRSPassword.setText("");
            txtRSUsername.requestFocus();
        
        if(result > 0){
            
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Başarıyla Oluşturuldu.");
             
        }
        else{
        
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Oluşturulamadı!");

        }
      
    }//GEN-LAST:event_btnRSRegisterMouseClicked


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegisterScreenUI;
    private javax.swing.JLabel btnRSBack;
    private javax.swing.JLabel btnRSRegister;
    private javax.swing.JLabel lblRSPassword;
    private javax.swing.JLabel lblRSUsername;
    private javax.swing.JPasswordField txtRSPassword;
    private javax.swing.JTextField txtRSUsername;
    // End of variables declaration//GEN-END:variables
}
