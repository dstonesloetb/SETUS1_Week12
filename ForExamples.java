package com.mycompany.s1_iterationexamples;

public class ForExamples {

    public static void main(String[] args) {
        //For Loop Example 1
        //Basic For Loop
        for (int i=0; i<5; i++)
        {
            System.out.println("Iteration "+(i + 1));
        } //end for 
        
        /*
        for (int i=1; i<=5; i++)
        {
            System.out.println("Iteration "+ i);
        } //end for 
        */
        
        System.out.println("\n");
        
        //For Loop Example 2
        //Nested For Loop
        
        //Outer for loop 
        for (int i=1; i<=3; i++)
        {
            //Inner for loop
            for (int j=1; j<=3; j++)
            {
                System.out.println("i="+i +", j="+j);
                
            } //end of inner for loop 
                        
        } //end outer for loop 
        
        System.out.println("\n");
        
        //For Loop Example 3
        //Using a traditional for loop
        //to output the contents of an array 
        
        //Declare and initialise an array
        //of integer numbers
        int[] numbers = {23, 7, 18, 99, 45};
        
        //Output the contents of the array 
        //on the same line separated with a tab
        for (int i=0; i<=numbers.length-1; i++ )
        {
            System.out.print(numbers[i]+"\t");
        } //end for 
        
        System.out.println("\n");
        
        //For Loop Example 4
        //Use the enhanced for loop also
        //known as the for-each loop
        //to output the contents of an array
        
        String[] pets = {"Dog", "Cat", "Goldfish","Parrot"};
        
        //for each pet in the pets list
        //output the pet type 
        for (String pet : pets)
        {
            System.out.println("Pet: "+pet);
        } //end enhanced for loop 
        
        System.out.println("\n");
        
        //Example 5 
        //Search a list to see if 
        //we can find an item in the list
        String[] products 
                = {"Icecream","Chocolate","Sweets","Pizza","Burger"};
        
        //String key = "Pizza"; //search item 
        //Prompt user for search item
        System.out.print("Please enter the shopping item you"
                + " wish to search for: ");
        String key = EasyIn.getString();
        
        boolean found = false; //item found status
        
        //search the list to see can we find pizza
        for (String product : products)
        {
            if (product.equalsIgnoreCase(key))
            {
               found = true;
               break;  //exit search when item found
            }
            else 
            {   
               found = false;
            }
                          
        } //end for 
        
        //Output if the product is available 
        if (found)
        {
            System.out.println(key+" is available.");
        }
        else 
        {   
            System.out.println(key + " is not available.");
        }
        
        
    } //end main
} //end class 
