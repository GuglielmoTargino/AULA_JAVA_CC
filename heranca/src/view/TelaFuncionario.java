/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import data.Funcionario_;
import data.HerancaDao;
import data.Pessoa_;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guglielmo H T
 */
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setTitle("Controle Funcionario");
        getContentPane().setLayout(null);

        lblSalario.setText("salario");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(60, 240, 100, 30);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(210, 230, 170, 40);

        lblCpf.setText("cpf");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(70, 30, 100, 30);

        lblNome.setText("nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(60, 70, 100, 30);

        lblEmail.setText("email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(60, 110, 100, 30);

        lblTelefone.setText("telefone");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(60, 150, 100, 30);

        lblCargo.setText("cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(60, 190, 100, 30);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(211, 30, 170, 40);
        getContentPane().add(txtNome);
        txtNome.setBounds(210, 70, 170, 40);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(210, 110, 170, 40);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(210, 150, 170, 40);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(210, 190, 170, 40);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(40, 313, 90, 30);

        setSize(new java.awt.Dimension(438, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {

            //Funcionario_ funcionario; criar obeto funcionario usando classe
            //Pessoa
            
            Pessoa_ funcionario;
            funcionario = new Funcionario_(
                    txtCargo.getText(),
                    Double.parseDouble(txtSalario.getText()),
                    txtCpf.getText(), txtNome.getText(),
                    txtEmail.getText(),
                    txtTelefone.getText()
            );

            new HerancaDao().salvarFuncionario((Funcionario_) funcionario);
            JOptionPane.showMessageDialog(null, "Funcionario salvo com Sucesso");

        } catch (ClassNotFoundException | SQLException ex) { 
            
                JOptionPane.showMessageDialog(null, ex.getMessage());
                JOptionPane.showMessageDialog(null,"Cpf já existe");
                
                
        } catch( NumberFormatException ex){
    
        JOptionPane.showMessageDialog(null, "Utilize apenas numero e ponto.");
                txtSalario.setText("0");
                txtSalario.requestFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
