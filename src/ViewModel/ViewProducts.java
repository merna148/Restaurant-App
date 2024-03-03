package ViewModel;

import static ViewModel.AddProduct.getConnection;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Statement;
import java.util.ArrayList;
import model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Merna
 */
public class ViewProducts {

    public static ArrayList<Product> getProducts() {
        Connection con = getConnection();
        Statement stmt;
        ArrayList<Product> productList = new ArrayList();
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id,name,price,quantity from products");
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setQuantity(rs.getInt("quantity"));
                productList.add(p);
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println("Can't view products");
        }
        return productList;

    }

    public static String tostring(Product p) {
        return p.getId() + ","
                + p.getName() + ","
                + p.getPrice() + ","
                + p.getQuantity();
    }

    public static String[][] TableData(View table) {
        ArrayList<Product> products = getProducts();
        Product[] myproducts = (Product[]) products.toArray(Product[]::new);
        String[][] tableData = new String[myproducts.length][100];
        for (int i = 0; i < myproducts.length; i++) {
            tableData[i] = tostring(myproducts[i]).split(",");
        }
        return tableData;
    }
    
    public static void setData(String[][] data,JTable jTable1,String[]columns){
        jTable1.setModel(new DefaultTableModel(data,columns){
                  @Override
                  public boolean isCellEditable(int row, int column) {
                return false;
        }
           
        });
    }

}
