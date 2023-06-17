/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guglielmo H T
 */
public class CadastroDao implements InterfaceDao{

    @Override
    public Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "");
        return conn;
       
    }
    
}
