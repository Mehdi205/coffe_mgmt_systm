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
import javax.swing.JOptionPane;
import model.Bill;
//import model.Bill;

/**
 *
 * @author Mehdi KHATTABI
 */
public class BillDao {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperation.getData("select max(id)from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
   

    public static void save(Bill bill) {

        /*PreparedStatement pstmt = conn.prepareStatement("INSERT into product (id,productname,date,total,waiter) values(?,?,?,?,?)");
            pstmt.setString(1, bill.getId());
            pstmt.setString(2, bill.getProductname());
            pstmt.setString(3, bill.getDate());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Product Added Successfully !");*/
        try {
            String query = "insert into bill values ('" + getId() + "','" + bill.getName() + "','" + bill.getDate() + "','" + bill.getQuantity() + "','" + bill.getTotal() + "','" + bill.getWaiter() + "')";
            System.out.println("------" + getId() + "----" + bill.getName() + "----" + bill.getTotal() + "----" + bill.getWaiter() + "----");
            DbOperation.setDataOrDelete(query, "Bill Added Successfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<Bill> getAllRecordsByInc(String date) {

        ArrayList<Bill> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperation.getData("select * from bill where date like '%"+date+"%' ");
            while (rs.next()) {
                Bill bil1 = new Bill();
                bil1.setId(rs.getInt("id"));
                bil1.setDate(rs.getString("Date"));
                bil1.setQuantity(rs.getString("quantity"));
                bil1.setTotal(rs.getString("total"));
                bil1.setWaiter(rs.getString("waiter"));
                arrayList.add(bil1);}}
                catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
}
                return arrayList;
            

        
    }

     public static ArrayList<Bill> getAllRecordsByDesc (String date,String waiter) {

        ArrayList<Bill> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperation.getData("select id,date,quantity,total,waiter from bill where date like '%"+date+"%' and waiter like '%"+waiter+"%' order by id desc ");
            while (rs.next()) {
                Bill bil1 = new Bill();
                bil1.setId(rs.getInt("id"));
                bil1.setDate(rs.getString("Date"));
                bil1.setQuantity(rs.getString("quantity"));
                bil1.setTotal(rs.getString("total"));
                bil1.setWaiter(rs.getString("waiter"));
                arrayList.add(bil1);}}
                catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
}
                return arrayList;
            

        
    }
    
    public static ArrayList<Bill> getAllRecordsByAll (String date,String waiter) {

        ArrayList<Bill> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperation.getData("select * from bill where date like '%"+date+"%' and waiter like '%"+waiter+"%' ");
            while (rs.next()) {
                Bill bil1 = new Bill();
                bil1.setId(rs.getInt("id"));
                bil1.setName(rs.getString("productname"));
                bil1.setDate(rs.getString("Date"));
                bil1.setQuantity(rs.getString("quantity"));
                bil1.setTotal(rs.getString("total"));
                bil1.setWaiter(rs.getString("Waiter"));
                arrayList.add(bil1);}}
                catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
}
                return arrayList;
            

        
    }
    
    public static ArrayList<Bill> getAllRecordsByWaiter (String name) {

        ArrayList<Bill> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperation.getData("select * from bill where waiter like '%"+name+"%' ");
            while (rs.next()) {
                Bill bil1 = new Bill();
                bil1.setId(rs.getInt("id"));
                bil1.setName(rs.getString("productname"));
                bil1.setDate(rs.getString("Date"));
                bil1.setQuantity(rs.getString("quantity"));
                bil1.setTotal(rs.getString("total"));
                bil1.setWaiter(rs.getString("Waiter"));
                arrayList.add(bil1);}}
                catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
}
                return arrayList;
            

        
    }
    
    public static ArrayList<Bill> getAllRecordsByMe (String username) {

        ArrayList<Bill> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperation.getData("select * from bill ");
            while (rs.next()) {
                Bill bil1 = new Bill();
                bil1.setId(rs.getInt("id"));
                bil1.setName(rs.getString("productname"));
                bil1.setDate(rs.getString("Date"));
                bil1.setQuantity(rs.getString("quantity"));
                bil1.setTotal(rs.getString("total"));
                bil1.setWaiter(rs.getString("Waiter"));
                arrayList.add(bil1);}}
                catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
}
                return arrayList;
            

        
    }
    
}
