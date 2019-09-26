/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;


/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Library extends Book {
private final String libName;
private final String libAddress;
private Book [] listOfBook;
Library(String libname,String libaddress){
    this.libAddress=libaddress;
    this.libName=libname;  
}

}
