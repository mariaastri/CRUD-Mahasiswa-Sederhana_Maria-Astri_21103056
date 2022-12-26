/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.db;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionHelper {
    public static Connection connect;
    public static Statement st;
    public static ResultSet rs;
    
    public static Connection getConnection(){
        if(connect==null){
            try{
                System.out.println("Membuat koneksi...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sisteminformasi",
                        "root",
                        "");
                st = connect.createStatement();
                JOptionPane.showMessageDialog(null,"Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Tidak Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }
        }
        return connect;
    }
    
    public static void main(String[] args) {
        ConnectionHelper.getConnection();
    }
}
