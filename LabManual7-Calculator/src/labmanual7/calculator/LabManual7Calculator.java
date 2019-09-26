/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class LabManual7Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b;
        String operation;
        Scanner scan=new Scanner(System.in);
        Calculator C1 =new Calculator();
        try{
        System.out.print("Enter 1st value: ");
        a=scan.nextDouble();
        System.out.print("Enter 2nd value: ");
        b=scan.nextDouble();
        System.out.println("for Summation enter : 'sum' ");
        System.out.println("for Substraction enter : 'sub' ");
        System.out.println("for Multiplication enter : 'mul' ");
        System.out.println("for Division enter : 'div' ");
        System.out.print("Enter which operation you want to execute : ");
        operation=scan.next();
        switch(operation){
            case "sum" :System.out.println("Summation : "+C1.add(a, b));
                break;
            case "sub" :System.out.println("Substraction : "+C1.sub(a, b));
                break;
            case "mul" :System.out.println("Multiplication : "+C1.mul(a, b));
                break;
            case "div" :C1.div(a,b);
                break;
           default:
             System.out.println("operation doesn't exist ");  
                
        }
        }
        catch(InputMismatchException iex){
        System.out.println("input Mismatch caught: Check your data");
        }

    }
    }
    
