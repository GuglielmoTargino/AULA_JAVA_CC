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
        Connection conn = conectar_();
        PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ?  AND senha = ? ");  // comando query no BD
        st.setString(1, u);
        st.setString(2, s);
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }

    public static void salvarDepartamento_(int cod, String nom, String cid, String tel) throws ClassNotFoundException, SQLException {
        Connection conn = conectar_();

        PreparedStatement st = conn.prepareStatement("INSERT INTO departamento (codigo,nome,cidade,telefone) VALUES(?,?,?,?)");  // serve para permitir execuat escrita no BD          
        st.setInt(1, cod);
        st.setString(2, nom);
        st.setString(3, cid);
        st.setString(4, tel);
        st.executeUpdate();

    }

}
