/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Harshitha
 */
public class DataStore {
     private static DataStore dataStore;

  
     
     private Map<Integer, Customer> customers;
    private Map<Integer, Item> item;
    private Map<Integer, Order> order;
     private Map<Integer, Product> product;
    private Map<Integer, SalesPerson> salesPerson;
    
     
     public DataStore()
     {
        customers = new HashMap<>(); 
         item = new HashMap<>(); 
          order = new HashMap<>(); 
           product = new HashMap<>(); 
            salesPerson = new HashMap<>(); 
          
        
     }
     
     public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }
     
       public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Map<Integer, Item> getItem() {
        return item;
    }

    public void setItem(Map<Integer, Item> item) {
        this.item = item;
    }

    public Map<Integer, Order> getOrder() {
        return order;
    }

    public void setOrder(Map<Integer, Order> order) {
        this.order = order;
    }

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    public Map<Integer, SalesPerson> getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Map<Integer, SalesPerson> salesPerson) {
        this.salesPerson = salesPerson;
    }
    
}
