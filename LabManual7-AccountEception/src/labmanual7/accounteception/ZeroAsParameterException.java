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
public class ZeroAsParameterException extends Exception  {
    ZeroAsParameterException(){
    System.out.println("Message: '0' cannot be a parameter");
    }
    
}
