/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Teladelogin;

import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author davir
 */
public class LoginScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form MainScreen
     */
    public LoginScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        BotaoEntrar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Screen");
        setMaximumSize(new java.awt.Dimension(1280, 853));
        setMinimumSize(new java.awt.Dimension(650, 440));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 150, 100, 30);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(260, 180, 130, 20);

        BotaoEntrar.setText("Entrada");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar);
        BotaoEntrar.setBounds(330, 210, 80, 30);

        BotaoSair.setText("Saída");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(240, 210, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background 640x423.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 640, 424);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        Date date = new Date();
        if(txtLogin.getText().equals("75")){
            JOptionPane.showMessageDialog(null,"Chiquinho da Silva: "+date,"ENTRADA",JOptionPane.DEFAULT_OPTION);
        }if(txtLogin.getText().equals("69")){
            JOptionPane.showMessageDialog(null,"José Carlos: "+date,"ENTRADA",JOptionPane.DEFAULT_OPTION);
        }
        else if (txtLogin.getText().equals("75") && txtLogin.getText().equals("69")){
            JOptionPane.showMessageDialog(null,"ID INCORRETO!","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        Date date = new Date();
        if(txtLogin.getText().equals("75")){
            JOptionPane.showMessageDialog(null,"Chiquinho da Silva: "+date,"SAÍDA",JOptionPane.DEFAULT_OPTION);
        }if(txtLogin.getText().equals("69")){
            JOptionPane.showMessageDialog(null,"José Carlos: "+date,"SAÍDA",JOptionPane.DEFAULT_OPTION);
        }
        else if (txtLogin.getText().equals("75") && txtLogin.getText().equals("69")){
            JOptionPane.showMessageDialog(null,"ID INCORRETO!","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotaoSairActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}