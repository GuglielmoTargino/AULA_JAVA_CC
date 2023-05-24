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
    //===============================================================================PROGRAMAÇÃO EM TELAS DE LOGIN 
        public static ResultSet fazerLogin_(String u, String s) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_(); 
        PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ?  AND senha = ? ");  // comando query no BD
        st.setString(1, u);
        st.setString(2, s);
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }
    
    //============================================================================PROGRAMAÇÃO EM TELAS DE DEPARTAMENTO
        public static void salvarDepartamento_(int cod, String nom, String cid, String tel) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("INSERT INTO departamento (codigo,nome,cidade,telefone) VALUES(?,?,?,?)");  // serve para permitir execuat escrita no BD          
        st.setInt(1, cod);
        st.setString(2, nom);
        st.setString(3, cid);
        st.setString(4, tel);
        st.executeUpdate();
    }

    public static void excluirDepartamento_(int cod) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        
        // serve para permitir execuat escrita no BD
        PreparedStatement st = conn.prepareStatement("delete from departamento where codigo=?");            
        st.setInt(1, cod);
        st.executeUpdate();
    }

    public static void alterarDepartamento_(String nom, String cid, String tel, int cod) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        
        // serve para permitir execuat escrita no BD
        PreparedStatement st = conn.prepareStatement("update departamento set nome=?, cidade=?, telefone=? where codigo=?");           

        st.setString(1, nom);
        st.setString(2, cid);
        st.setString(3, tel);
        st.setInt(4, cod);
        st.executeUpdate();
    }

    public static ResultSet consultarDepto_(String cod) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento WHERE codigo = ? ");  // comando query no BD
        
        st.setString(1, cod);
        //st.setString(2, txtSenha.getText());// nao mais nessa tela
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }

    public static ResultSet relatorioDepto_(String nom) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento where nome LIKE ?");  // comando query no BD
        
        //pega a string para colocar no comando where
        st.setString(1, nom);
        
        //st.setString(2, txtSenha.getText());// nao mais nessa tela
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }

    public static ResultSet iniciarRelatorio_() throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();
        PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento");  // comando query no BD
        
        //st.setString(2, txtSenha.getText());// nao mais nessa tela
        ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
        return resultado;
    }
    
    public static ResultSet cmbCidade_(String cid)throws ClassNotFoundException, SQLException{
           Connection conn=SistemaDao.conectar_();
            PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento where cidade=?");  // comando query no BD
            //pega a string para colocar no comando where
            st.setString(1,cid);
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            return resultado;        
    }
    
    public static ResultSet cmbCodigo_(String cod)throws ClassNotFoundException, SQLException{
            Connection conn=SistemaDao.conectar_();
            PreparedStatement st = conn.prepareStatement("SELECT * FROM departamento where codigo=?");  // comando query no BD

            //pega a string para colocar no comando where
            st.setString(1, cod);
            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            return resultado;
            }
    
   //======================================================================PROGRAMAÇÃO EM TELAS DE USUÁRIO
    public static void salvarUsuario_(String nom, String car, int sen) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
        PreparedStatement st = conn.prepareStatement("INSERT INTO usuario (usuario,cargo,senha) VALUES(?,?,?)");  // serve para permitir execuat escrita no BD          
        st.setString(1, nom);
        st.setString(2, car);
        st.setInt(3, sen);
        st.executeUpdate();
    }

    public static void alterarUsuario_(int sen, String car, String nom) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
        PreparedStatement st = conn.prepareStatement("update usuario set senha=?, cargo=? where usuario=?");  // serve para permitir execuat escrita no BD          
        st.setInt(1, sen);
        st.setString(2, car);
        st.setString(3, nom);
        st.executeUpdate();// executa o comando SQL no BD      
    }

    public static ResultSet consultarUsuario_(String nom) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
        PreparedStatement st = conn.prepareStatement("SELECT * FROM  usuario WHERE usuario= ? ");  // comando query no BD
        st.setString(1, nom);
        //aqui resultado guarda o valor encontrado no BD.
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

    public static void excluirUsuario_(String nom) throws ClassNotFoundException, SQLException {
        Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
        PreparedStatement st = conn.prepareStatement("delete from usuario where usuario=?");  // serve para permitir execuat escrita no BD          
        st.setString(1, nom);
        st.executeUpdate(); //comando para executar SQL no BD

    }
    
    //=================================================================PROGRAMAÇÃO EM TELAS DE FUNCIONÁRIO
    
    public static ResultSet consultarFuncionario_(String mat)throws ClassNotFoundException, SQLException{
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            PreparedStatement st = conn.prepareStatement("SELECT * FROM funcionario WHERE matricula= ? ");  // comando query no BD

            st.setString(1,mat);

            //st.setString(2, txtSenha.getText());// nao mais nessa tela
            ResultSet resultado = st.executeQuery(); //aqui resultado guarda o valor encontrado no BD.
            return resultado;        
    }
    public static void salvarFuncionario_(String nom, String car, String sex, String nas, String cpf, String sal, String mat){
            Connection conn = SistemaDao.conectar_();//c_.conectar_(); //chama a class conectar criada
            java.sql.PreparedStatement st = conn.prepareStatement("INSERT INTO funcionario (nome,cargo,sexo,dt_nasc,cpf,salario,matricula) VALUES(?,?,?,?,?,?,?)");  // serve para permitir execuat escrita no BD          

            st.setString(1, txtNome.getText());
            st.setString(2, txtCargo.getText());
            st.setString(3, txtSexo.getText());
            st.setString(4, txtDtNasc.getText());
            st.setString(5, txtCpf.getText());
            st.setDouble(6, Double.parseDouble(txtSalario.getText()));
            st.setString(7, txtMatricula.getText());

        
    }

}
