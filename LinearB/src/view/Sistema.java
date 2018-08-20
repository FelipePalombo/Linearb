/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Felipe
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMIFullScreen = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMICadFornecedor = new javax.swing.JMenuItem();
        jMICadProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIRelFornecedor = new javax.swing.JMenuItem();
        jMIRelProduto = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMIEdFornecedor = new javax.swing.JMenuItem();
        jMIEdProduto = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LinearB");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu4.setText("Sistema");

        jMIFullScreen.setText("Tela Cheia");
        jMIFullScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFullScreenActionPerformed(evt);
            }
        });
        jMenu4.add(jMIFullScreen);

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMenu4.add(jMISair);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Cadastro/Entrada");

        jMICadFornecedor.setText("Fornecedor");
        jMICadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadFornecedor);

        jMICadProduto.setText("Produto");
        jMenu1.add(jMICadProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");

        jMIRelFornecedor.setText("Fornecedor");
        jMIRelFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelFornecedorActionPerformed(evt);
            }
        });
        jMenu2.add(jMIRelFornecedor);

        jMIRelProduto.setText("Produto");
        jMenu2.add(jMIRelProduto);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Saída");

        jMIEdFornecedor.setText("Fornecedor");
        jMenu5.add(jMIEdFornecedor);

        jMIEdProduto.setText("Produto");
        jMenu5.add(jMIEdProduto);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIFullScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFullScreenActionPerformed
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }//GEN-LAST:event_jMIFullScreenActionPerformed

    private void jMICadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadFornecedorActionPerformed
        CadFornecedor cf;
        try {
            cf = new CadFornecedor(this,true);
            cf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMICadFornecedorActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMIRelFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRelFornecedorActionPerformed
        try {
            RelFornecedor rf;
            rf = new RelFornecedor(this,true);
            rf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIRelFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMICadFornecedor;
    private javax.swing.JMenuItem jMICadProduto;
    private javax.swing.JMenuItem jMIEdFornecedor;
    private javax.swing.JMenuItem jMIEdProduto;
    private javax.swing.JMenuItem jMIFullScreen;
    private javax.swing.JMenuItem jMIRelFornecedor;
    private javax.swing.JMenuItem jMIRelProduto;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
