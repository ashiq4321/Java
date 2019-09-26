/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadusingframe;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class CounterB implements Runnable{
    boolean running = true;
    String output ="";
 public void run(){
    decrement();
}
public void decrement(){
    for(int c =1000 ;c>=0;c--){
        if(running ==true){
        output="CounterA : increment()"+c+"\n"+output;
        System.out.println("CounterB: decrement() "+c);
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            System.out.println("Decrement Exception "+e);
        }
        }
        else{
        break;
        }
    }
}
public void stopdecrement(){
this.running=false;
}
public String getoutput(){
return output;
}
}
