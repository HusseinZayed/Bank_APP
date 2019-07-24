/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import static java.lang.System.out;
import java.util.Iterator;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;


/**
 *
 * @author hussein
 */
public class Employee extends Common {
     private int age;
     long sum=0;
     private String User,password;
     User_Password ob = new User_Password();
     public Employee (String name, String city ,int age){
        this.name = name;
        this.city = city;
        this.age = age ;
    }
     @Override
     public void printData(){
        System.out.println("employee name is "+ name);
        System.out.println("employee city is "+ city);
        System.out.println("employee age is "+ age);
        date();
    }
    public void calculcate_All_Amount(){
        
        for (Map.Entry<String, Integer> entry : ob.amountData.entrySet()) {
		    sum += entry.getValue();
		}
         
         System.out.println( "sum amount in bank is : "+ sum);
                 }
    public void printCustomer(){
        
        for (Map.Entry<String, Integer> entry : ob.amountData.entrySet()) {
		    System.out.print("name : "+entry.getKey()+" amount : "+entry.getValue()+"  ");
		}
    }
      
     
     
     
}
