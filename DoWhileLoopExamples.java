package com.mycompany.s1_iterationexamples;

import java.util.Scanner;

public class DoWhileExamples {

    public static void main(String[] args) {
  
        //Example 1: Basic Do While Loop
        //with a counter variable
        
        //1. initialise the counter for the loop
        int count = 1;
        
        do
        {
            System.out.println("Count: "+count);
            //3. update the counter variable
            count++;
            
        } //test condition
        while (count<=5);  //end do-while
        
        System.out.println("\n");
        //Example 2: Prompt for a positive integer value
        //from the user
        Scanner scanner = new Scanner(System.in);
        int userInput=0;
        
        do 
        {
            System.out.print("Enter a positive number: ");
            userInput = scanner.nextInt();
            
            if (userInput<=0)
            {
                System.out.println("Invalid input. "
                        + "Please enter a positive number.");
            }
            
        } while (userInput<=0);
        
        
        System.out.println("You entered: "+userInput);
        
        System.out.println("\n");
        
        //Example 3 - Menu Driven Program
        
       // Scanner scanner = new Scanner(System.in);
       int choice=0;
       
       do                   
       {
           System.out.println("1. Print Hello");
           System.out.println("2. Print World");
           System.out.println("3. Exit Program");
           
           System.out.print("Enter your choice: ");
           choice = scanner.nextInt();
           
           switch (choice)
           {
               case 1:
                   System.out.println("Hello");
                   break;
               case 2:
                   System.out.println("World");
                   break;
               case 3:
                   System.out.println("Exiting program!");
                   break;
               default:
                   System.out.println("Invalid choice. "+
                           "Please enter 1, 2, or 3.");
            } //end switch
                   
       }
       while (choice!=3);
        
        
        
    } //end main
    
} //end class
