/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Guglielmo H T
 */
public class Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Funcionario
     */
    public Funcionario() {
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

        lblNome = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblSobreNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(40, 20, 100, 30);
        getContentPane().add(txtTel);
        txtTel.setBounds(160, 320, 200, 30);

        lblSobreNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSobreNome.setText("Sobre Nome");
        getContentPane().add(lblSobreNome);
        lblSobreNome.setBounds(40, 70, 100, 30);

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSexo.setText("Sexo");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(40, 120, 100, 30);

        lblDtNasc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDtNasc.setText("Data Nasc");
        getContentPane().add(lblDtNasc);
        lblDtNasc.setBounds(40, 170, 100, 30);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setText("CPF");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(40, 220, 100, 30);

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setText("Salario");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(40, 270, 100, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(160, 20, 200, 30);
        getContentPane().add(txtSobreNome);
        txtSobreNome.setBounds(160, 70, 200, 30);
        getContentPane().add(txtSexo);
        txtSexo.setBounds(160, 120, 200, 30);
        getContentPane().add(txtDataNasc);
        txtDataNasc.setBounds(160, 170, 200, 30);

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(160, 220, 200, 30);

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatricula.setText("Matricula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(40, 320, 100, 30);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 270, 200, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 380, 120, 50);

        setSize(new java.awt.Dimension(432, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSobreNome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSobreNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
