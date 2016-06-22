/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import javax.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.InitialContext;
import java.sql.DriverManager;
/**
 *
 * @author Yukine Sugiura
 */
public class Conexionpool {
private static Conexionpool pool = null;
    private static DataSource dataSource = null;
    
    public synchronized static Conexionpool getInstancia(){
    if(pool == null){
    pool= new Conexionpool();
    }
    return pool;
    }
    
    private Conexionpool(){
    try{
    /*InitialContext ic =new InitialContext();
    dataSource = (DataSource) ic.lookup("jdbc:mysql://localhost:3306/PAPW");*/
    Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex){
    ex.printStackTrace();
    }
    }
    
    public Connection getConexion(){
    try{    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PAPW",
            "root", "");
    return con;
    }catch(SQLException ex){
    ex.printStackTrace();
    return null;
    }
    }
    
    public void liberarConexion(Connection c){
    try{
    if (c != null)
        c.close();
    }catch (SQLException ex){
    ex.printStackTrace();
    }
    }
}