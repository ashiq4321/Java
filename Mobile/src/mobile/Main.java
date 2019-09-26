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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobile M1=new Mobile("Ashiq","01670464084",50,"Android",true);
        M1.showInfo();
        M1.recharge(50);
        M1.callSomeone(20);
        M1.unlock();
        M1.callSomeone(20);
    }
    
}
