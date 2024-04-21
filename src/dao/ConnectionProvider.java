/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author Mehdi KHATTABI
 */
public class ConnectionProvider {
    public static Connection getCon(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usr?useSSL=false","root","mehdi123");
    return conn;
    }
    catch(Exception e){
        return null ;
    }
    }
}
