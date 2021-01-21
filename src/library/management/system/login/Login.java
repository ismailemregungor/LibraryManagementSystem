
package library.management.system.login;

import javax.swing.JOptionPane;
import library.management.system.info.BaseInfo;
import library.management.system.info.UserLoginInfo;
import library.management.system.mainmenu.MainMenu;
import library.management.system.register.Register;
import library.management.system.user.User;
import library.management.system.user.UserController;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginScreenUI = new javax.swing.JPanel();
        lblLSUsername = new javax.swing.JLabel();
        txtLSUsername = new javax.swing.JTextField();
        lblLSPassword = new javax.swing.JLabel();
        txtLSPassword = new javax.swing.JPasswordField();
        btnLSLogin = new javax.swing.JLabel();
        btnLSRegister = new javax.swing.JLabel();
        btnLSExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Giriş Ekranı");
        setResizable(false);

        LoginScreenUI.setBackground(new java.awt.Color(62, 71, 69));
        LoginScreenUI.setToolTipText("");
        LoginScreenUI.setFocusable(false);
        LoginScreenUI.setName(""); // NOI18N
        LoginScreenUI.setPreferredSize(new java.awt.Dimension(610, 455));
        LoginScreenUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLSUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLSUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblLSUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLSUsername.setText("Kullanıcı Adı");
        LoginScreenUI.add(lblLSUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, 30));

        txtLSUsername.setBackground(new java.awt.Color(62, 71, 69));
        txtLSUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLSUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtLSUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLSUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LoginScreenUI.add(txtLSUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 460, 50));

        lblLSPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLSPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblLSPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLSPassword.setText("Parola");
        LoginScreenUI.add(lblLSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, 30));

        txtLSPassword.setBackground(new java.awt.Color(62, 71, 69));
        txtLSPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLSPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtLSPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLSPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LoginScreenUI.add(txtLSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 460, 50));

        btnLSLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLSLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_login.png"))); // NOI18N
        btnLSLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLSLoginMouseClicked(evt);
            }
        });
        LoginScreenUI.add(btnLSLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 210, 60));

        btnLSRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLSRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_register.png"))); // NOI18N
        btnLSRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLSRegisterMouseClicked(evt);
            }
        });
        LoginScreenUI.add(btnLSRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 60));

        btnLSExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLSExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_exit.png"))); // NOI18N
        btnLSExit.setToolTipText("");
        btnLSExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLSExitMouseClicked(evt);
            }
        });
        LoginScreenUI.add(btnLSExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenUI, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenUI, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLSLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLSLoginMouseClicked
       
        
        String userName = txtLSUsername.getText();
        String password = txtLSPassword.getText();
        
        User user = new User();   
        user.setUserName(userName);
        user.setPassword(password);
        
        UserController userController = new UserController();
        boolean result =  userController.checkUserInfo(user);
        
            txtLSUsername.setText("");
            txtLSPassword.setText("");
            txtLSUsername.requestFocus();
        
        if(result){
            
            JOptionPane.showMessageDialog(rootPane, "Başarıyla Giriş Yapıldı.");
            new MainMenu().setVisible(true);
            this.dispose();
            
            BaseInfo baseInfo = new  UserLoginInfo();
            baseInfo.loggedIn();
            
             
        }
        else{
        
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarısız!");
            
            BaseInfo baseInfo = new  UserLoginInfo();
            baseInfo.notLoggedIn();

        }
        
        
    }//GEN-LAST:event_btnLSLoginMouseClicked

    private void btnLSRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLSRegisterMouseClicked
        
            new Register().setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_btnLSRegisterMouseClicked

    private void btnLSExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLSExitMouseClicked
        
           System.exit(0);
    }//GEN-LAST:event_btnLSExitMouseClicked

  
    public static void main(String args[]) {
      
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginScreenUI;
    private javax.swing.JLabel btnLSExit;
    private javax.swing.JLabel btnLSLogin;
    private javax.swing.JLabel btnLSRegister;
    private javax.swing.JLabel lblLSPassword;
    private javax.swing.JLabel lblLSUsername;
    private javax.swing.JPasswordField txtLSPassword;
    private javax.swing.JTextField txtLSUsername;
    // End of variables declaration//GEN-END:variables
}
