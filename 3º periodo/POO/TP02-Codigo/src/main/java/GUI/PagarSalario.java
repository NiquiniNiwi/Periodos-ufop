/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.util.*;
//Import all
import pessoa.*;

import services.*;

import tools.*;

import users.*;
/**
 *
 * @author Niquini
 */
public class PagarSalario extends javax.swing.JFrame {
    private JanelaAdmin janelaAdmin;
    private Vector<Dentista> dent;
    private Vector<Funcionario> fun;
    /**
     * Creates new form PagarSalario
     */
    public PagarSalario() {
        initComponents();
    }
    public PagarSalario(JanelaAdmin janelaAdmin, Vector<Dentista> dent, Vector<Funcionario> fun){
        this();
        this.janelaAdmin = janelaAdmin;
        this.dent = dent;
        this.fun = fun;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Dent19 = new javax.swing.JButton();
        Dent20 = new javax.swing.JButton();
        Dent21 = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Fun26 = new javax.swing.JButton();
        Fun27 = new javax.swing.JButton();
        Fun28 = new javax.swing.JButton();
        Cancelar6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Dent19.setText("One");
        Dent19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dent19ActionPerformed(evt);
            }
        });

        Dent20.setText("Two");
        Dent20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dent20ActionPerformed(evt);
            }
        });

        Dent21.setText("Three");
        Dent21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dent21ActionPerformed(evt);
            }
        });

        Four.setText("Four");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Fun26.setText("Five");
        Fun26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fun26ActionPerformed(evt);
            }
        });

        Fun27.setText("Seven");
        Fun27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fun27ActionPerformed(evt);
            }
        });

        Fun28.setText("Six");
        Fun28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fun28ActionPerformed(evt);
            }
        });

        Cancelar6.setText("Cancelar");
        Cancelar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancelar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fun28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fun27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fun26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Four, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dent21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dent20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dent19, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Dent19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dent20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dent21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Four)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fun26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fun28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fun27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar6)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Gerenciamento de janelas.
        janelaAdmin.setVisible(true);
        janelaAdmin.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void Dent19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dent19ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, dent.get(0)).setVisible(true);
    }//GEN-LAST:event_Dent19ActionPerformed

    private void Dent20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dent20ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, dent.get(1)).setVisible(true);
    }//GEN-LAST:event_Dent20ActionPerformed

    private void Dent21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dent21ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, dent.get(2)).setVisible(true);
    }//GEN-LAST:event_Dent21ActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, fun.get(0)).setVisible(true);
    }//GEN-LAST:event_FourActionPerformed

    private void Fun26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fun26ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, fun.get(1)).setVisible(true);
    }//GEN-LAST:event_Fun26ActionPerformed

    private void Fun27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fun27ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, fun.get(2)).setVisible(true);
    }//GEN-LAST:event_Fun27ActionPerformed

    private void Fun28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fun28ActionPerformed
        // Gerenciamento de janelas.
        this.setEnabled(false);
        this.setVisible(false);
        new PagarSalario2(this, fun.get(3)).setVisible(true);
    }//GEN-LAST:event_Fun28ActionPerformed

    private void Cancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar6ActionPerformed
        // Gerenciamento de janelas.
        this.setVisible(false);
        this.setEnabled(false);
        janelaAdmin.setVisible(true);
        janelaAdmin.setEnabled(true);
    }//GEN-LAST:event_Cancelar6ActionPerformed

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
            java.util.logging.Logger.getLogger(PagarSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagarSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagarSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagarSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagarSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar6;
    private javax.swing.JButton Dent19;
    private javax.swing.JButton Dent20;
    private javax.swing.JButton Dent21;
    private javax.swing.JButton Four;
    private javax.swing.JButton Fun26;
    private javax.swing.JButton Fun27;
    private javax.swing.JButton Fun28;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
