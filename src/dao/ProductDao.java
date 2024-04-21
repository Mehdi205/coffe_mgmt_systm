/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import model.Product;
import model.user;
/**
 *
 * @author Mehdi KHATTABI
 */
public class ProductDao {
        public static void save(Product product, Connection conn) throws SQLException {
    
            PreparedStatement pstmt = conn.prepareStatement("INSERT into product (name,category,price) values(?,?,?)");
            pstmt.setString(1, product.getName());
            pstmt.setString(2, product.getCategory());
            pstmt.setString(3, product.getPrice());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Product Added Successfully !");
        }
        
        public static ArrayList<Product> getAllRecords(){
            ArrayList<Product> arrayList = new ArrayList<>();
            try{
                ResultSet rs = DbOperation.getData("select * from product where state = '"+1+"' ");
                while(rs.next()){
                    Product product =new Product();
                    product.setId(rs.getInt("id"));
                    //System.out.println("****** ID "+rs.getString("id"));
                    product.setName(rs.getString("name"));
                    product.setCategory(rs.getString("category"));
                    product.setPrice(rs.getString("price"));
                    arrayList.add(product);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            return arrayList;
        }
        
         
         
        public static void Update (Product product,Connection conn){
          try{  
            PreparedStatement st = conn.prepareStatement("update product set name='"+product.getName()+"',category='"+product.getCategory()+"',price='"+product.getPrice()+"'  where id = '"+product.getId()+"'");
            st.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Product Updated Successfully !");
                    
            st.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        public static void delete(String id ,  Connection conn){
    try {
            PreparedStatement st = conn.prepareStatement("update product set state ='"+0+"'");            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product Deleted Successfully !");
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
        
        public static ArrayList<Product> getAllRecordsByWaiter(String category){
            ArrayList<Product> arrayList = new ArrayList<>();
            try{
                ResultSet rs = DbOperation.getData("select name from product where state = '"+1+"' ");
                while (rs.next()){
                    Product product = new Product();
                    product.setName(rs.getString("name"));
                    arrayList.add(product);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return arrayList;
        }
        
        
        
        public static ArrayList<Product> getAllRecordsByCategory(String category){
            ArrayList<Product> arrayList = new ArrayList<>();
            try{
                ResultSet rs = DbOperation.getData("select * from product where category = '"+category+"' ");
                 System.out.println("-----"+category);
                while (rs.next()){
                    Product product = new Product();
                    product.setName(rs.getString("name"));
                    arrayList.add(product);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return arrayList;
        }
        
        
        public static ArrayList<Product> filterProductByName(String name,String category){
            ArrayList<Product> arrayList = new ArrayList<>();
            try{
                ResultSet rs = DbOperation.getData("select * from product where name like'%"+name+"%' and category = '"+category+"' ");
                while (rs.next()){
                    Product product = new Product();
                    product.setName(rs.getString("name"));
                    arrayList.add(product);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return arrayList;
        }
        
        public static Product getProductByName(String name){
            Product product = new Product();
            try{
                ResultSet rs = DbOperation.getData("select * from product where name ='"+name+"'");
                while (rs.next()){
                    product.setName(rs.getString(2));
                    product.setCategory(rs.getString(3));
                    product.setPrice(rs.getString(4));
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return product;
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
}

