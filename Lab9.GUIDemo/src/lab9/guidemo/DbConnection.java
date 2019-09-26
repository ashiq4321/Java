/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.guidemo;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class DbConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DbConnection(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        //step1 : get connection to Db
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentinfo","root","");
        System.out.println("DB Connection Successful");
        //step-2: Create a statement
        st=con.createStatement();
    }
    catch(Exception e){
        System.out.println("Error: "+e);
        e.printStackTrace();
    }
    }
    public DbConnection(String url, String user, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Step-1: get a connection to the db
            con = DriverManager.getConnection(url, user, password);
            //Step-2: create a statement
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
  
    public ResultSet getResultSet() {
        try {
            String query = "select Id, Name, Department, Major from studentinfo;";
            //Step-3: Execute SQL query
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
        return rs;
    }

    public void printDataInConole(ResultSet rs) {
        try {
            while (rs.next()) {
                String id = rs.getString("Id");
                String name = rs.getString("Name");
                float dept = rs.getFloat("Department");
                String prog = rs.getString("Major");
                System.out.println("\nStudent Id: " + id + "\n"
                        + "Name: " + name + "\n"
                        + "Department: " + dept
                        + "Major: " + prog);
            }//end of while
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
    
    public void insertIntoDB(ArrayList row) {
        try {
            String query = "insert into studentinfo(Id, Name, Department, Major) values('" +
                    row.get(0) + "','" + row.get(1) + "','" + row.get(2) +"','"+ row.get(3)+"');";
            System.out.println(query);
            //Step-3: Execute SQL query
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Student Info Added Successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Insert into Database Exception: " + e);
            System.out.println(e);
        }
         
    }

    public void DeleteFromDb(String S){
                try {
            String query = "DELETE FROM `studentinfo` WHERE `Id` ="+S+";";
            System.out.println(query);
            //Step-3: Execute SQL query
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "selected  row deleted Successfully From your database.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deletion From Database Exception: " + e);
            System.out.println(e);
        }
    }
    
}
