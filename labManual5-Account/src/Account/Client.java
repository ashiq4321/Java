/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Client {
    //Attributes
   protected String ClientName;
   protected String ClientAge;
   protected String Address;
   
   //Constructor
   Client(){
   }
   Client(String Name,String Age,String address){
   this.ClientName=Name;
   this.ClientAge=Age;
   this.ClientName=Address;
           
   }
  protected void Showinfo(){
   System.out.println("Name :"+this.ClientName);
   System.out.println("Age :"+this.ClientAge);
   System.out.println("Address :"+this.Address);
   }
}
