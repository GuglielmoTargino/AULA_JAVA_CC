
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
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","pmaght","4004"); 
            st=conn.createStatement();
            st.executeUpdate("INSERT INTO produto(id_prod,nome_prod,tipo) VALUES(6,'banana','kg')");              
            JOptionPane.showMessageDialog(null,"Cadastro bem Sucedido");
            
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null,"Erro de Biblioteca");
            
        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null,"Falha de dado recusados ou incorretos");
        }         
    }
}