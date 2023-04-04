
//import Java.sql.Connection; 
//import Java.sql.Statement;

import java.sql.Connection;// serve para conectar com o BD
import java.sql.Statement;// serve para conectar com o BD
import javax.swing.JOptionPane;
import java.sql.DriverManager;// serve para conectar com o BD
import java.sql.SQLException;// serve para conectar com o BD


public class TesteComBD {

    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Connection conn; //variavel da classe connection para conexão
            Statement st;// serve para permitir execuat escrita no BD
            Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD.
            
            /*("jdbc:mysql://localhost:3306/cadastro","root","");*/
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro","root",""); 
            st=conn.createStatement();
            
            /*st.executeUpdate("INSERT INTO testeconn (nome,cargo) VALUES('chu','dog')");*/
            
            st.executeUpdate("INSERT INTO testeconn (nome,cargo) VALUES('lic','gato')");
            
            JOptionPane.showMessageDialog(null,"Processo concluido");
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null,"Erro de biblioteca");
            
        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null,"falha no cadastro");
        }
        
        
        
        
    }

}
    

