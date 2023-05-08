package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Guglielmo H T
 */
public class Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Funcionario
     */
    public Funcionario(String ght) {
        initComponents();
        
        if(ght.equalsIgnoreCase("consultar")){
            btnSalvar.setVisible(false);
            
        } else if(ght.equalsIgnoreCase("Excluir")){
            btnSalvar.setVisible(false);
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Funcionários");
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(40, 20, 100, 30);

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(140, 320, 120, 30);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(40, 70, 100, 30);

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSexo.setText("Sexo");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(40, 120, 100, 30);

        lblDtNasc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDtNasc.setText("Data Nasc");
        getContentPane().add(lblDtNasc);
        lblDtNasc.setBounds(40, 170, 80, 30);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setText("CPF");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(40, 220, 100, 30);

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setText("Salario");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(40, 270, 100, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(140, 20, 200, 30);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(140, 70, 200, 30);
        getContentPane().add(txtSexo);
        txtSexo.setBounds(140, 120, 200, 30);
        getContentPane().add(txtDtNasc);
        txtDtNasc.setBounds(140, 170, 200, 30);

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(140, 220, 120, 30);

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatricula.setText("Matricula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(40, 320, 100, 30);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(140, 270, 120, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(80, 380, 120, 50);

        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(270, 220, 90, 30);

        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(250, 380, 120, 50);

        setSize(new java.awt.Dimension(432, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            java.sql.PreparedStatement st = conn.prepareStatement("INSERT INTO funcionario (nome,cargo,sexo,dt_nasc,cpf,salario,matricula) VALUES(?,?,?,?,?,?,?)");  // serve para permitir execuat escrita no BD          

            st.setString(1, txtNome.getText());
            st.setString(2, txtCargo.getText());
            st.setString(3, txtSexo.getText());
            st.setString(4, txtDtNasc.getText());
            st.setString(5, txtCpf.getText());
            st.setDouble(6, Double.parseDouble(txtSalario.getText()));
            st.setString(7, txtMatricula.getText());

            // filtro para obrigar digitação do nome
            if (txtNome.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "O Nome é obrigatório");
                txtNome.requestFocus();
                return; // para a execução do programa
            }

            // filtro para obrigar digitação do cpf
            if (txtCpf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "O CPF é obrigatório");
                txtCpf.requestFocus();
                return; // para a execução do programa
            }

            st.executeUpdate(); // linha que executa a query no BD.

            txtNome.setText("");
            txtCargo.setText("");
            txtSexo.setText("");
            txtDtNasc.setText("");
            txtCpf.setText("");
            txtSalario.setText("");
            txtMatricula.setText("");

            JOptionPane.showMessageDialog(null, "Cadastro Concluido ");
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    //============================================================================
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
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
