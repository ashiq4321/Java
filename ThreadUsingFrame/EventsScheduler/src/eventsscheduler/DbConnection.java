/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsscheduler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
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
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/eventsinfo","root","");
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
            String query = "select EventsId, EventsName,Date,Time,Description from eventsinformation;";
            //Step-3: Execute SQL query
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
        return rs;
    }

    public void printDataInConsole(ResultSet rs) {
        try {
            while (rs.next()) {
                String id = rs.getString("EventsId");
                String name = rs.getString("EventsName");
                String date= rs.getString("Date");
                String time=rs.getString("Time");                
                String desc = rs.getString("Description");
                System.out.println("\nEvents Id: " + id + "\n"
                        + "Events Name: " + name + "\n"
                        + "Date: " + date + "\n"
                        + "Time : " + time + "\n"                       
                        + "Description: " + desc);
            }//end of while
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
    
    public void insertIntoDB(ArrayList row) {
        try {
            String query = "insert into eventsinformation(EventsId, EventsName,Date,Time,Description) values('" +
               row.get(0) + "','" + row.get(1) + "','" + row.get(2) +"','"+ row.get(3) +"','"+ row.get(4) +"');";
            System.out.println(query);
            //Step-3: Execute SQL query
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Event Info Added Successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Insert into Database Exception: " + e);
            System.out.println(e);
        }
         
    }
        public void DeleteFromDb(String S){
                try {
            String query = "DELETE FROM`eventsinformation` WHERE `EventsId`="+S+";";
            //Step-3: Execute SQL query
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, " row deleted Successfully From your database.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deletion From Database Exception: " + e);
            System.out.println(e);
        }
    }
              

 public void getNotification(){
          boolean b=true;
          String id="";
          while(b){           
        try{
            String query="select * from eventsinformation";
            rs=st.executeQuery(query);
            while(rs.next()){
        DateFormat D = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat t = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
        Date time = new Date(); 
                if(rs.getString("Date").equals(D.format(date))){
        if(rs.getString("Time").equals(t.format(time))){
            String query2="SELECT EventsId,EventsName,Description FROM `eventsinformation`";
            rs=st.executeQuery(query2);
            String name="";
            String desc="";
            while(rs.next()){
                id=rs.getString("EventsId");
                name= rs.getString("EventsName");
                desc= rs.getString("Description");
            }
            JOptionPane.showMessageDialog(null, "Do the job :"+"\n"
            +"Name: "+name+"\n"
            +"Description: "+desc+"\n"); 
         DeleteFromDb(id);   
    }
        }
            }
   
    }
       
        catch(Exception ex){           
            System.out.println(ex);            
        }       
 }
 }
          }
 
    


