/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

/**
 *
 * @author wizar
 */
public class LessonWithRentalDemo {
    
   public static final int minPerHour = 60;
   public static final double rate = 40.00;
   
   private String contractNumb;
   private int rentalHours;
   private int additionalMinutes;
   private double totalRentalPrice;
   private long phNumb;
   boolean lesson;
   int equipment;
   double basePrice;
   
   //Constructors

    public LessonWithRentalDemo(String contractNumb, int time, int equipment) {
        // recieves contract number and minutes and passes them to their respective methods
        // references equpment number to equipment array
        // if equipment returns jet ski or pontoon set lesson = true, all others false
        // prompt for lesson or no lesson
        // calculate totalRentalPrice from basePrice and Equipment Fees
    }
   
    public String getInstructor(){
        String instructor = "Bob";
        // generate a string the include equipment, "lesson required" and an instructor name
        return instructor;
    }
   
   

   
   // SETTERS
   public void setContractNumb(String contractNumb) {
        this.contractNumb = contractNumb;
    }
   
   public void setHoursAndMinutes(int time){
       this.rentalHours = time / 60;
       this.additionalMinutes = time % 60;
       this.basePrice = (this.rentalHours * 40) + (this.additionalMinutes * 1);
   }
   
   public void setPhoneNumber(String phNumb){
       // convert string phone number to a long phone number
       // if user enters less than 10 digits default to 0000000000
   }
   
   //GETTERS

    public String getContractNumb() {
        return contractNumb;
    }

    public int getRentalHours() {
        return rentalHours;
    }

    public int getAdditionalMinutes() {
        return additionalMinutes;
    }

    public double getTotalRentalPrice() {
        return totalRentalPrice;
    }
    
    public String getPhoneNumber(long phNumb){
        // recieve long phone number and convert to String
        // format  (xxx) xxx-xxxx
        String phoneNumber = "(111) 111-1111";
        return phoneNumber;
    }
   
   
   
   
   
    
}
