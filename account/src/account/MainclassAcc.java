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
public class MainclassAcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc1=new Account("Shihan", "17-33333-1",5000);
        acc1.showinfo();
        acc1.deposit(1000);
        acc1.showinfo();
        acc1.withdraw(3000);
        acc1.showinfo();
        Account acc2=new Account("Ashiq", "17-33719-1",10000);
        
        acc1.showinfo();
        acc2.showinfo();
        acc2.transfer(5000, acc1);
        acc1.showinfo();
        acc2.showinfo();
        
        
        
    }
    
}
