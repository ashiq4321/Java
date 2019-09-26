/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Account {
    private String accName,acid;
    private double balance;
    Account(){
    }
    Account(String name,String id, double bal){
        this.accName=name;
        this.acid=id;
        this.balance=bal;
    }
    public void showinfo(){
    System.out.println(this.accName+" "+this.acid+" "+this.balance);  
    }
    public void deposit(double amount){
    this.balance=this.balance+amount;
    System.out.println("after deposit "+amount);
    }
    public void withdraw(double amount){
    this.balance=this.balance-amount;
    System.out.println("after withdraw "+amount);
    }
    public void transfer(double amount,Account receiver){
    receiver.deposit(amount);
    this.balance=this.balance-amount;
    }
}
    
  

