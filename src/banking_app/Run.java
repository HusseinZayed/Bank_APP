/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

/**
 *
 * @author hussein
 */

import static java.lang.System.out;
import java.util.Scanner;
public class Run {
    int choose,age;
    String user,pass,name,city;
    User_Password ob = new User_Password();
    
    Scanner input = new Scanner(System.in);
    public void start(){
        
                
        out.println(" ************** welcome in HR Bank ****************\n\n");
        out.println(" 1 : i am employee ");
        out.println(" 2 : i am customer\n ");
        out.print(" enter your choose ");
        choose=input.nextInt();
        out.println(" \n*****************************************************");
    }
    public void choose(){
        switch(choose){
            case 1:
                System.out.print(" enter username  :");
                user = input.next();
                System.out.print(" enter password  :");
                pass = input.next();
                
                if(ob.checkEmployee(user, pass)){
                    
                    out.println("                welcome "+ user +"\n ");
                    out.println(" *****************************************************");
                    out.print(" enter your name : ");
                    name = input.next();
                    out.print(" enter your city  : ");
                    city = input.next();
                    out.print(" enter your age  : ");
                    age = input.nextInt();
                    Employee ob1 = new Employee(name,city,age);
                    out.println(" 1) get on your data ");
                    out.println(" 2) get on sum Amount bank ");
                    
                    int ch=input.nextInt();
                      switch(ch){
                          case 1:
                             ob1.printData();
                           break;
                          
                          case 2:
                              ob1.calculcate_All_Amount();
                              break;
                          default:
                         out.println(" wrong answer ");
                         start();
                         choose();
                         break;
                      }
                }
                else{
                    out.println(" sory you not registar in employees ");
                    start();
                    choose();
                }
                break;
              
            case 2:
                out.println(" 1) new customer ");
                out.println(" 2) current customer ");
                out.print(" enter your choose");
                int c= input.nextInt();
                
                if(c==2){
              
                System.out.println(" enter password  : ");
                pass = input.next();
                if(ob.checkCustomer(pass)){
                    
                    
                    out.println(" enter your name : ");
                    name = input.next();
                    out.println("                welcome "+ name +"\n ");
                    out.println(" *****************************************************");
                    out.println(" enter your city  : ");
                    city = input.next();
                    out.println(" enter your age  : \n\n");
                    age = input.nextInt();
                    Customer ob1 = new Customer(name,city,age);
                    out.println(" 1) get on your data ");
                    out.println(" 2) get on check ");
                    out.println(" 3) depoist ");
                    out.println(" 4) withdraw ");
                    
                    int ch=input.nextInt();
                      switch(ch){
                          case 1:
                             ob1.printData();
                           break;
                          case 2:
                              ob1.check();
                              break;
                          case 3:
                              out.println("enter amount ");
                              int am=input.nextInt();
                              ob1.setAmount(am);
                              ob1.depoist();
                              break;
                          case 4:
                              out.println("enter amount ");
                              int am1=input.nextInt();
                              ob1.setAmount(am1);
                              ob1.withDraw();
                              break;
                          default:
                         out.println(" wrong answer ");
                         choose();
                         break;
                      }
                }
                else{
                    out.println(" sory you not registar in employees ");
                    choose();
                }
                
        }
                else if(c==1){
                    while(true){
                    out.print("\n choose your password : ");
                    String pass = input.next();
                    if(ob.UP_Customer.contains(pass)){
                         out.print(" please choose other password : ");
                    }
                    else
                        break; }
                    out.print("\n enter your name : ");
                    name = input.next();
                    out.print(" enter your city   : ");
                    city = input.next();
                    out.print(" enter your age  : ");
                    age = input.nextInt();
                    Customer ob1 = new Customer(name,city,age);
                    out.println(" 1) get on your data ");
                    out.println(" 2) depoist ");
                    
                    
                    int ch=input.nextInt();
                      switch(ch){
                          case 1:
                             ob1.printData();
                           break;
                          case 2:
                              out.println("enter amount ");
                              int am=input.nextInt();
                              ob1.setAmount(am);
                              ob1.depoist();
                              break;
                         
                          default:
                         out.println(" wrong answer ");
                         
                         choose();
                         break;
                        }
                }
                else{
                    out.println(" wrong answer \n");
                    choose();
                }
        break;
            default:
             out.println(" wrong answer \n");
                    choose();
              break;
    }
       
  
    
   
}}
