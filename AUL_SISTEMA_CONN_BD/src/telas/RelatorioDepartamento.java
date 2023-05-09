
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
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
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
            PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento");  // comando query no BD

           

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.

            DefaultTableModel modeloBaseTabela;// tabela modelo para sincronizar com a tabela final
           
             modeloBaseTabela = (DefaultTableModel) tblDepartamento.getModel();
             modeloBaseTabela.setRowCount(0);// zera a linha quando conta depois
           
            while (resultado.next()) {
                
                  Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
                  
              modeloBaseTabela.addRow(dep);              
                          
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
        tblDepartamento = new javax.swing.JTable();

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
        jScrollPane1.setBounds(10, 230, 680, 310);

        setSize(new java.awt.Dimension(715, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDepartamento;
    // End of variables declaration//GEN-END:variables
}