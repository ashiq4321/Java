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
public class stud {
   private String name;
   private String id;
   private String department;
   private double cgpa;
   stud(){
   }
   stud(String nm,String id,String dept,double cg){
       this.name=nm;
       this.id=id;
       this.department=dept;
       this.cgpa=cg;   
   }
   void showinfo(){
   System.out.println(this.name+" "+this.id+" "+this.department+" "+this.cgpa);
   }
   void setname(String nm){
       this.name=nm;
   }
   void setid(String id){
       this.id=id;
   }
   void setdept(String dept){
       this.department=dept;
   }
   void setcgpa(double cg){
       this.cgpa=cg;
   }
   String getname(){
   return name;
   }
   String getid(){
   return id;
   }
   String getdept(){
   return department;
   }
   double getcgpa(){
   return cgpa;
   }
    
}
