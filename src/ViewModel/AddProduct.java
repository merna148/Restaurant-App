/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

//import com.sun.jdi.connect.spi.Connection;
import static ViewModel.ViewProducts.getProducts;
import static java.lang.Integer.parseInt;
import model.Product;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
/**
 *
 * @author Merna
 */
public class AddProduct {
     
   //final static ArrayList<Product> productList= new ArrayList();
    public static void newProduct(int key,int quantity)
    {
        if (key==1)
        {
            Product p=new Product();
            p.setName("Molten Cake");
            p.setPrice(45);
            p.setQuantity(quantity);
            //productList.add(p);
            insert(p);
            
        }
        else if (key==2)
        {
            Product p=new Product();
            p.setName("Waffle");
            p.setPrice(40);
            p.setQuantity(quantity);
            //productList.add(p);
             insert(p);
        }
        else if (key==3)
        {
            Product p=new Product();
            p.setName("Burger");
            p.setPrice(80);
            p.setQuantity(quantity);
            //productList.add(p);
            insert(p);
        }
        else
        {
            Product p=new Product();
            p.setName("Pizza");
            p.setPrice(100);
            p.setQuantity(quantity);
            //productList.add(p);
             insert(p);
        }
        
    }

    public static boolean productValidation(String s, int key) {
        try {
            int n = parseInt(s);
            if (s.isEmpty()) {
                return false;
            } else if (n < 1) {
                return false;
            } else {
                newProduct(key,n);
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "product";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url + databaseName, username, password);
            System.out.println("connected successfully");
            return con;
        } catch (Exception ex) {
            System.out.println("Can't connect to database");
        }
        return null;

    }

    public static void insert(Product p) {
        Connection con = getConnection();
        try {
            String sql = "INSERT INTO products(name,price,quantity) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setInt(3, p.getQuantity());
            stmt.execute();
            System.out.println("Product inserted successfully");
            con.close();

        } catch (SQLException ex) {
            System.out.println("can't insert data");
        }
    }
   /*public static void insertData()
    {
        for(Product p:productList)
        {
            insert(p);
        }
    }*/
   public static double getTotalPrice()
   {
       double T_price = 0;
       ArrayList<Product> productList= new ArrayList();
       productList=getProducts();
       
       for(Product p:productList)
        {
           T_price=T_price+(p.getPrice()*p.getQuantity());
        }
       return T_price;
   }

}
