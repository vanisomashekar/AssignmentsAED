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
public class SalesPerson {
    private int salesPerson_Id;
      List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
    
    public SalesPerson(int salesPerson_Id)
    {
        this.salesPerson_Id=salesPerson_Id;
        this.order=new ArrayList<>();
    }

    public int getSales_Id() {
        return salesPerson_Id;
    }

    public void setSales_Id(int salesPerson_Id) {
        this.salesPerson_Id = salesPerson_Id;
    }

  
    
}
