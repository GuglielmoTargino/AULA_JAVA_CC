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
                //cmbCodigo.addItem(resultado.getString("codigo"));
                //cmbCidade.addItem(resultado.getString("cidade"));
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
        jScrollPane1.setBounds(10, 102, 660, 330);

        setSize(new java.awt.Dimension(694, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRelatorioUsuario;
    // End of variables declaration//GEN-END:variables
}
