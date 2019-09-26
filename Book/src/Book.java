/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Book {
private String bookName;
private String bookAuthor;
private String bookId;
private String bookType;
private int bookCopy;
static int bookCounter=0;
static void showTotalBookInfi() {
    System.out.println("Number of book objects: "+bookCounter);
    
}

Book(){
     bookCounter++;
}
public void setname(String name){
    this.bookName=name;
}
public void setauthor(String author){
    this.bookAuthor=author;
}
public void setid(String id){
    this.bookId=id;
}
public void settype(String type){
    this.bookType=type;
}
public void setcopy(int copy ){
    this.bookCopy=copy;
}
public String getname (){
return this.bookName;
}
public String getauthor (){
return this.bookAuthor;
}
public String getid (){
return this.bookId;
}
public String gettype (){
return this.bookType;
}
public int getcopy (){
return this.bookCopy;
}
Book(String name,String author,String id,String type,int copy){
this.bookAuthor=author;
this.bookCopy=copy;
this.bookId=id;
this.bookName=name;
this.bookType=type; 
bookCounter++;

}
public void showInfo(){
    System.out.println("Book information");
    System.out.println("---------------");
    System.out.println("Book Name : "+this.bookName);
    System.out.println("Book Author : "+this.bookAuthor);
    System.out.println("Book Id : "+this.bookId);
    System.out.println("Book type : "+this.bookType);
    System.out.println("Book copy : "+this.bookCopy);
}
void addBookCopy(int x){
this.bookCopy=this.bookCopy+x;
}


}
