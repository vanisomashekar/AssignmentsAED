/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class Order {
    int orderId;
    int salesPerson_Id;
    int customerId;
    
    Item i;
//    List<Item> item;
//    public List<Item> getItem() {
//        return item;
//    }
//
//    public void setItem(List<Item> item) {
//        this.item = item;
//    }

    public int getSalesPerson_Id() {
        return salesPerson_Id;
    }

    public void setSalesPerson_Id(int salesPerson_Id) {
        this.salesPerson_Id = salesPerson_Id;
    }

    public Item getI() {
        return i;
    }

    public void setI(Item i) {
        this.i = i;
    }

    public Order(int orderId, int salesPerson_Id, int customerId,Item i ) {
        this.orderId = orderId;
        this.salesPerson_Id = salesPerson_Id;
        this.customerId = customerId;
        this.i=i;

    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getsalesPerson_Id() {
        return salesPerson_Id;
    }

    public void setsalesPerson_Id(int salesPerson_Id) {
        this.salesPerson_Id = salesPerson_Id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

 @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", salesPerson_Id=" + salesPerson_Id + ", customerId=" + customerId + ", i=" + i + '}';
    }
}
