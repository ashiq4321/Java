/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Mobile {
private String mobileOwnerName;
private String mobileNumber;
private double mobileBalance;
private String mobileOSName;
private boolean lock  ;

Mobile(){
}
Mobile(String OwnerName,String mobilenumber,double mobilebalance,String OSName,boolean lock){
    this.lock=lock;
    this.mobileBalance=mobilebalance;
    this.mobileNumber=mobilenumber;
    this.mobileOSName=OSName;
    this.mobileOwnerName=OwnerName;
}
public void showInfo(){
    System.out.println("----Contact Information----");
    System.out.println("Mobile Owner Name : "+this.mobileOwnerName);
    System.out.println("Mobile Number : "+this.mobileNumber);
    System.out.println("Mobile Balance : "+this.mobileBalance);
    System.out.println(" Operating System Name : "+this.mobileOSName);
    if(this.lock==true){
    System.out.println("Phone is lock");
    }
    else {
     System.out.println("Phone is unlock");     
    }
    }
public void recharge(int amount){
this.mobileBalance+=amount;
System.out.println(amount +" taka has been recharged ");
System.out.println("Total balance is : "+this.mobileBalance );

}
public void callSomeone(int timeDuration){
if(this.lock==false){
    System.out.println(" Calling... ");
    System.out.println("Call Duration : "+timeDuration);
    System.out.println(timeDuration +" taka has been deducted ");
    this.mobileBalance=this.mobileBalance-timeDuration;
    System.out.println("Current Balance is : "+this.mobileBalance);
}
else{
System.out.println("Phone is locked! Please Unlock it. ");
}
}
public void unlock (){
this.lock=false;
System.out.println("Phone unlocked!");
}
    
}

