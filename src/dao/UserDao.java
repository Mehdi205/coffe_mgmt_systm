/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import model.user;
import java.sql.*;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Mehdi KHATTABI
 */
public class UserDao {

    public static void save(user user, Connection conn) {
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT into user (name,email,number,password,status) values(?, ?, ?, ?, ? )");
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getMobilenumber());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getStatus());

            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static user login(String email, String password) {
        user user = new user();
        try {
            ResultSet count = DbOperation.getData("select count(id) as num from user where email='" + email + "'and password = '" + password + "'");
            while (count.next()) {
                if (count.getInt("num") == 0) {
                    user.setIsExist(false);
                    System.out.println(count.getInt("num"));
                } else {
                    ResultSet rs = DbOperation.getData("select * from user where email='" + email + "'and password = '" + password + "' and state = '" + 1 + "'");

                    while (rs.next()) {
                        user.setStatus(rs.getString("status"));
                        user.setIsExist(true);
                        user.setEmail(rs.getString("email"));
                        user.setName(rs.getString("name"));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return user;
    }

    public static ArrayList<user> getAllRecords(String name,String state) {
        ArrayList<user> arrayList = new ArrayList<>();
        try {

            ResultSet rs = DbOperation.getData("select * from user where name like'%" + name + "%' and state = '"+state+"'");
            System.out.println("-----"+state);
            while (rs.next()) {
                user user = new user();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobilenumber(rs.getString("number"));
                user.setPassword(rs.getString("password"));
                user.setStatus(rs.getString("status"));
                user.setState(rs.getString("state"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arrayList;
    }

      public static ArrayList<user> getAllRecords2(String name){
            ArrayList<user> arrayList = new ArrayList<>();
            try{
                ResultSet rs = DbOperation.getData("select*from user where name like '%"+name+"%'");
                
        while(rs.next()){
            user user =new user();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setMobilenumber(rs.getString("number"));
            user.setPassword(rs.getString("password"));
            user.setStatus(rs.getString("status"));
            user.setState(rs.getString("state"));
            arrayList.add(user);
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            return arrayList;
        }
    public static void delete(String id, Connection conn) {
        try {
            PreparedStatement st = conn.prepareStatement("update user set state ='" + 0 + "' where id='" + id + "'");
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void Update(user user, Connection conn) {
        try {
            PreparedStatement st = conn.prepareStatement("update user set name='" + user.getName() + "',email='" + user.getEmail() + "',number='" + user.getMobilenumber() + "' ,password='" + user.getPassword() + "',status='" + user.getStatus() + "' ,state='" + user.getState() + "'  where id = '" + user.getId() + "' ");
            JOptionPane.showMessageDialog(null, "User Information Updated Successfully !");
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
// run the insert SQL

//String query="insert into user(name,email,number,password,confpassword,status)values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getPassword()+"','"+user.getConfirmpassword()+"','false')";
//        DbOperation.setDataOrDelete(query, "Registred Successfully !");

