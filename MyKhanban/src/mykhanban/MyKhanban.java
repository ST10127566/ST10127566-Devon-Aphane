/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mykhanban;
import java.util. *;
import javax. swing.JOptionPane;

/**
 *
 * @author ST10127566
 */
public class MyKhanban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
    JOptionPane. showMessageDialog(null, "Welcome to My Khanban");
    JOptionPane.showInputDialog(null, "Please select activity \n"
            + "1). Add activities \n"
            + "2). Show reports \n"
            + "3). Exit \n");
    
    
    
    int howManyTime=Integer.parseInt(JOptionPane.showInputDialog("Please enter "
            + "the amount of activities you want to add"));
    
    for (int i=0; i<=howManyTime;i++){
        
        String ActivityName= JOptionPane.showInputDialog("Enter your activity "
                + "name");
        String ActivityDescription= JOptionPane.showInputDialog("Describe your"
                + " activity");
        String developer= JOptionPane.showInputDialog("Enter developer"
                + " details");
        double ActivityDuration= Double.parseDouble(JOptionPane.showInputDialog
                +"enter activity duration");
        
        String activityStatus=JOptionPane.showInputDialog("Enter activity"
                + " status");
        
ActivityClass activity= new ActivityClass(ActivityName, i+1, ActivityDescription,
        developer, ActivityDuration);
        
        JOptionPane.showMessageDialog(null, Activity. printDeatails);
    } 
    
            
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
