/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Products;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Harshitha
 */
public class Product {

   
    private String name;
    private int ID;
    private String desc;
    private double price;
    private int quantity;
    //private Icon img;
    private ImageIcon image;
    private String type;
    private String supplierName;
    private String productType;
   // private BufferedImage image;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

//    public BufferedImage getImage() {
//        return image;
//    }
//
//    public void setImage(BufferedImage image) {
//        this.image = image;
//    }

   
    
    public Product(String name,int ID,String desc,double price,int quantity,String type,String supplierName,String productType)
    {
        this.name=name;
        this.ID=ID;
        this.desc=desc;
        this.price=price;
        this.quantity=quantity;
        this.type=type;
        this.supplierName=supplierName;
        this.productType=productType;
                
        
      // this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
 @Override
    public String toString() {
        return name ;
    }
   
     
    
    
}
