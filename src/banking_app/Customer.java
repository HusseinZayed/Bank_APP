/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author hussein
 */
public class Customer extends Common implements InterfaceCustomer{
    private int amount=0,age,setAmount;
    private String User,password;
     
    public Customer (String name, String city ,int age){
        this.name = name;
        this.city = city;
        this.age = age ;
    }
    public void setAmount(int amount){
        setAmount = amount;
    }
    public int getAmount(){
        return setAmount;
    }
     
   
    @Override
    public void printData(){
        System.out.println("your name is "+ name);
        System.out.println("your city is "+ city);
        System.out.println("your age is "+ age);
        date();
    }
    @Override
    public void withDraw(){
        int amount = getAmount();
        try{
        if(amount<=this.amount){
            this.amount -= amount;  
            User_Password ob = new User_Password();
            ob.amountData.put(name, amount);
        }
        else{
            System.out.println("your account not have tis amount ");
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    @Override
    public void depoist(){
        int amount = getAmount();
        if(amount>0){
            this.amount += amount;
            User_Password ob = new User_Password();
            ob.amountData.put(name, amount);
        }
        else{
             System.out.println("please  ");
        }
    }
    @Override
    public void check(){
        System.out.println("blance is  "+ amount +" pound");
        date();
    }
    
}
