/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Mehdi KHATTABI
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user (id int AUTO_INCREMENT primary key , name varchar (200) not null , email varchar(200) not null ,number varchar(10) not null ,password varchar(200) not null, status varchar(20),state boolean default '1' ,UNIQUE(email))";
            String categoryTable = "create table category (id int AUTO_INCREMENT primary key , name varchar(200), state boolean default '1')";
           String productTable = "create table product (id int AUTO_INCREMENT primary key , name varchar(200),category varchar(200),price varchar(200), state boolean default '1' ) ";
            String billTable = "create table bill (id int AUTO_INCREMENT primary key , productname varchar(200),Date varchar (200),quantity varchar(200) ,total varchar(200), Waiter varchar  (200) ) ";
            DbOperation.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperation.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataOrDelete(billTable, "bill Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
//,FOREIGN KEY (category) REFERENCES category(id_cat)
