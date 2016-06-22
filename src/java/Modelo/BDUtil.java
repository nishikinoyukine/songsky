/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Yukine Sugiura
 */
public class BDUtil {
    public static void cerrarStatement(Statement s){
    try{if(s != null)
        s.close();
    }catch (SQLException e){
    e.printStackTrace();
    }
    }
   
     public static void cerrarResultset(ResultSet rs){
    try{if(rs != null)
        rs.close();
    }catch (SQLException e){
    e.printStackTrace();
    }
    }
     
}
