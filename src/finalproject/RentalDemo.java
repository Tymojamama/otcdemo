package finalproject;


/*
 @author tp0719561
 */

//import java.util.Scanner;

public class RentalDemo 
{

    

    
    public static void main(String[] args) 
    {
        int rentTime;
        double rentDue;
        
    Rental RentalObject = new Rental();
       
        logo();
        rentTime = RentalObject.rentTimeMethod();
      
        RentalObject.setHoursMinutes(rentTime);
        
       // RentalObject.rental(rentTime);
       
        RentalObject.getContractNumber();
       
       
       
       
    }
        //**********************************************************************
       
       public static void logo()
    {
    
         
        for(int i =0; i < 38; i++)
        {
       System.out.print("S");
        }
        
        System.out.println(""); 
        
        System.out.print("S");
        
        for(int i =0; i < 36; i++)
        {
       System.out.print(" ");
       
       //System.out.print("S");
        }
          System.out.println("S");
          
           System.out.println("S  Sammy's makes it fun in the Sun.  S");
           
          System.out.print("S");
        
        for(int i =0; i < 36; i++)
        {
       System.out.print(" ");
       
       //System.out.print("S");
        }
         System.out.println("S");
        
         for(int i =0; i < 38; i++)
        {
       System.out.print("S");
        }
        
        System.out.println(""); 
    }
       
        //**********************************************************************
        
        
         
}
