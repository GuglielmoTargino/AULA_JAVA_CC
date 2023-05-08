package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        if(ght.equalsIgnoreCase("cadastrar")){
            btnSalvar.setVisible(true);
            btnConsultar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            
        } else if(ght.equalsIgnoreCase("excluir")||(ght.equalsIgnoreCase("consultar"))){
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(true);
            
            
        } else if(ght.equalsIgnoreCase("alterar")){
            btnExcluir.setVisible(false);
            btnSalvar.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(true);
                      
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
        btnAlterar = new javax.swing.JButton();

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
        txtMatricula.setBounds(140, 320, 50, 30);

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
        txtNome.setBounds(140, 20, 220, 30);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(140, 70, 220, 30);
        getContentPane().add(txtSexo);
        txtSexo.setBounds(140, 120, 220, 30);
        getContentPane().add(txtDtNasc);
        txtDtNasc.setBounds(140, 170, 220, 30);

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(140, 220, 220, 30);

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatricula.setText("Matricula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(40, 320, 100, 30);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(140, 270, 220, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 380, 100, 50);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(210, 320, 150, 30);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(150, 380, 100, 50);

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(290, 380, 100, 50);

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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
              try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            PreparedStatement st = conn.prepareStatement("delete from funcionario where matricula=?");  // serve para permitir execuat escrita no BD          

            st.setString(1, txtMatricula.getText());

            st.executeUpdate(); //comando para executar SQL no BD

            txtNome.setText("");
            txtCargo.setText("");
            txtSexo.setText("");
            txtDtNasc.setText("");
            txtCpf.setText("");
            txtSalario.setText("");
            txtMatricula.setText("");

            JOptionPane.showMessageDialog(null, "Funcionário Excluido");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no cadastro");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        
              try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            PreparedStatement st = conn.prepareStatement("SELECT * FROM funcionario WHERE matricula= ? ");  // comando query no BD

            st.setString(1, txtMatricula.getText());

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            // se o resulatdo não valtar vazio será executado o IF aqui.
            if (resultado.next()) {
                txtNome.setText(resultado.getString("nome"));
                txtCargo.setText(resultado.getString("cargo"));
                txtSexo.setText(resultado.getString("sexo"));
                txtDtNasc.setText(resultado.getString("dt_nasc"));
                txtCpf.setText(resultado.getString("cpf"));
                txtSalario.setText(resultado.getString("salario"));
                txtMatricula.setText(resultado.getString("matricula"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                

            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
                txtMatricula.requestFocus(); // coloca o pronpt no campo usuario            
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
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            PreparedStatement st = conn.prepareStatement("update funcionario set nome=?, cargo=?, sexo=?, dt_nasc=?, cpf=?, salario=? where matricula=?");  // serve para permitir execuat escrita no BD          

            st.setString(1, txtNome.getText());
            st.setString(2, txtCargo.getText());
            st.setString(3, txtSexo.getText());
            st.setString(4, txtDtNasc.getText());
            st.setString(5, txtCpf.getText());
            st.setDouble(6,Double.parseDouble(txtSalario.getText())); 
            st.setString(7,txtMatricula.getText());
            

            st.executeUpdate();// executa o comando SQL no BD

            txtNome.setText("");
            txtCargo.setText("");
            txtSexo.setText("");
            txtDtNasc.setText("");
            txtCpf.setText("");
            txtSalario.setText("");
            txtMatricula.setText("");
                        

            JOptionPane.showMessageDialog(null, "Funcionário Alterado com Sucesso");
            
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no comando");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
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
