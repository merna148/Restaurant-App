/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static ViewModel.ViewProducts.TableData;
import static ViewModel.ViewProducts.setData;
import javax.swing.JFrame;

/**
 *
 * @author Merna
 */
public class Plattes extends javax.swing.JFrame implements Node {
private Node n;
View table;
    /**
     * Creates new form Plattes
     */
    public Plattes(JFrame parent) {
        initComponents();
        this.setTitle("Main Plattes");
       this.setSize(600,330);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pizza = new javax.swing.JButton();
        burger = new javax.swing.JButton();
        view = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pizza.setText("Pizza");
        pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaActionPerformed(evt);
            }
        });
        getContentPane().add(pizza);
        pizza.setBounds(380, 70, 72, 45);

        burger.setText("Burger");
        burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerActionPerformed(evt);
            }
        });
        getContentPane().add(burger);
        burger.setBounds(130, 70, 72, 39);

        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eye-24.png"))); // NOI18N
        view.setText("View Order");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(410, 230, 150, 39);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-go-back-24.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(60, 223, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2022-12-15 at 11.32.54 PM (1).jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaActionPerformed
        // TODO add your handling code here:
        DetailsWindow p=new DetailsWindow(4);
          p.setVisible(true);
        p.setParentNode(this);
        this.setVisible(false);
    }//GEN-LAST:event_pizzaActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
                if(table==null)
    {String[] header={"ID","Name","Price","Quantity"};
        table=new View(header);
        table.setTitle("View Orders");
    }
        String mydata[][] =TableData(table);
        setData(mydata,table.getJTable(),table.columns);
        table.setParentNode(this);
        this.setVisible(false);
        table.setVisible(true);


    }//GEN-LAST:event_viewActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
          this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerActionPerformed
        // TODO add your handling code here:
           DetailsWindow b=new DetailsWindow(3);
          b.setVisible(true);
        b.setParentNode(this);
        this.setVisible(false);
    }//GEN-LAST:event_burgerActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */

     @Override
    public Node getParentNode() {
        return n;
    }

    @Override
    public void setParentNode(Node node) {
        this.n=node;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton burger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pizza;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
