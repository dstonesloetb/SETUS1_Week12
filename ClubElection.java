package com.mycompany.iterationexamples;

import java.util.Scanner;

// Insert program header

/**
 * Purpose: Club Election Programme
 * Student Name:
 * Student Number: 
 * Date: Nov 2023
 */

public class ClubElection {
    
    public static void main(String[] args) {
        
        //Declare and initialise variables
              
        Scanner scanner = new Scanner(System.in);
        

        // Get the number of candidates
        System.out.println("Enter the number of candidates:");
        int numCandidates = scanner.nextInt();
        scanner.nextLine(); 

        // Initialize variables to store information about the candidate
        // with the highest votes
        String winningCandidate = "";
        int maxVotes = -1;

        // Iterate through each candidate to collect their name and votes
        for (int i = 1; i <= numCandidates; i++) {
            System.out.println("Enter the name of Candidate " + i + ":");
            String candidateName = scanner.nextLine();

            System.out.println("Enter the votes for candidate " +
                    candidateName + ":");
            int candidateVotes = scanner.nextInt();
            scanner.nextLine(); 

            // Update the information if the current candidate has more
            // votes than the current maximum
            if (candidateVotes > maxVotes) {
                maxVotes = candidateVotes;
                winningCandidate = candidateName;
            } //end if
        } //end for

        // Display the candidate with the highest votes
        System.out.println(winningCandidate + " had the highest number of"
                + " votes with a total of: " + maxVotes +".");
        
        //Close the scanner object when input complete
        scanner.close();
        
    } //end main
} //end class
