/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsscheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventsInfoFrame frame = new EventsInfoFrame();
        frame.setVisible(true);
        frame.setLocation(300, 100);
        DbConnection connect =new DbConnection();
        connect.getNotification();
        
    }    
}
