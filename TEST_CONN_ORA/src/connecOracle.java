
//Modelo de conexão com banco de dados MySql e Oracle 
//Exercício de aula com o professor Evandro Teruel
//Aluno: Guglielmo Targino.
//Data: 19jul24.
//Versão:v3

import java.sql.Connection;// serve para conectar com o BD
import java.sql.Statement;// serve para conectar com o BD
import javax.swing.JOptionPane;
import java.sql.DriverManager;// serve para conectar com o BD
import java.sql.SQLException;// serve para conectar com o BD


public class connecOracle {

 
    public static void main(String[] args) {
        
              
        try {            
            // TODO code application logic here
            Connection conn; //variavel da classe connection para conexão
            Statement st;// serve para permitir executar escrita no BD       
            
            
            //Oracle >> no oracle não precisa indicar o nome do BD
            //Pois quando faz login de usuario cria uma conta automaticamente.
            Class.forName("oracle.jdbc.driver.OracleDriver");//caminho da classe do drive que faz conexão com o BD.
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ght","4004");
            
             
             st=conn.createStatement(); //autentica a conexão feita com BD.
             st.executeUpdate("insert into usuario(nome_usu,id_usu) values('giranda',15)");
             //st.executeUpdate("insert into pets(nome,id_pet) values('nia',7)");
             //st.executeUpdate("delete from pets where nome='jaha'");
            JOptionPane.showMessageDialog(null,"Processo bem Sucedido");
            
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null,"Erro de Biblioteca"+ex.getMessage());
            
        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null,"Falha de dado recusados ou incorretos"+ex.getMessage());
            
        } 
        
    }
    
}
