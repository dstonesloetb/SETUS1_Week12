package com.mycompany.iterationexamples;

/**
 * Demo: Summarise Java Loops Concepts 
 * @author DarrenStones
 */
public class SummaryLoopExamples {

    public static void main(String[] args) {
        
       System.out.println("\nFor Loop\n");
        int num =0;

        // For Loop
        for (int i=0; i<5;i++)
        {
            num+=2;
            //System.out.println(i);
            System.out.println(num);
        }//end for
        
        System.out.println("\nWhile Loop\n");
        
        //While Loop
        int i = 0; //init counter
        while(i<5) //test condition
        {
            System.out.println(i);
            i++; //update counter             
        } //end while
        
        System.out.println("\nDo While Loop\n");
        
        //init loop counter
        int counter = 0; 
        
        do {
            System.out.println(counter);
            counter++; //update counter
        } while(counter<5);  //test condition 
              
        
        System.out.println("\nFor Each Loop\n");
        
        //Declare and init an array of numbers
        int[] numbers = {1,2,3,4,5};
        
        //for each number in the numbers
        //array output the number 
        for (int number : numbers)
        {
            System.out.print(number+"\t");
        } //end of for each loop 
        
        
    }//end main
    
} //end class
