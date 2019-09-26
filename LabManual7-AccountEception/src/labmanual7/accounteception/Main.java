/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7.accounteception;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account A1 =new Account("Ashiq","123456789",5000);
        Account A2 =new Account("Chowa","987654321",4000);
        A1.deposit(1);
        A2.withdraw(1);
        A1.transfer(1, A2);
        A2.showinfo();
        }   
     
    }
    