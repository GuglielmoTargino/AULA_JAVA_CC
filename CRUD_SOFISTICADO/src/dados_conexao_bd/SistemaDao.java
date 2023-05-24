package dados_conexao_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Guglielmo H T
 */
public class SistemaDao {

    public static Connection conectar_() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //classe do drive que faz conexaõ com o BD. 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", ""); //variavel da classe connection para conexão
        return conn;
    }

    public static ResultSet fazerLogin_(String u, String s) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_(); //====================================
        PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ?  AND senha = ? ");  // comando query no BD
        st.setString(1, u);
        st.setString(2, s);
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }

    public static void salvarDepartamento_(int cod, String nom, String cid, String tel) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("INSERT INTO departamento (codigo,nome,cidade,telefone) VALUES(?,?,?,?)");  // serve para permitir execuat escrita no BD          
        st.setInt(1, cod);
        st.setString(2, nom);
        st.setString(3, cid);
        st.setString(4, tel);
        st.executeUpdate();
    }

    public static void excluirDepartamento_(int cod)throws ClassNotFoundException, SQLException{
       
        Connection conn= SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("delete from departamento where codigo=?");  // serve para permitir execuat escrita no BD          
        st.setInt(1, cod);
        st.executeUpdate();
    }

    public static void alterarDepartamento_(String nom, String cid, String tel, int cod) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        
        PreparedStatement st = conn.prepareStatement("update departamento set nome=?, cidade=?, telefone=? where codigo=?");  // serve para permitir execuat escrita no BD          

        st.setString(1, nom);
        st.setString(2, cid);
        st.setString(3, tel);
        st.setInt(4, cod);
        st.executeUpdate();
    }
  public static ResultSet consultarDepto_(String cod)throws ClassNotFoundException, SQLException{
            Connection conn = SistemaDao.conectar_(); 
            
            PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento WHERE codigo = ? ");  // comando query no BD
            st.setString(1, cod);
            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            return resultado;      
  }
  public static void salvarUsuario_(String nom, String car, int sen) throws ClassNotFoundException,SQLException{
       Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            PreparedStatement st = conn.prepareStatement("INSERT INTO usuario (usuario,cargo,senha) VALUES(?,?,?)");  // serve para permitir execuat escrita no BD          
            st.setString(1,nom);
            st.setString(2,car);
            st.setInt(3, sen);
            st.executeUpdate();      
  }
  public static void alterarUsuario_(int sen, String car, String nom)throws ClassNotFoundException, SQLException{
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            PreparedStatement st = conn.prepareStatement("update usuario set senha=?, cargo=? where usuario=?");  // serve para permitir execuat escrita no BD          
            st.setInt(1, sen);
            st.setString(2,car);
            st.setString(3,nom);
            st.executeUpdate();// executa o comando SQL no BD      
  }
  public static ResultSet consultarUsuario_(String nom)throws ClassNotFoundException, SQLException{
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            PreparedStatement st = conn.prepareStatement("SELECT * FROM  usuario WHERE usuario= ? ");  // comando query no BD
            st.setString(1,nom);
            //aqui resultado guarda o valor encontrado no BD.
            ResultSet resultado = st.executeQuery();
            return resultado;
      
  }
 
}
