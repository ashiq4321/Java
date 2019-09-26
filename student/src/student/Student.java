/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stud s1=new stud("Chowa","17-33743-1","CSE",3.95);
        s1.showinfo();
        stud s2=new stud();
        s2.setname("Ashiq");
        s2.setid("17-33719-1");
        s2.setdept("CSE");
        s2.setcgpa(3.88);
        s2.showinfo();
        stud s3=new stud();
        s3.setname("murad ");
        s3.setid("17-34924-2 ");
        s3.setdept("CSE ");
        s3.setcgpa(2.94);
        System.out.println(s3.getname()+s3.getid()+s3.getdept()+s3.getcgpa());
        
        
    }
    
}
