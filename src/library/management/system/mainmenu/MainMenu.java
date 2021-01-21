package library.management.system.mainmenu;


import library.management.system.author.Author;
import library.management.system.book.Book;
import library.management.system.category.Category;
import library.management.system.lendbook.LendBook;
import library.management.system.login.Login;
import library.management.system.member.Member;
import library.management.system.publisher.Publisher;
import library.management.system.returnbook.ReturnBook;
import library.management.system.stats.Stats;


public class MainMenu extends javax.swing.JFrame {


    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuUI = new javax.swing.JPanel();
        lblMainMenuLogo = new javax.swing.JLabel();
        lblCategoryIcon = new javax.swing.JLabel();
        btnCategoryOperations = new javax.swing.JLabel();
        lblAuthorIcon = new javax.swing.JLabel();
        btnAuthorOperations = new javax.swing.JLabel();
        lblPublisherIcon = new javax.swing.JLabel();
        btnPublisherOperations = new javax.swing.JLabel();
        lblMemberIcon = new javax.swing.JLabel();
        lblMainMenuBack = new javax.swing.JLabel();
        btnMemberOperations = new javax.swing.JLabel();
        btnMainMenuBackOperations = new javax.swing.JLabel();
        lblBookIcon = new javax.swing.JLabel();
        btnBookOperations = new javax.swing.JLabel();
        lblLendBookIcon = new javax.swing.JLabel();
        btnLendBookOperations = new javax.swing.JLabel();
        lblReturnBookIcon = new javax.swing.JLabel();
        btnReturnBookOperations = new javax.swing.JLabel();
        lblStatsIcon = new javax.swing.JLabel();
        btnStatsOperations = new javax.swing.JLabel();
        lblLogoutIcon = new javax.swing.JLabel();
        btnLogoutOperations = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Yönetim Sistemi - Ana Menü");
        setBackground(new java.awt.Color(62, 71, 69));
        setResizable(false);

