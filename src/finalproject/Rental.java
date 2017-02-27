
package finalproject;

import java.util.Scanner;

/*
 * @author tp0719561
 */
public class Rental 
{
public final static int minutesInHour = 60;
        
public final static int hourlyRate = 40;

private String contractNumber;
private int rentHours;
private int rentMinutes;
private double price;

    public void setContractNumber()
    {

        

    }
    
        public void setHoursMinutes(int time)
    {
        rentHours =  (int) (time /60);   
        rentMinutes = (time % 60);
        
               
       rental(time);
        
        rentMinutes = time;

    }
        
        public static String getContractNumber()
        {
         String number = "";
            
            
        return number;   
        }
                
        
        public static int getRentHours()
        {
        
            int hours = 0;
        
            return hours;
        }
        
                
        
        public static int getRentMinutes()
        {
            int minutes = 0;
        
            
            return minutes;
        }
                
                
        public static double getPrice()
        {
        
        double moneyPrice = 0.0;
        
        return moneyPrice;
        
        }
         public static int rentTimeMethod()
    {
  
        
          Scanner ScanObj = new Scanner(System.in);
    
        
        System.out.println("Please enter the number of minutes equipment was rented:");
        
        int rentTime =  ScanObj.nextInt();
        
        return rentTime;
    }   
    

    
    
    public void rental(int minutes)
    {
        int rentalPrice = (this.rentHours * 40) + (this.rentMinutes * 1);  
     System.out.println("The hours rented are: " + this.rentHours + "\n The extra minutes include: "+this.rentMinutes +"\n The rental price is: "+rentalPrice);
              
        //minutes
                
    }
        
        
}
