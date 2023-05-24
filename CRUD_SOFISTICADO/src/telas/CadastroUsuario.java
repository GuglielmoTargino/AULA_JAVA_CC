package telas;

import dados_conexao_bd.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Guglielmo H T
 */
public class CadastroUsuario extends javax.swing.JFrame {

    // programa aqiu a variavel passada na chamada em tela menu
    public CadastroUsuario(String gh) {
        initComponents();
        if (gh.equalsIgnoreCase("cadastrar")) {
            btnSalvar.setVisible(true);
            btnConsultar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } else if (gh.equalsIgnoreCase("excluir") || (gh.equalsIgnoreCase("consultar"))) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(true);

        } else {
            btnExcluir.setVisible(false);
            btnSalvar.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(true);

        }
        //(gh.equalsIgnoreCase("alterar"))
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblIcone = new javax.swing.JLabel();

        setTitle("Controle de Usuario");
        setMaximumSize(new java.awt.Dimension(373, 280));
        setMinimumSize(new java.awt.Dimension(373, 280));
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 30, 100, 30);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(20, 70, 100, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 110, 100, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(40, 290, 110, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 30, 200, 30);

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargo);
        txtCargo.setBounds(90, 70, 200, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 110, 200, 30);

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(51, 51, 51));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(200, 290, 110, 30);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(51, 51, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(360, 290, 110, 30);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultar.setText("Consultar Nome");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(310, 30, 130, 30);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/git3.jpg"))); // NOI18N
        lblIcone.setText("lblIcone");
        getContentPane().add(lblIcone);
        lblIcone.setBounds(0, -10, 500, 390);

        setSize(new java.awt.Dimension(516, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            SistemaDao.salvarUsuario_(txtNome.getText(), txtCargo.getText(), Integer.parseInt(txtSenha.getText()));
            limparTexto_();

            JOptionPane.showMessageDialog(null, "Cadastro Concluido");
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");

        }
    }//GEN-LAST:event_btnSalvarActionPerformed
//===========================================================================================
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.consultarUsuario_(txtNome.getText());           

            // se o resulatdo não valtar vazio será executado o IF aqui.
            if (resultado.next()) {

                txtCargo.setText(resultado.getString("cargo"));
                txtSenha.setText(resultado.getString("senha"));

                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                txtNome.requestFocus(); // coloca o pronpt no campo usuario            
            }
            // caso não encontre a biblioteca, mosta "Erro de biblioteca"
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

            // caso não execute o script sql mostra "falha de processo "
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha no comando");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            // chama classe sistemaDao
            SistemaDao.excluirUsuario_( txtNome.getText());
                       
            limparTexto_();
            JOptionPane.showMessageDialog(null, "Usuario Excluido");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no comando");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            SistemaDao.alterarUsuario_(Integer.parseInt(txtSenha.getText()), txtCargo.getText(), txtNome.getText());
            limparTexto_();

            JOptionPane.showMessageDialog(null, "Sucesso na Alteração");

            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no comando");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void limparTexto_() {
        txtNome.setText("");
        txtCargo.setText("");
        txtSenha.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
