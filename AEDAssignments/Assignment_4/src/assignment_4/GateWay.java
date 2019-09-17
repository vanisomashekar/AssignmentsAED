/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;
        
     public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    
     public static void main(String[] args) throws IOException {     
        GateWay inst = new GateWay();
       inst.readData();
    }
    
      private void readData() throws IOException{
        String[] row;
        while((row = orderReader.getNextRow()) != null ){
           generateOrder(row);
        }
        
        while((row=productReader.getNextRow())!=null)
        {
            generateProduct(row);
        }
        
        runAnalysis();
    }
      
       private void generateProduct(String[] row){
        int productId = Integer.parseInt(row[0]);
        Product p = new Product(productId, Integer.parseInt(row[1]), Integer.parseInt(row[2]),Integer.parseInt(row[3]));
        DataStore.getInstance().getProduct().put(productId,p);
    }
 
    
    
       
     private void generateOrder(String[] row){  
        
         int orderId = Integer.parseInt(row[0]);
         int salesPersonId= Integer.parseInt(row[4]);
         int customerId = Integer.parseInt(row[5]);
         int quantity = Integer.parseInt(row[3]);
         int productId = Integer.parseInt(row[2]);
         int itemId = Integer.parseInt(row[1]);
         int salesPrice=Integer.parseInt(row[6]);
         
         Item item = new Item(productId, salesPrice, quantity);
        DataStore.getInstance().getItem().put(itemId, item);
        
        Order o = new Order(orderId, salesPersonId, customerId, item);
        DataStore.getInstance().getOrder().put(orderId, o);
          Item i = new Item(productId, salesPrice,quantity);
          
          Map<Integer,Customer> customers = DataStore.getInstance().getCustomers();
        if(customers.containsKey(customerId))
        {
            customers.get(customerId).getOrder().add(o);
        }
        else
        {
            Customer c = new Customer(customerId);
            customers.put(customerId, c);
            customers.get(customerId).getOrder().add(o);
        }
        
        Map<Integer,SalesPerson> salesPerson = DataStore.getInstance().getSalesPerson();
        if(salesPerson.containsKey(salesPersonId))
        {
            salesPerson.get(salesPersonId).getOrder().add(o);
        }
        else
        {
            SalesPerson s = new SalesPerson(salesPersonId);
            salesPerson.put(salesPersonId, s);
            salesPerson.get(salesPersonId).getOrder().add(o);
        }
             
         

          }
      private void runAnalysis()  throws java.io.IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String ch;
          do{
          System.out.println("\nPress 1 to get top 3 most popular product sorted from high to low");
        System.out.println("Press 2 to get Our 3 best customers ");
        System.out.println("press 3 to get Our top 3 best sales people");
         System.out.println("press 4 to get Our total revenue for the year");
         System.out.println("press 5 to EXIT");
         
           
               ch = br.readLine();
                switch (ch)
                {
                    
                case "1":{
                  
                    helper.top3BestProducts();
                   break;
                }
                case "2":{
                  
                    helper.topThreeCustomers();
                   break;
                }
                case "3":{
                  
                    helper.topThreeSalesPerson();
                   break;
                }
                case "4":{
                  
                    helper.TotalRevenueForTheYear();
                   break;
                }
                default:
                {
                        break;
                        }
     
       
    }
     
          }
            while (!ch.equals("5"));
         
      }
       
    }
     
    
         
     
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
        
       
        
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
//        DataReader orderReader = new DataReader(generator.getOrderFilePath());
//        String[] orderRow;
//        printRow(orderReader.getFileHeader());
//        while((orderRow = orderReader.getNextRow()) != null){
//            printRow(orderRow);
//        }
//        System.out.println("_____________________________________________________________");
//        DataReader productReader = new DataReader(generator.getProductCataloguePath());
//        String[] prodRow;
//        printRow(productReader.getFileHeader());
//        while((prodRow = productReader.getNextRow()) != null){
//            printRow(prodRow);
//        }
//    }
//    
//    public static void printRow(String[] row){
//        for (String row1 : row) {
//            System.out.print(row1 + ", ");
//        }
//        System.out.println("");
        
        
    
    

