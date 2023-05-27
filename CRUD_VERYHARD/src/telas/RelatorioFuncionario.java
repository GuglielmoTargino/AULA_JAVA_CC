
package telas;

import dados_conexao_bd.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioFuncionario extends javax.swing.JFrame {

    public RelatorioFuncionario() {
        initComponents();
        try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.relatorioFuncionario_();

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final

            modeloBaseTabela = (DefaultTableModel) tblRelatorioFuncionario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("sexo"),
                    resultado.getString("dt_nasc"),
                    resultado.getString("cpf"),
                    resultado.getString("salario"),
                    resultado.getString("matricula")

                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

                //comando que pega o codigo e insere no cmbCodigo 
                cmbCargo.addItem(resultado.getString("cargo"));
                cmbMatricula.addItem(resultado.getString("matricula"));

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorioFuncionario = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbMatricula = new javax.swing.JComboBox<>();

        setTitle("Relatório de Funcionário");
        getContentPane().setLayout(null);

        tblRelatorioFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cargo", "Sexo", "Dt. Nasc", "Cpf", "Salario", "Matricula"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorioFuncionario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 690, 250);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");
        lblNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblNome);
        lblNome.setBounds(60, 26, 100, 40);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Cargo");
        lblCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCargo);
        lblCargo.setBounds(60, 96, 100, 30);

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMatricula.setText("Matricula");
        lblMatricula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(60, 146, 100, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(190, 22, 90, 40);

        btnBusca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca);
        btnBusca.setBounds(310, 20, 110, 40);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(190, 82, 90, 40);

        cmbMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMatricula);
        cmbMatricula.setBounds(190, 140, 90, 40);

        setSize(new java.awt.Dimension(726, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatriculaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.cmbMatriculaFuncionario_(cmbMatricula.getSelectedItem().toString());
            
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblRelatorioFuncionario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("sexo"),
                    resultado.getString("dt_nasc"),
                    resultado.getString("cpf"),
                    resultado.getString("salario"),
                    resultado.getString("matricula")
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }


    }//GEN-LAST:event_cmbMatriculaActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here            
            ResultSet resultado=SistemaDao.cmbCargoFuncionario_(cmbCargo.getSelectedItem().toString());           
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblRelatorioFuncionario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("sexo"),
                    resultado.getString("dt_nasc"),
                    resultado.getString("cpf"),
                    resultado.getString("salario"),
                    resultado.getString("matricula")
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

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            ResultSet resultado;
            resultado=SistemaDao.btnBuscarFuncionario_("%" + txtNome.getText() + "%");
            
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblRelatorioFuncionario.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois
       
          while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("sexo"),
                    resultado.getString("dt_nasc"),
                    resultado.getString("cpf"),
                    resultado.getString("salario"),
                    resultado.getString("matricula")
                };
                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);
          }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração");
        }

    }//GEN-LAST:event_btnBuscaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

   
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

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblRelatorioFuncionario;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
