/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.util.Date;

/**
 *
 * @author hussein
 */
public abstract class Common {
   
     public String name,city;
     
     public void printData(){
         System.out.println(" welcome in your bank");
     }
    public void date(){
        try{
        Date D = new Date();
        String date = String.format("Date is %tD",D);
        String time = String.format("Time is %tr",D);
        
        System.out.println(date); 
        System.out.println(time);  
        
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
}
