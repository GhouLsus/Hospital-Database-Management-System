/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
//           st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200),name varchar(200),dob varchar(200),mobileNumber varchar(200),email varchar(200),username varchar(200),password varchar(200),address varchar(200) )");
//            st.executeUpdate("insert into appuser (userRole, name, dob, mobileNumber, email, username, password, address) values('Admin','Admin','14-08-2004','1112223330','admin@gmail.com','admin','admin','India')");
//            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueID varchar(200),name varchar(200),companyName varchar(200),quantity bigint, price bigint)");
            st.executeUpdate("Create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(50),billDate varchar(100), totalPaid bigint, generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
