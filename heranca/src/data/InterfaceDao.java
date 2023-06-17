/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Guglielmo H T
 */
public interface InterfaceDao {
    public Connection conectar () throws ClassNotFoundException, SQLException;
    
}
