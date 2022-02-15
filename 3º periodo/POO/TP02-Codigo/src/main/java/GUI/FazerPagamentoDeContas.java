/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JOptionPane;
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
public class FazerPagamentoDeContas extends javax.swing.JFrame {
    private JanelaAdmin janelaAdmin;
    private JanelaAssistenteAdmin jaa;
    private PagamentoContas pgc;
    /**
     * Creates new form FazerPagamentoDeContas
     */
    public FazerPagamentoDeContas() {
        initComponents();
    }
    public FazerPagamentoDeContas(JanelaAdmin janelaAdmin, PagamentoContas pgc){
        this();
        this.janelaAdmin = janelaAdmin;
        this.pgc = pgc;
    }
    public FazerPagamentoDeContas(JanelaAssistenteAdmin jaa, PagamentoContas pgc){
        this();
        this.jaa = jaa;
        this.pgc = pgc;
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
        Agua = new javax.swing.JRadioButton();
        Luz = new javax.swing.JRadioButton();
        Alguel = new javax.swing.JRadioButton();
        Telefone = new javax.swing.JRadioButton();
        PLimpeza = new javax.swing.JRadioButton();
        MEquipamentos = new javax.swing.JRadioButton();
        CMaterias = new javax.swing.JRadioButton();
        MAtendimento = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        DataVencimentoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DataPagamentoText = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        buttonGroup1.add(Agua);
        Agua.setText("Água");
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });

        buttonGroup1.add(Luz);
        Luz.setText("Luz");
        Luz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuzActionPerformed(evt);
            }
        });

        buttonGroup1.add(Alguel);
        Alguel.setText("Aluguel");
        Alguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlguelActionPerformed(evt);
            }
        });

        buttonGroup1.add(Telefone);
        Telefone.setText("Telefone");
        Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(PLimpeza);
        PLimpeza.setText("Prodrutos de limpeza");
        PLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLimpezaActionPerformed(evt);
            }
        });

        buttonGroup1.add(MEquipamentos);
        MEquipamentos.setText("Manutenção de Equipamentos");
        MEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEquipamentosActionPerformed(evt);
            }
        });

        buttonGroup1.add(CMaterias);
        CMaterias.setText("Compra de materiais");
        CMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMateriasActionPerformed(evt);
            }
        });

        buttonGroup1.add(MAtendimento);
        MAtendimento.setText("Materiais para atendimento");
        MAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAtendimentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de vencimento: ");

        jLabel3.setText("Data de Pagamento: ");

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Luz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Alguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PLimpeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DataVencimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DataPagamentoText)))
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Luz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alguel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PLimpeza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MEquipamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DataVencimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DataPagamentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Cancelar))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AguaActionPerformed

    private void LuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LuzActionPerformed

    private void AlguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlguelActionPerformed

    private void TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneActionPerformed

    private void PLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLimpezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLimpezaActionPerformed

    private void MEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEquipamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEquipamentosActionPerformed

    private void CMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMateriasActionPerformed

    private void MAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAtendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAtendimentoActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // Chcka se entradas estão preenchidas e se sim, salva e fecha janela
        Conta conta = new Conta("","","");
        if(DataPagamentoText.getText().equals("") || DataVencimentoText.getText().equals("")){
            
        }
        else{
            if(Agua.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Agua");
            }
            else if(Alguel.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Aluguel");
            }
            else if(CMaterias.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Compra de materiais");
            }
            else if(Luz.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Luz");
            }
            else if(MAtendimento.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Materiais de atendimento");
            }
            else if(PLimpeza.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Produtos de Limpeza");
            }
            else if(Telefone.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Telefone");
            }
            else if(MEquipamentos.isSelected()){
                conta.setDataPagamento(DataPagamentoText.getText());
                conta.setDataVencimento(DataVencimentoText.getText());
                conta.setDescricao("Manutenção de equipamentos");
            }
            pgc.addConta(conta);
            if(janelaAdmin != null){
                janelaAdmin.setVisible(true);
                janelaAdmin.setEnabled(true);
            }
            else if(jaa != null){
                jaa.setVisible(true);
                jaa.setEnabled(true);
            }
            this.setEnabled(false);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        /// Gerenciamento de janelas
        if(janelaAdmin != null){
            janelaAdmin.setVisible(true);
            janelaAdmin.setEnabled(true);
        }
        else if(jaa != null){
            jaa.setVisible(true);
            jaa.setEnabled(true);
        }
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Gerenciamento de janelas
        if(janelaAdmin != null){
            janelaAdmin.setVisible(true);
            janelaAdmin.setEnabled(true);
        }
        else if(jaa != null){
            jaa.setVisible(true);
            jaa.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FazerPagamentoDeContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPagamentoDeContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPagamentoDeContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPagamentoDeContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPagamentoDeContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Agua;
    private javax.swing.JRadioButton Alguel;
    private javax.swing.JRadioButton CMaterias;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField DataPagamentoText;
    private javax.swing.JTextField DataVencimentoText;
    private javax.swing.JRadioButton Luz;
    private javax.swing.JRadioButton MAtendimento;
    private javax.swing.JRadioButton MEquipamentos;
    private javax.swing.JRadioButton PLimpeza;
    private javax.swing.JRadioButton Telefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