        MainMenuUI.setBackground(new java.awt.Color(62, 71, 69));
        MainMenuUI.setToolTipText("");
        MainMenuUI.setFocusable(false);
        MainMenuUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMainMenuLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/logo1.png"))); // NOI18N
        MainMenuUI.add(lblMainMenuLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lblCategoryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_category.png"))); // NOI18N
        MainMenuUI.add(lblCategoryIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnCategoryOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategoryOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_category.png"))); // NOI18N
        btnCategoryOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnCategoryOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lblAuthorIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_author.png"))); // NOI18N
        MainMenuUI.add(lblAuthorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        btnAuthorOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAuthorOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_author.png"))); // NOI18N
        btnAuthorOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuthorOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnAuthorOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        lblPublisherIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublisherIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_publisher.png"))); // NOI18N
        MainMenuUI.add(lblPublisherIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        btnPublisherOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPublisherOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_publisher.png"))); // NOI18N
        btnPublisherOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublisherOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnPublisherOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        lblMemberIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_member.png"))); // NOI18N
        MainMenuUI.add(lblMemberIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        lblMainMenuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_back.png"))); // NOI18N
        MainMenuUI.add(lblMainMenuBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        btnMemberOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMemberOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/image/button/button_uye-islemleri.png"))); // NOI18N
        btnMemberOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnMemberOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        btnMainMenuBackOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_back0.png"))); // NOI18N
        btnMainMenuBackOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuBackOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnMainMenuBackOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        lblBookIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_book.png"))); // NOI18N
        MainMenuUI.add(lblBookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        btnBookOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/image/button/button_kitap-islemleri.png"))); // NOI18N
        btnBookOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnBookOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        lblLendBookIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLendBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_issue.png"))); // NOI18N
        MainMenuUI.add(lblLendBookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        btnLendBookOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLendBookOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_issue.png"))); // NOI18N
        btnLendBookOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLendBookOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnLendBookOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        lblReturnBookIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_return.png"))); // NOI18N
        MainMenuUI.add(lblReturnBookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        btnReturnBookOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturnBookOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_return.png"))); // NOI18N
        btnReturnBookOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBookOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnReturnBookOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        lblStatsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_stats.png"))); // NOI18N
        MainMenuUI.add(lblStatsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        btnStatsOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStatsOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_stats.png"))); // NOI18N
        btnStatsOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatsOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnStatsOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        lblLogoutIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/icon/icon_btn_exit.png"))); // NOI18N
        MainMenuUI.add(lblLogoutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        btnLogoutOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogoutOperations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/ui/images/btn_logout.png"))); // NOI18N
        btnLogoutOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutOperationsMouseClicked(evt);
            }
        });
        MainMenuUI.add(btnLogoutOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuUI, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuUI, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoryOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryOperationsMouseClicked
       
        Category category = new Category();
        this.hide();
        category.setVisible(true);
        
    }//GEN-LAST:event_btnCategoryOperationsMouseClicked

    private void btnLogoutOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutOperationsMouseClicked
       
        System.exit(0);
    }//GEN-LAST:event_btnLogoutOperationsMouseClicked

    private void btnAuthorOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuthorOperationsMouseClicked
        
        
        Author author = new Author();
        this.hide();
        author.setVisible(true);
        
    }//GEN-LAST:event_btnAuthorOperationsMouseClicked

    private void btnPublisherOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublisherOperationsMouseClicked
       
        Publisher publisher = new Publisher();
        this.hide();
        publisher.setVisible(true);
        
    }//GEN-LAST:event_btnPublisherOperationsMouseClicked

    private void btnBookOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookOperationsMouseClicked
       
        Book book = new Book();
        this.hide();;
        book.setVisible(true);
        
    }//GEN-LAST:event_btnBookOperationsMouseClicked

    private void btnMemberOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberOperationsMouseClicked
       
        Member member = new Member();
        this.hide();
        member.setVisible(true);
        
    }//GEN-LAST:event_btnMemberOperationsMouseClicked

    private void btnLendBookOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLendBookOperationsMouseClicked
        
        LendBook lendBook = new LendBook();
        this.hide();
        lendBook.setVisible(true);
        
    }//GEN-LAST:event_btnLendBookOperationsMouseClicked

    private void btnReturnBookOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBookOperationsMouseClicked
       
        ReturnBook returnBook = new ReturnBook();
        this.hide();
        returnBook.setVisible(true);
        
    }//GEN-LAST:event_btnReturnBookOperationsMouseClicked

    private void btnStatsOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsOperationsMouseClicked
        
        Stats stats = new Stats();
        this.hide();
        stats.setVisible(true);
        
    }//GEN-LAST:event_btnStatsOperationsMouseClicked

    private void btnMainMenuBackOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuBackOperationsMouseClicked
       
        Login login = new Login();
        this.hide();
        login.setVisible(true);
        
    }//GEN-LAST:event_btnMainMenuBackOperationsMouseClicked


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenuUI;
    private javax.swing.JLabel btnAuthorOperations;
    private javax.swing.JLabel btnBookOperations;
    private javax.swing.JLabel btnCategoryOperations;
    private javax.swing.JLabel btnLendBookOperations;
    private javax.swing.JLabel btnLogoutOperations;
    private javax.swing.JLabel btnMainMenuBackOperations;
    private javax.swing.JLabel btnMemberOperations;
    private javax.swing.JLabel btnPublisherOperations;
    private javax.swing.JLabel btnReturnBookOperations;
    private javax.swing.JLabel btnStatsOperations;
    private javax.swing.JLabel lblAuthorIcon;
    private javax.swing.JLabel lblBookIcon;
    private javax.swing.JLabel lblCategoryIcon;
    private javax.swing.JLabel lblLendBookIcon;
    private javax.swing.JLabel lblLogoutIcon;
    private javax.swing.JLabel lblMainMenuBack;
    private javax.swing.JLabel lblMainMenuLogo;
    private javax.swing.JLabel lblMemberIcon;
    private javax.swing.JLabel lblPublisherIcon;
    private javax.swing.JLabel lblReturnBookIcon;
    private javax.swing.JLabel lblStatsIcon;
    // End of variables declaration//GEN-END:variables
}
