/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Merna
 */
public class Product {
    private String name;
    private int id;
    private double price;
    private int quantity;
   
    public Product(String name, double price,int quantity) {
        this.quantity=quantity;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
 
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
    /*public String lineRepresentation() {
        return this.id + "," + 
                this.name + "," + 
                this.price + "," +
                this.quantity;
    }
*/
}
