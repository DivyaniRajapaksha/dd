/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_final;

import java.awt.Toolkit;

/**
 *
 * @author Acer
 */
public class front extends javax.swing.JFrame {

    /**
     * Creates new form front
     */
    public front() {
        initComponents();
        setAlwaysOnTop(true);
        //setResizable(false);
        setVisible(true);
        Toolkit tk=Toolkit.getDefaultToolkit();
        
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        
        setSize(x,y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chef = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JButton();
        about = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        feedback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 210, 56, 29);

        menu.setBackground(new java.awt.Color(102, 102, 102));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/menu.png"))); // NOI18N
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        menu.setMaximumSize(new java.awt.Dimension(50, 50));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(150, 260, 120, 110);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/shopping-cart.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 260, 110, 110);

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cart");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 200, 42, 29);

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rate Us");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 200, 77, 29);

        chef.setBackground(new java.awt.Color(102, 102, 102));
        chef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/chef.png"))); // NOI18N
        chef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        chef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefActionPerformed(evt);
            }
        });
        getContentPane().add(chef);
        chef.setBounds(680, 260, 110, 110);

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("About");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(700, 440, 60, 29);

        contact.setBackground(new java.awt.Color(102, 102, 102));
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/phone.png"))); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact);
        contact.setBounds(680, 510, 120, 120);

        about.setBackground(new java.awt.Color(102, 102, 102));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/admin.png"))); // NOI18N
        about.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        getContentPane().add(about);
        about.setBounds(390, 510, 130, 120);

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 450, 76, 29);

        feedback.setBackground(new java.awt.Color(102, 102, 102));
        feedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/rating.png"))); // NOI18N
        feedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        getContentPane().add(feedback);
        feedback.setBounds(150, 510, 120, 130);

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Feedback");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 450, 93, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/rsz_11.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 30, 320, 110);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/food-1932466_1920.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1720, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        Menu1 s= new Menu1();
        s.setVisible(true);
        NewJFrame nv=new NewJFrame();
        nv.setVisible(false);

        dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CartGUI s=new CartGUI();
        s.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefActionPerformed
        RatingForm s= new RatingForm();
        s.setVisible(true);
    }//GEN-LAST:event_chefActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        Contact s= new Contact();
        s.setVisible(true);

        dispose();
    }//GEN-LAST:event_contactActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        About1 q= new About1();
        q.setVisible(true);

        dispose();
    }//GEN-LAST:event_aboutActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        Feedback s= new Feedback();
        s.setVisible(true);

        dispose();
    }//GEN-LAST:event_feedbackActionPerformed

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
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton chef;
    private javax.swing.JButton contact;
    private javax.swing.JButton feedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
