/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book b1=new Book("OOP1","Ashiq","17-33719-1","Java programming",5);
        b1.addBookCopy(3);
        b1.showInfo();
        Book b2=new Book();
        b2.setname("OOP2");
        b2.setauthor("Chowa");
        b2.setid("17-33743-1");
        b2.settype("Operating System");
        b2.setcopy(8);
        b2.showInfo();
        Book.showTotalBookInfi();
    }
    
}
