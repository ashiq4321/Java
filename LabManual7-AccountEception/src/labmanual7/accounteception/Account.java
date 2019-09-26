/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7.accounteception;

import java.util.Scanner;



/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Account {
private String accName;
private String acid;
private int balance;
private int Amount;

Account(){
}
void setName(String name){
  this.accName=name;  
}
void setId(String id){
  this.acid=id;  
}
void setbalance(int balance){
  this.balance=balance;  
}
String getname(){
return this.accName;
}
String getId(){
return this.acid;
}
int getbalance(){
return this.balance;
}
Account(String name,String Id ,int Balance){
    this.accName=name;
    this.acid=Id;
    this.balance=Balance;
}
 void showinfo(){
     System.out.println("-----Account Information-----");
     System.out.println("Account Holder Name : "+this.accName);
     System.out.println("Account No : "+this.acid);
     System.out.println("Balance : "+this.balance);
 }
public void deposit(int amount){
    System.out.println("-----Deposit-----");
    System.out.println("Enter the amount you want to deposit to A/c "+this.acid);
    Scanner scan= new Scanner(System.in);
    amount=scan.nextInt();
    
    try{
        if(amount==0){
        throw new ZeroAsParameterException();   
        }
    else{
    System.out.println(amount +" taka has been diposited to A/C : " + this.acid);
    this.balance=this.balance+amount;
    System.out.println("Current Balance : " +this.balance);}
    }
    catch(ZeroAsParameterException e){
    }
}
public void withdraw(int amount){
    System.out.println("-----withdraw-----");
    System.out.println("Enter the amount you want to withdraw from A/c "+this.acid);
    Scanner scan= new Scanner(System.in);
    amount=scan.nextInt();
    
    try{
        if(amount==0){
        throw new ZeroAsParameterException();   
        }
        else if((this.balance-amount)<0){
        throw new NegativeResultException();
        }
    else{
    System.out.println(amount +" taka has been withdrawn to A/C : " + this.acid);
    this.balance=this.balance-amount;
    System.out.println("Current Balance : " +this.balance);
        }
    }
    catch(ZeroAsParameterException zape){
    }
    catch(NegativeResultException nre){}
}
 public void transfer(int amount, Account receiver){
    System.out.println("-----Transfer-----");   
    System.out.println("Enter the amount you want to transfer from A/C : " + this.acid+" TO A/C :"+receiver.acid);
    Scanner scan= new Scanner(System.in);
    amount=scan.nextInt();
    
    try{
        if(amount==0){
        throw new ZeroAsParameterException();   
        }
        else if((this.balance-amount)<0){
        throw new NegativeResultException();
        }
    else{
    System.out.println(amount +" taka has been transfer from A/C : " + this.acid+" TO A/C :"+receiver.acid);
    this.balance=this.balance-amount;
    receiver.balance=receiver.balance+amount;
        }
    }
    catch(ZeroAsParameterException e){
    }
    catch(NegativeResultException nre){}
   
}  
}
