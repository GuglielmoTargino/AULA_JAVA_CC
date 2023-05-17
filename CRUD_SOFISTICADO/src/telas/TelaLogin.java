package telas;

import dados_conexao_bd.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;// usado para opção caso a execução falhe

import java.sql.PreparedStatement; //usado para executar os comandos SQL
import java.sql.ResultSet; //usado para guardar os resultados da consulta SQL
import javax.swing.JOptionPane;

/**
 *
 * @author Guglielmo H T
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        ckbSenha = new javax.swing.JCheckBox();
        lblIcone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(153, 153, 255));
        setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(180, 30, 70, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(190, 90, 60, 30);

        txtSenha.setText("jPasswordField1");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(260, 90, 80, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(260, 30, 110, 30);

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(260, 150, 110, 40);

        ckbSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckbSenha);
        ckbSenha.setBounds(350, 90, 30, 19);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/porta2.jpg"))); // NOI18N
        lblIcone.setText("lblIcone");
        lblIcone.setMaximumSize(new java.awt.Dimension(800, 600));
        lblIcone.setMinimumSize(new java.awt.Dimension(0, 0));
        lblIcone.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(lblIcone);
        lblIcone.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        

        try {
            // TODO code application logic here
          
            //SistemaDao c_= new SistemaDao(); // tira essa linha quando usa static
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada 
            PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ?  AND senha = ? ");  // comando query no BD

            st.setString(1, txtUsuario.getText());
            st.setString(2, txtSenha.getText());
           
            ResultSet resultado= st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            
            if (resultado.next()){
                String usuario, cargo;
                usuario= resultado.getString("usuario");
                cargo= resultado.getString("cargo");
                dispose();
                new TelaMenu(usuario,cargo).setVisible(true);// chama tela menu com vaiveis usuario e cargo
               
            
                } else{
                JOptionPane.showMessageDialog(null,"Usuario ou senha incorreto");
                txtUsuario.requestFocus(); // coloca o pronpt no campo usuario            
                }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "Falha de Acesso.");
        }
     
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void ckbSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbSenhaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox ckbSenha;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
