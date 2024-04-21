/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author Mehdi KHATTABI
 */
public class CategoryDao {

    public static void save(Category category, Connection conn) {
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT into category (name) values(?)");
            pstmt.setString(1, category.getName());

            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select*from category where state='"+1+"'");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id, Connection conn) {
        try {
            PreparedStatement st2 = conn.prepareStatement("update category set state = '" + 0 + "' ");
            st2.executeUpdate();
            //st.executeUpdate();
            st2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
