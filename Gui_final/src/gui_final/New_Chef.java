/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_final;

/**
 *
 * @author Kasintha Kalhara
 */
public class New_Chef extends javax.swing.JFrame {

    /**
     * Creates new form New_Chef
     */
    public New_Chef() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chef_back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        chef_home = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        chef_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/left-arrow.png"))); // NOI18N
        chef_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        chef_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chef_backActionPerformed(evt);
            }
        });
        getContentPane().add(chef_back);
        chef_back.setBounds(40, 10, 35, 35);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/arrow-pointing-to-right.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(90, 10, 35, 35);

        chef_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_final/home.png"))); // NOI18N
        chef_home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        chef_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chef_homeActionPerformed(evt);
            }
        });
        getContentPane().add(chef_home);
        chef_home.setBounds(140, 10, 35, 35);

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Chef");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1736, 28, 110, 42);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Meet The Chef");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 170, 471, 79);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Chef Dimuthu Kumarasinghe, or Chef DK as he is popularly known, \nis the head Chef at Cafe de Pablo. A world renowned culinary celebrity, \nChef DK is the only chef in the world to ever win 9 gold medals in individual \nevents held at two separate Culinary Olympics, once in 2004 and again in 2006.\n\nHaving started off as a trainee cook, the Chef admits that he only joined the \nindustry because of the support of his brother. He then spent ten years in Bahrain \nas a Pastry Chef and joined Cafe de Pablo after his return to Sri Lanka.\n\nA remarkable achiever, Dimuthu has excelled in his capacity and carries many \naccolades under his belt. Some of the events in which he won at the Culinary Olympics \nare ‘artistic showpiece’, ‘artistic pastry showpiece’, and the ‘pulled sugar’ event. \nHis many awards and achievements are innumerable and Chef Dimuthu is an irreplaceable \nmember of Cafe de Pablo.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(19, 378, 1212, 479);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1258, 164, 625, 794);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 70, 1920, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chef_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chef_backActionPerformed
        NewJFrame s= new NewJFrame();
        s.setVisible(true);

        dispose();
    }//GEN-LAST:event_chef_backActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void chef_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chef_homeActionPerformed
        NewJFrame w=new NewJFrame();
        w.setVisible(true);

        dispose();
    }//GEN-LAST:event_chef_homeActionPerformed

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
            java.util.logging.Logger.getLogger(New_Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Chef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chef_back;
    private javax.swing.JButton chef_home;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
