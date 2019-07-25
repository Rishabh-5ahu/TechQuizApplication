/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.gui;

import TQA.pojo.UserProfile;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH SAHU
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
         super.setLocationRelativeTo(null);
         lblUsername.setText("Hello "+UserProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbSetpaper = new javax.swing.JRadioButton();
        jrbEditpaper = new javax.swing.JRadioButton();
        jrbRegister = new javax.swing.JRadioButton();
        jrbViewscore = new javax.swing.JRadioButton();
        btnTask = new javax.swing.JButton();
        lblImag = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 153));
        jLabel2.setText("Make a Choice");

        jrbSetpaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSetpaper);
        jrbSetpaper.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbSetpaper.setForeground(new java.awt.Color(255, 204, 153));
        jrbSetpaper.setText("Set a Paper");

        jrbEditpaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbEditpaper);
        jrbEditpaper.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbEditpaper.setForeground(new java.awt.Color(255, 204, 153));
        jrbEditpaper.setText("Edit Paper");

        jrbRegister.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbRegister);
        jrbRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbRegister.setForeground(new java.awt.Color(255, 204, 153));
        jrbRegister.setText("Register Student");

        jrbViewscore.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewscore);
        jrbViewscore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbViewscore.setForeground(new java.awt.Color(255, 204, 153));
        jrbViewscore.setText("View Scores");

        btnTask.setBackground(new java.awt.Color(0, 0, 0));
        btnTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTask.setForeground(new java.awt.Color(255, 204, 153));
        btnTask.setText("Do Task");
        btnTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskActionPerformed(evt);
            }
        });

        lblImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TQA/gui/admin.PNG"))); // NOI18N
        lblImag.setText("jLabel3");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 204, 153));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 204, 153));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblImag, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTask, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbRegister)
                            .addComponent(jrbEditpaper)
                            .addComponent(jrbSetpaper)
                            .addComponent(jLabel2)
                            .addComponent(jrbViewscore))
                        .addGap(95, 95, 95))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSetpaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbEditpaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbViewscore)
                        .addGap(34, 34, 34)
                        .addComponent(btnTask))
                    .addComponent(lblImag))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);            
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        Font f=new Font("Tahoma",Font.ITALIC,11);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        Font f=new Font("Tahoma",Font.BOLD,11);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskActionPerformed
               String task=getAction();
        if(task==null){
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JFrame jf=null;
        if(task.equals("Set a Paper"))
            jf=new SetPaperFrame();
        else if(task.equals("Edit Paper"))
        {
             jf=new EditPaperFrame();
        }
        else if(task.equals("Register Student"))
        {
             jf=new RegisterStudentFrame();
             System.out.print("Reg");
        }
        else 
        {
           jf=new ViewScoresFrame(); 
           System.out.print("View");
        }
        jf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTaskActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEditpaper;
    private javax.swing.JRadioButton jrbRegister;
    private javax.swing.JRadioButton jrbSetpaper;
    private javax.swing.JRadioButton jrbViewscore;
    private javax.swing.JLabel lblImag;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
      private String getAction() {
          if(jrbSetpaper.isSelected())
            return jrbSetpaper.getText();
        else if(jrbEditpaper.isSelected())
            return jrbEditpaper.getText();
        else if(jrbEditpaper.isSelected())
            return jrbEditpaper.getText();
        else if(jrbRegister.isSelected())
            return jrbRegister.getText();
        else if(jrbViewscore.isSelected())
            return jrbViewscore.getText();
        else  
            return null;
    }

}
