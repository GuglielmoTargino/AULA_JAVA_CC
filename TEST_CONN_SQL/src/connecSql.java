import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connecSql{
    public static void main(String[] args) {
        try {
            Connection conn;
            Statement st;

            String urla = "jdbc:sqlserver://localhost:1433;databaseName=connec_test;encrypt=true;trustServerCertificate=true";
            String usuario = "ght";
            String senha = "4004";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(urla, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");

            st = conn.createStatement();
            st.executeUpdate("insert into ti (id,nome) values(33,'y')");
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
