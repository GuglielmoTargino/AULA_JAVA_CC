/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connec_pg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Guglielmo H T
 */
public class CONNEC_PG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection conn;
            Statement st;

            // URL de conexão com o banco de dados PostgreSQL
            String urla = "jdbc:postgresql://localhost:5432/ventolest";
            String usuario = "ght";
            String senha = "4004";

            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urla, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");

            st = conn.createStatement();
            st.executeUpdate("insert into usuario (nome_usu,id) values('Diacono',88)");
             System.out.println("Processo Concluído!");

            conn.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Biblioteca");
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL ou Login");
            ex.printStackTrace();
        }
    }
    }
