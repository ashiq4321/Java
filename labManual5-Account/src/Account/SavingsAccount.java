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
public class SavingsAccount extends Account {
    
}
    profit(int percent,int dura){
    this.duration=dura;
    this.percentage=percent;
    return this.balance*dura*(100/percent);
    }
