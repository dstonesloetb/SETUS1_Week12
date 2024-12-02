package com.mycompany.s1_iterationexamples;

import java.util.Scanner;

public class WhileLoopExamples {

    public static void main(String[] args) {
        // 3 Key components of a loop
        // 1. Initialise the counter for the loop
        // 2. Test condition i.e. keep looping while true
        // 3. Update the counter for the loop
        
        //Example 1:  Basic While loop
        //Output the count up from 1 to 5
        
        //initialise the counter for the loop
        int count = 1;
        
        //test condition for while loop
        //keep executing the code while true
        while (count<=5)
        {
            System.out.println("Count "+count);
            //update the loop counter
            count++; 
        } //end while
        
        System.out.println("\n");
        //Rewrite the while loop above as 
        //a for loop 
//        for(int i=1; i<=5;i++)
//        {
//            System.out.println("Count "+i);
//        }//end for 
        
        
        //Example 2: Infinite while loop
        
        //Only stop the while loop
        //when the test condition is false
        //or you break out of the loop 
        
        while(true)
        {
            System.out.println("This is an infinite loop");
            //Use break; to exit the loop if
            // a certain condition is met 
            break;  //terminate the loop
        } //end while
        
        System.out.println("\n");
        //Example 3 - Use while to get user input
        
        //import the scanner class at the start of
        //the program
        
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);
        int sum=0;  // keep track of the running total
        
        while(true)
        {
            System.out.print("Enter a number (or 0 to exit):");
            int num = scanner.nextInt();
            
            if (num==0)   //exit while loop
            {
                break;
            }
            sum+=num;   //keep running total    
        } //end while
        
        System.out.println("Total: "+sum);
        
        
        
        
        
    } //end main 
    
} //end class 
