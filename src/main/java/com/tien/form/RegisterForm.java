package com.tien.form;

import java.awt.Image;
import javax.swing.ImageIcon;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        this.setTitle("A Tiến Đẳng Cấp");
        scaleImage();
        emailText.setHint("Email...");
        ComfirmPasswordText.setHint("Confirm Password...");
    }
    public void scaleImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/tien/icon/bgLogin.jpg"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(bgLabel.getWidth(), bgLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acalledIcon = new ImageIcon(imgScale );
        bgLabel.setIcon(acalledIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new com.tien.swing.RoundPanelShadow();
        searchText1 = new com.tien.swing.PasswordText();
        jLabel1 = new javax.swing.JLabel();
        userText1 = new com.tien.swing.UserText();
        button1 = new com.tien.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        button2 = new com.tien.swing.Button();
        emailText = new com.tien.swing.UserText();
        ComfirmPasswordText = new com.tien.swing.PasswordText();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchText1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tien/icon/padlock.png"))); // NOI18N
        searchText1.setSelectionColor(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        userText1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tien/icon/user.png"))); // NOI18N
        userText1.setSelectionColor(new java.awt.Color(0, 0, 153));

        button1.setBackground(new java.awt.Color(255, 252, 252));
        button1.setForeground(new java.awt.Color(2, 2, 2));
        button1.setText("Register");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already have an account?");

        button2.setBackground(new java.awt.Color(255, 252, 252));
        button2.setForeground(new java.awt.Color(2, 2, 2));
        button2.setText("Login");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        emailText.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tien/icon/mail.png"))); // NOI18N
        emailText.setSelectionColor(new java.awt.Color(0, 0, 153));

        ComfirmPasswordText.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tien/icon/padlock.png"))); // NOI18N
        ComfirmPasswordText.setSelectionColor(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                    .addComponent(userText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComfirmPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComfirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 610, 450));
        getContentPane().add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        LoginForm frame = new LoginForm();
        frame.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null); // Frame Center
        frame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.tien.swing.PasswordText ComfirmPasswordText;
    private javax.swing.JLabel bgLabel;
    private com.tien.swing.Button button1;
    private com.tien.swing.Button button2;
    private com.tien.swing.UserText emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.tien.swing.RoundPanelShadow jPanel1;
    private com.tien.swing.PasswordText searchText1;
    private com.tien.swing.UserText userText1;
    // End of variables declaration//GEN-END:variables
}
