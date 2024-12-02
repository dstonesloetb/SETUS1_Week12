package com.mycompany.s1_iterationexamples;

public class ForExercises {


    public static void main(String[] args) {
        // For Loop exercise 1
        //Print the numbers 1 to 10
        for (int i=1; i<=10;i++)
        {
            System.out.print(i+" ");
        }//end for 
        
        System.out.println("\n");
        //For Loop exercise 2
        //Print the even numbers 2 to 20 
        for (int i=2; i<=20; i=i+2)
        {
            System.out.println(i);
        }//end for 
        
        //Output the numbers 3 to 50
        //backwards in steps of 4 
        //on the same line 
        //separated by a tab 
        System.out.println("\n");
        
        for (int i=50; i>=3; i=i-4)
        {
            System.out.print(i+"\t");
        } //end for
        
        System.out.println("\n");
        //Write a java program
        //to calculate the sum of the numbers
        //from 1 to 100 using a for loop
        int total=0;
        for (int i=1; i<=100; i++)
        {
            total+=i; //total=total+i
        }
        System.out.println("total: "+total);
        
        
        
        
        
    } //end main
    
}//end class 
