
package connec_pg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CONNEC_PG {

  
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
            st.executeUpdate("insert into usuario (nome_usu,id) values('Diana',28)");
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
