/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Item {
    
    int orderId;
    int productId;
    int salesPrice;
    int quantity;

    public Item(int productId, int salesPrice, int quantity) {
      // this.orderId=orderId;
        this.productId = productId;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }
  
    
//    public int getItemId() {
//        return itemId;
//    }
//
//    public void setItemId(int itemId) {
//        this.itemId = itemId;
//    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
  

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
