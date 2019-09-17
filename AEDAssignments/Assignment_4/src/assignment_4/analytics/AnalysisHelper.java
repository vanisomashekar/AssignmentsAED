/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;
import assignment_4.entities.Customer;
import java.util.*;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Harshitha
 */
public class AnalysisHelper {
    
    public void top3BestProducts()
    {
    Map<Integer,Integer> popularProduct = new HashMap<Integer,Integer>();
       Map<Integer,Item>  itm = DataStore.getInstance().getItem();
       Map<Integer,Product> product = DataStore.getInstance().getProduct();
       
       List<Item> itemList = new ArrayList<>(itm.values());
      
       
      // List<Integer> revenueVal=new ArrayList<>();       
       for (Item i : itemList)
       {    
                if(product.containsKey(i.getProductId()))
                        { 
                            int best=0;
                        
                            if(popularProduct.containsKey(i.getProductId()))
                                    {
                                    best=popularProduct.get(i.getProductId());
                                    }
                            
                            int cp=product.get(i.getProductId()).getMinPrice();
                            int sp=i.getSalesPrice();
                            int profit=sp-cp;
                            best= best + (profit * i.getQuantity());
                            popularProduct.put(i.getProductId(),best);

                         
                            
                            }
          
       }
      //  System.out.println("revenue list is"+ popularProduct);
     
      Set<Map.Entry<Integer, Integer>> set = popularProduct.entrySet();
      
    List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
    {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
            return(o2.getValue()).compareTo(o1.getValue());
        }
    } );
        

    System.out.println("\nTop 3 most Popular Products  : ");
      System.out.println("\n PRODUCTID : TotalNoOfRevenueGenerated  : ");
      for ( int i = 0 ; i < list.size() && i < 3 ; i ++)
      {
       System.out.println(list.get(i));
      }  
}
    
    public void topThreeCustomers(){
        Map<Integer,Integer> C = new HashMap<Integer,Integer>();
        Map<Integer,Order> order = DataStore.getDataStore().getOrder();
         Map<Integer,Item> Item = DataStore.getDataStore().getItem();
         
            for(Order o : order.values()){
               // for(Item i : o.getI().){
                   int ProductPrice = 0;
                   if(C.containsKey(o.getCustomerId()))
                       ProductPrice = C.get(o.getCustomerId());
                   ProductPrice+= o.getI().getQuantity()*o.getI().getSalesPrice();
                   C.put(o.getCustomerId(),ProductPrice);
                //}        
            }
        List<Entry> topThree = new ArrayList<Entry>(C.entrySet());
         Collections.sort(topThree, new Comparator<Entry>(){

             @Override
             public int compare(Entry t, Entry t1) {
                  int value1 = Integer.parseInt(t.getValue().toString());
                  int value2 = Integer.parseInt(t1.getValue().toString());
                 return value2 - value1;
             }
         
     });
         System.out.println("Top three Customer;");
         System.out.println("\n CUSTOMERID : TotalRevenueGenerated  : ");
         for(int i =0; i<3; i++){
             System.out.println(topThree.get(i));
         }
    }
    
    public void topThreeSalesPerson(){
        Map<Integer,Integer> S = new HashMap<Integer,Integer>();
        Map<Integer,Order> order = DataStore.getDataStore().getOrder();
        
        for(Order o : order.values()){
            //for(Item i : o.getItem()){
                int ProductPrice = 0;
                if(S.containsKey(o.getsalesPerson_Id()))
                    ProductPrice = S.get(o.getsalesPerson_Id());
                ProductPrice+= o.getI().getQuantity() * o.getI().getSalesPrice();
                S.put(o.getsalesPerson_Id(), ProductPrice);
           // }
        }
        List<Entry> topThree = new ArrayList<Entry>(S.entrySet());
        Collections.sort(topThree,new Comparator<Entry>(){

            @Override
            public int compare(Entry t, Entry t1) {
                int value1 = Integer.parseInt(t.getValue().toString());
                int value2 = Integer.parseInt(t.getValue().toString());
                return value2-value1;
            }
            
        });
        
        System.out.println("Top Three SalesPerson");
        System.out.println("\n SALESPERSONID : TotalNoOfRevenueGenerated : ");
        for(int i=0;i<3;i++){
            System.out.println(topThree.get(i));
        }
    }

    
    
    public void TotalRevenueForTheYear() {
        Map<Integer, Item> items = DataStore.getInstance().getItem();
        Map<Integer, Product> products = DataStore.getInstance().getProduct();
        List<Item> itemsList = new ArrayList<>(items.values());
        List<Product> productList = new ArrayList<>(products.values());
        int totalRevenue = 0;
        for (Item item : itemsList) {
            for (Product product : productList) {
                if (item.getProductId() == product.getProductId()) {
                    totalRevenue += item.getQuantity() * (item.getSalesPrice() - product.getMinPrice());
                    break;
                }
            }
        }
        System.out.println("\nTotal Revenue For The Year is " + totalRevenue);
    
    
}

}