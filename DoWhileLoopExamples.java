
package com.mycompany.iterationexamples;

/**
 * Purpose: Demo Do While Loop
 * @author DarrenStones
 */
public class DoWhileLoopExamples {

    public static void main(String[] args) {
        // initialise counter for do-while
        //loop
        int count = 1;
        
        do {
            System.out.println("Count is: "+count);
            count++; //update counter for loop
        } while (count<=5);
        
    } //end main
}//end class 
