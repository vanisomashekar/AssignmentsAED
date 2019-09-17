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
public class Customer {

   
    private int customerId;
    List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
    
    

    
    
    public Customer(int customerId)
    {
        this.customerId=customerId;
        this.order = new ArrayList<>();
        
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    
 @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", order=" + order + '}';
    }
}
