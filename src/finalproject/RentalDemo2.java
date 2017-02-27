/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

import java.util.Scanner;

/**
 *
 * @author wizar
 */
public class RentalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        //create an array of (8) LessonWithRentalDemo objects
        // provide a user option to sort the array in ascending order by contract number, price or equipment type
        
        // The following to input objects into the array
        String contract = contractNumber();
        int inputTime = rentalTime();
        System.out.println("Please enter contact phone number:");
        String phoneNumber = stdin.next();
        
        
        
        
    }
    
    
    public static String contractNumber(){
    //prompt for contract number and return to main
    // if input is not a string consisting of a letter and 3 numbers - force to "A000"
    // if letter is not capital, accept input and force to capital 
        String contractNum = "a";
        return contractNum;
        
        
}
    public static int rentalTime(){
        //prompt for time and return to main
        int time = 0;
        // if/else less than 60 or greater than 7200 keep prompting
        return time;
    }
    
    public static void companyLogo(){
        //display company logo and motto
    }
    
    public static void computeHoursMinutes(){
        //convert time from minutes to Hours/Minutes - display results
    }
}
