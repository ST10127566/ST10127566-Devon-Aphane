/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mykhanban;

/**
 *
 * @author ST10127566
 */
public class khanban {
    
    
    private String ActivityName= null;
    
    private int ActivityNum=0;
    
    private String ActivityStatus=null;
    
    private String developer= null;
    
    private String ActivityDescription= null;
    
    private Double ActivityDuration= null;
    
    
    public Class(
            String ActivityName, int ActivityNum, 
            String developer, double Duration,String ActivityDescription,
            String ActivityStatus){
        
        this.ActivityName= ActivityName;
        this.ActivityNum=ActivityNum;
        this.ActivityStatus=ActivityStatus;
        this.developer=developer;
        this.ActivityDuration=Duration;
        this.ActivityDescription=ActivityDescription;
        
    }
    //aah mam uyabona nawe eish ziyakhala
    
     ActivityClass(
            String ActivityName, int  ActivityNum, 
            String developer, double Duration,String ActivityDescription,
            String ActivityStatus){
        
        this.ActivityName= ActivityName;
        this.ActivityNum=ActivityNum;
        this.ActivityStatus=ActivityStatus;
        this.developer=developer;
        this.ActivityDuration=Duration;
        this.ActivityDescription=ActivityDescription;
        
     }
     
    boolean checkActivityDescription(){
        boolean greaterThan= false;
        
        if(ActivityDescription.length()>20){
            greaterThan=true;
    }
    return greaterThan;
    }
    private String createActivityId(){
    
    this.ActivityId=(this. ActivityName.substring(1,2)+ ":"+ this. ActivityNum
            + ":"+ this.developer.substring(this. developer.length() -3))
            .toUpperCase();
    
    return ActivityId;
    }
    
    public String PrintActivityDetails(){
        
        String ActivityDetails= "";
        ActivityDetails= "Activity Status: "+ this.ActivityStatus+
                "\n developer: "+ this.developer+ "\n Activity Num: "+ 
                this.ActivityNum+ "\n Activity Name: "+ this.ActivityName+
                "\n Activity Description: "+ this.ActivityDescription+
                "\n Activity Id: "+ createActivityId()+
                "\n Duration: "+ this.ActivityDuration;
        
        return ActivityDetails;
                
    }
    
    public int returnTotalDuration(){
        int totalHours=0;
    

    TotalDuration+=(int) this.ActivityDuration;
    
    return TotalDuration;
}
    

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

