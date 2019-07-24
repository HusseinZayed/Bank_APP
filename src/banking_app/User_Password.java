/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hussein
 */
public class User_Password {
    Set<String> UP_Customer= new HashSet<String>();
    Map<String,Integer> amountData = new HashMap<String,Integer>();
    
    
    
    boolean checkEmployee(String user, String pass){
       
        
		    if(pass.equals("admin")&&user.equals("admin"))
                        return true;
		
                    return false;
    }
    
    boolean checkCustomer( String pass){
      if(UP_Customer.contains(pass))
          return true;
      else
          return false;
       
    }
    
   
	
}
