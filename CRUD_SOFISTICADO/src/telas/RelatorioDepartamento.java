package telas;

import dados_conexao_bd.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guglielmo H T
 */
public class RelatorioDepartamento extends javax.swing.JFrame {

    //Construtor aqui nesse ponto.
    public RelatorioDepartamento() {
        initComponents();
        try {
            // TODO code application logic here
           ResultSet resultado=SistemaDao.iniciarRelatorio_();

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblDepartamento.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("cod"),
                    resultado.getString("depto"),
                    resultado.getString("cid"),
                    resultado.getString("tel")
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

                //comando que pega o codigo e insere no cmbCodigo 
                cmbCodigo.addItem(resultado.getString("cod"));
                cmbCidade.addItem(resultado.getString("cid"));
            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração47");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamento = new javax.swing.JTable();
        lblCodigoDepto = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        lblNomeDepto = new javax.swing.JLabel();
        txtNomeDepto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setTitle("Relatório Departamentos");
        getContentPane().setLayout(null);

        tblDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código_Depto", "Nome", "Cidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 680, 330);

        lblCodigoDepto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoDepto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoDepto.setText("CodigoDepto");
        lblCodigoDepto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCodigoDepto);
        lblCodigoDepto.setBounds(40, 30, 130, 40);

        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCodigo);
        cmbCodigo.setBounds(180, 30, 80, 40);

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCidade.setText("Cidade");
        lblCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCidade);
        lblCidade.setBounds(40, 80, 130, 40);

        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(180, 80, 80, 40);

        lblNomeDepto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeDepto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeDepto.setText("NomeDepto");
        lblNomeDepto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblNomeDepto);
        lblNomeDepto.setBounds(40, 140, 130, 40);
        getContentPane().add(txtNomeDepto);
        txtNomeDepto.setBounds(180, 140, 80, 40);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(270, 140, 110, 40);

        setSize(new java.awt.Dimension(715, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.cmbCodigo_(cmbCodigo.getSelectedItem().toString());
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblDepartamento.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("cod"),
                    resultado.getString("depto"),
                    resultado.getString("cid"),
                    resultado.getString("tel")
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);
            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração159");
        }

    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.cmbCidade_(cmbCidade.getSelectedItem().toString());
         
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblDepartamento.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois

            while (resultado.next()) {

                Object dep[] = {
                    resultado.getString("cod"),
                    resultado.getString("depto"),
                    resultado.getString("cid"),
                    resultado.getString("tel")
                };

                //aqui insere na tabela
                modeloBaseTabela.addRow(dep);

            }

        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração192");
        }

    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
               try {
            // TODO code application logic here
            ResultSet resultado=SistemaDao.relatorioDepto_("%"+txtNomeDepto.getText()+"%");
            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
            modeloBaseTabela = (DefaultTableModel) tblDepartamento.getModel();
            modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois
            
            
             while (resultado.next()) {
                
                    Object dep[] = {
                    resultado.getString("cod"),
                    resultado.getString("depto"),
                    resultado.getString("cid"),
                    resultado.getString("tel")};
                             //aqui insere na tabela
                modeloBaseTabela.addRow(dep);                
               }
               
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null, "Erro de biblioteca");

        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null, "falha no alteração222");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
         
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigoDepto;
    private javax.swing.JLabel lblNomeDepto;
    private javax.swing.JTable tblDepartamento;
    private javax.swing.JTextField txtNomeDepto;
    // End of variables declaration//GEN-END:variables
}
