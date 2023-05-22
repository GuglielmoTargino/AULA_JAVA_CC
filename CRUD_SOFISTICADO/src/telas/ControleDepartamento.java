package telas;

import dados_conexao_bd.SistemaDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ControleDepartamento extends javax.swing.JFrame {

    //op aqui é uma variave. pode ser X,V etc
    public ControleDepartamento(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("exc") || op.equalsIgnoreCase("alterar")) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Controle Departamentos");
        getContentPane().setLayout(null);

        lblCodigo.setBackground(new java.awt.Color(0, 204, 204));
        lblCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(204, 255, 255));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        lblCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(40, 150, 100, 30);

        lblNome.setBackground(new java.awt.Color(204, 204, 255));
        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");
        lblNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblNome);
        lblNome.setBounds(40, 20, 100, 30);

        txtCodigo.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(150, 150, 60, 30);

        lblCidade.setBackground(new java.awt.Color(0, 204, 204));
        lblCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(204, 255, 255));
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCidade.setText("Cidade");
        lblCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCidade);
        lblCidade.setBounds(40, 90, 100, 30);

        txtNome.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtNome);
        txtNome.setBounds(150, 20, 250, 30);

        lblTel.setBackground(new java.awt.Color(0, 204, 204));
        lblTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTel.setForeground(new java.awt.Color(204, 255, 255));
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTel.setText("Telefone");
        lblTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblTel);
        lblTel.setBounds(40, 220, 100, 30);

        txtCidade.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtCidade);
        txtCidade.setBounds(150, 90, 250, 30);

        txtTel.setBackground(new java.awt.Color(204, 255, 255));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel);
        txtTel.setBounds(150, 220, 250, 30);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(60, 280, 110, 40);

        btnConsultar.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar Código");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(230, 150, 170, 30);

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(72, 27));
        btnExcluir.setMinimumSize(new java.awt.Dimension(72, 27));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(220, 280, 110, 40);

        btnAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(72, 27));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(370, 280, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chapaferro2v22.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 375);

        setSize(new java.awt.Dimension(516, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        
        try {
            /* chama o metodo salvar departamento da classe sistemaDao com os valores. */           
            SistemaDao.salvarDepartamento_(Integer.parseInt(txtCodigo.getText()), txtNome.getText(), txtCidade.getText(), txtTel.getText());
            
            JOptionPane.showMessageDialog(null, "Cadastro Concluido");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTel.setText("");
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:

        try {
            // TODO code application logic here
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento WHERE codigo = ? ");  // comando query no BD

            st.setString(1, txtCodigo.getText());

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            if (resultado.next()) {
                txtNome.setText(resultado.getString("nome"));
                txtCidade.setText(resultado.getString("cidade"));
                txtTel.setText(resultado.getString("telefone"));

                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Departamento não encontrado");
                txtCodigo.requestFocus(); // coloca o pronpt no campo usuario            
            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            SistemaDao.alterarDepartamento_(txtNome.getText(), txtCidade.getText(), txtTel.getText(),Integer.parseInt(txtCodigo.getText()));
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTel.setText("");

            JOptionPane.showMessageDialog(null, "Alterações com Sucesso. Codigo permanente.");

            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        try {
            // chama o metodo excluir da classe sistemadao.
            SistemaDao.excluirDepartamento_(Integer.parseInt(txtCodigo.getText()));
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTel.setText("");

            JOptionPane.showMessageDialog(null, "Cadastro Excluido");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    /*=======================================================================*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
