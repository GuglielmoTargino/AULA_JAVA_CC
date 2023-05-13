package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioUsuario extends javax.swing.JFrame {

    public RelatorioUsuario() {
        initComponents();
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            java.sql.PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario");  // comando query no BD

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final

            modeloBaseTabela = (DefaultTableModel) tblRelatorioUsuario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("cargo")

                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

                //comando que pega o codigo e insere no cmbCodigo 
                cmbCargo.addItem(resultado.getString("cargo"));
                cmbSenha.addItem(resultado.getString("senha"));
            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }
    }

    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioFuncionario().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorioUsuario = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbSenha = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setTitle("Relatorio de Usuario");
        getContentPane().setLayout(null);

        tblRelatorioUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Senha", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorioUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 202, 660, 230);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuário");
        lblUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(60, 16, 110, 40);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Cargo");
        lblCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCargo);
        lblCargo.setBounds(60, 66, 110, 40);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        lblSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblSenha);
        lblSenha.setBounds(60, 116, 110, 40);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(190, 20, 100, 40);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(190, 70, 100, 40);

        cmbSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSenha);
        cmbSenha.setBounds(190, 120, 100, 40);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(320, 20, 90, 40);

        setSize(new java.awt.Dimension(694, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSenhaActionPerformed
        // TODO add your handling code here:
         try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            java.sql.PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario where senha=?");  // comando query no BD

            //pega a string para colocar no comando where
            st.setString(1, cmbSenha.getSelectedItem().toString());

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final

            modeloBaseTabela = (DefaultTableModel) tblRelatorioUsuario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("cargo")
                   
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }
        
    }//GEN-LAST:event_cmbSenhaActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
         try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            java.sql.PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario where cargo=?");  // comando query no BD

            //pega a string para colocar no comando where
            st.setString(1, cmbCargo.getSelectedItem().toString());

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final

            modeloBaseTabela = (DefaultTableModel) tblRelatorioUsuario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("cargo")
                   
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }
        
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
         try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            java.sql.PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario where usuario LIKE ?");  // comando query no BD

            //pega a string para colocar no comando where
            st.setString(1, "%" + txtUsuario.getText() + "%");

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final

            modeloBaseTabela = (DefaultTableModel) tblRelatorioUsuario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("cargo")
                   
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblRelatorioUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
