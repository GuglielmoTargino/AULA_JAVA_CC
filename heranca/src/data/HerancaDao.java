/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class HerancaDao implements InterfaceDao {
    
        public Connection conectar () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/heranca_dados", "root", "");
        return conn;
        }
        
        public void salvarFuncionario(Funcionario_ funcionario)throws ClassNotFoundException, SQLException {
            Connection conn;
            conn=conectar();
            String sql;
            sql="insert into funcionario values( ?,?,?,?,?,?)";
            PreparedStatement st;
            st=conn.prepareStatement(sql);
            
            st.setString(1,funcionario.getCpf());
            st.setString(2, funcionario.getNome());
            st.setString(3,funcionario.getEmail());
            st.setString(4,funcionario.getTelefone());
            st.setString(5,funcionario.getCargo());
            st.setDouble(6,funcionario.getSalario());
            st.executeUpdate();         
            
        }
        
        public void salvarCliente_(Cliente_ cliente) throws ClassNotFoundException,SQLException{
            
            Connection conn;
            conn=conectar();
            String sql;
            sql="insert into cliente values(?,?,?,?,?)";
            PreparedStatement st;
            st=conn.prepareStatement(sql);
            
            st.setString(1,cliente.getCpf());
            st.setString(2,cliente.getNome());
            st.setString(3,cliente.getEmail());
            st.setString(4,cliente.getTelefone());
            st.setString(5,cliente.getDataCadastro());
            st.executeUpdate();           
            
        }
    
}
