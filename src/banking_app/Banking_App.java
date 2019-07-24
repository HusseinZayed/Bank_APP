/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.util.Scanner;

/**
 *
 * @author hussein
 */
public class Banking_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
      Run r = new Run();
      while(true){
    
      r.start();
      r.choose();
      System.out.println("enter 0 to exit or 1 to continue");
      int ch=input.nextInt();
      if(ch==0)
          System.exit(0);
                  
    }
    }
}
