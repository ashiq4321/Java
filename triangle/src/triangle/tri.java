/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class tri {
    private int x,y,z;
    tri(){
    }
    tri(int a, int b, int c){
    this.x=a;
    this.y=b;
    this.z=c;
    }
    public void showinfo(){
    System.out.println("1st :"+this.x);
    System.out.println("2nd :"+this.y);
    System.out.println("3rd :"+this.z);
    }
    public void testtriangle(){
    if(this.x == this.y && this.x == this.z && this.y==this.z){
      System.out.println("The triangle is equlateral ");
    }
    else if(this.x==this.y || this.y==this.z || this.x==this.z) {
        System.out.println("The triangle is isosceles ");
    }
    else{
    System.out.println("The triangle is isosclene ");
    }
    }
    
}
