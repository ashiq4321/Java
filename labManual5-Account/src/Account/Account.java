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
public class Account extends Client{
    protected String acctype,acid;
    protected double balance;
    protected int duration;
    protected int percentage;
    Account(){
    }
    Account(String HolderName,String HolderAge,String Holderaddress,String type,String id, double bal){
        this.acctype=type;
        this.acid=id;
        this.balance=bal;
        this.ClientName=HolderName;
        this.ClientAge=HolderAge;
        this.Address=Holderaddress;
        
    }
    protected void AccountHolderInfo(){
    Showinfo();
    System.out.println("Accout Type: "+this.acctype);
    System.out.println("Accout No :"+this.acid);
    System.out.println("Current Balance : "+this.balance);
    }
    protected void deposit(int amount){
    this.balance=this.balance+amount;
    System.out.println("--Deposit--");
    System.out.println("Amount : "+amount);
    System.out.println("A/c No: "+this.acid);
    System.out.println("Current Balance "+this.balance);
    }
    protected void withdraw(int amount){
    this.balance=this.balance-amount;
    System.out.println("--Deposit--");
    System.out.println("Amount : "+amount);
    System.out.println("A/c No: "+this.acid);
    System.out.println("Current Balance "+this.balance);
    }
    protected double profit(int percent,int dura){
    this.duration=dura;
    this.percentage=percent;
    return this.balance*dura*(100/percent);
    }
    
}
