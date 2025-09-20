/*
Name of File: PlayerSelection.java

Description Of Code:
This program simulates the Ashesi Premier League team selection process.
It collects player information (name, age, height, weight, jersey number),
determines the player's category, position, eligibility, lineup decision,
and final decision (Play/Rest). It also demonstrates a switch-case fall-through
scenario for educational purposes.

Developer: Cal Senam Afun
Date: 2025-09-20

*/

import java.util.Scanner;

public class PlayerSelection{
    // Constants
    final static double POUND = 0.45359237;
    final static int METER = 100;

    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

            // Declaring Variables
            String category;
            String position;
            String attacker;
            String eligibility;
            String lineUpDecision;
            String finalDecision;

        // Collecting Inputs
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your jerseyNumber: ");
        int jerseyNumber = scanner.nextInt();

       //selections for category
        if (age < 20){
                category = "Rising Star";
        } else if (age >= 20 && age <= 30){
            category = "Prime Player";
        } else{
            category = "Veteran";
        }

        // converting to relevant units
        double weightKg = weight * POUND;
        double heightCm = METER * height;
        int newWeightKg = (int) weightKg;

        // switch statement using jersey numbers
        switch(jerseyNumber){
            case 1:
                position = "GoalKeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            
            default:
                position = "Player's Jersey Number Not known";
                break;
            }

        // Ternary Operator for attacker status
        attacker = (jerseyNumber == 9 || jerseyNumber == 7 || jerseyNumber == 11) ? "Yes" : "No";

        //Ternary Operator for eligibility status
        boolean isEligible = (age >= 18) && (age <= 35) && (newWeightKg < 90);
        eligibility = isEligible ? "Eligible" : "Not Eligible";

        // Selection for line up decisions
        if (age >= 20 && age <= 30) {      
            if (newWeightKg < 80) {        
                lineUpDecision ="Starting lineup";
            } else {
                lineUpDecision = "Bench";
            }
        } else {
            lineUpDecision = "Not a prime player so not eligible";
        }

        //Ternary Operator for final decision status
        finalDecision = isEligible ? "Play" : "Rest";

        // Printing the outputs
        System.out.println("\nPlayer's Report");
        System.out.printf("Player: %s%n", name);
        System.out.printf("Age: %d (%s)%n", age, category);
        System.out.printf("Height: %.2fcm%n", heightCm);
        System.out.printf("Weight: %d kg%n", newWeightKg);
        System.out.printf("Jersey: %d%n", jerseyNumber);
        System.out.printf("Attacker jersey: %s%n", attacker);
        System.out.printf("Eligibility: %s%n", eligibility);
        System.out.printf("Lineup Decision: %s%n", lineUpDecision);
        System.out.printf("Final Decision: %s%n", finalDecision);

        // Unwanted Fall-Through Demo
         System.out.println("\nUnwanted fall-through demo");
        switch(jerseyNumber){
            case 2:
                System.out.println("Defender");
                
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Midfielder");

            case 7:
                System.out.println("Winger");

            case 8:
                System.out.println("Midfielder");
                break;
                
            default:
                System.out.println("Player's Jersey Number Not known");
                break;
        }

        // closing the scanner
        scanner.close();
            
}
}