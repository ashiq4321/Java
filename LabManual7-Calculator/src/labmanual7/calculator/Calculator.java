/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7.calculator;



/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Calculator {
  private double x;
  private double y;
  private double exception;
  Calculator(){}
  Calculator(double value1,double value2){
  this.x=value1;
  this.y=value2;
  }

public double add(double x, double y){
    return x+y;
}
public double sub(double x, double y){
    return x-y;
}
public double mul(double x, double y){
    return x*y;
}
public double div(double x, double y){
    try{
            if(y==0){
              exception=(int)x /(int) y;
            }
            exception=x/y;
            System.out.println("division :"+exception);
            
    }
        catch(ArithmeticException e){
        System.out.println("Arithmatical exception caught: divided by zero");
        }
      return exception;


}
}
