/*
Name of file: FootballPlayer.java

Description Of Code:
This program demonstrates a sequence of tasks to simulate player data handling 
and decision-making in a football context. It collects a player's 
personal and physical information (name, age, height, weight, jersey number), 
converts units where necessary, and performs multiple tasks: 

- Task 1: Prints the raw player information.  
- Task 2: Converts height to centimeters and weight to kilograms, then prints.  
- Task 3: Demonstrates increment and decrement operators on age and jersey number.  
- Task 4: Checks eligibility and identifies any problems based on age and weight.  
- Task 5: Determines the player's category (Rising Star, Prime Player, Veteran).  
- Task 6: Assigns a player position using a switch statement.  
- Task 7A: Demonstrates unwanted fall-through in switch statements (no breaks).  
- Task 7B: Demonstrates grouped cases in a switch statement for cleaner code.  
- Task 8: Uses nested if statements to decide starting lineup or bench.  
- Task 9: Uses a ternary operator to decide the final play/rest decision.


Developer: Cal Senam Afun
Date: 2025-09-20
*/

import java.util.Scanner;
public class FootballPlayer{
    final static double pound = 0.45359237;
    final static int meter = 100;
    public static void main(String [] args){
        // Task 1
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Enter your height: ");
        height = scanner.nextDouble();

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        System.out.println("Enter your jersey number: ");
        jerseyNumber = scanner.nextInt();

        System.out.println("\nTask 1 Output");
        System.out.printf("Player Name - %s%n", name);
        System.out.printf("Age - %d%n", age);
        System.out.printf("Height - %.2fm%n", height);
        System.out.printf("Weight - %.0flbs%n", weight);
        System.out.printf("Jersey Number - %d%n", jerseyNumber);

        // Task 2
        double weightKg = weight * pound;
        double heightCm = meter * height;
        int newWeightKg = (int) weightKg;

        System.out.println("\nTask 2 Output");
        System.out.printf("Player Name - %s%n", name);
        System.out.printf("Age - %d%n", age);
        System.out.printf("Height in centimers - %.0fcm%n", heightCm);
        System.out.printf("Weight in kilograms - %dkg%n", newWeightKg);
        System.out.printf("Jersey Number - %d%n", jerseyNumber);

        //Task 3
        int originalJerseyNumber = jerseyNumber;
        System.out.println("\nTask 3 Output");
        System.out.printf("Player's age now is %d%n", age);
        System.out.printf("Player's new age is %d%n", ++age);
        System.out.printf("Jersey Number after penalty is %d%n", --jerseyNumber);

        // Task 4
        System.out.println("\nTask 4 Output");
        boolean isEligible = (age >= 18) && (age <= 35) && (newWeightKg < 90);
        if (isEligible){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }

        boolean hasProblem = (age < 18) || (newWeightKg >= 90);
        if (hasProblem){
            System.out.println("Player has problem either too young or too heavy");
        }else{
            System.out.println("Player has no problem");
        }

        if (!isEligible){
            System.out.println("Not Eligible");
        } else{
            System.out.println("Eligible");
        }


        //Task 5
        System.out.println("\nTask 5 Output");
        if (age < 20){
            System.out.println("Rising Star");
        }else if (age >= 20 && age <= 30){
            System.out.println("Prime Player");
        }else{
            System.out.println("Veteran");
        }

        // Task 6
        System.out.println("\nTask 6 Output");
        switch(originalJerseyNumber){
            case 1:
                System.out.println("GoalKeeper");
                break;
            case 2:
                System.out.println("Defender");
                break;
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Midfielder");
                break;
            case 7:
                System.out.println("Winger");
                break;
            case 8:
                System.out.println("Midfielder");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            case 11:
                System.out.println("Winger");
                break;
            default:
                System.out.println("Player's Jersey Number Not known");
                break;
        }


        // Task 7 Part A
        System.out.println("\nTask 7A Output");
        switch(originalJerseyNumber){
            case 1:
                System.out.println("GoalKeeper");
                break;
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
                
            case 11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player's Jersey Number Not known");
                break;
        }

        // Task 7 Part B
        System.out.println("\nTask 7B Output");
        switch(originalJerseyNumber){
            case 1:
                System.out.println("GoalKeeper");
                break;
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            
            default:
                System.out.println("Player's Jersey Number Not known");
                break;
        }

        // Task 8
        System.out.println("\nTask 8 Output");
        if (age >= 20 && age <= 30){
            if (newWeightKg < 80){
                System.out.println("Starting lineup");
            } else{
                System.out.println("Bench");
            }
        } else{
            System.out.println(" Not a prime player so not eligible");
        }

        // Task 9
        System.out.println("\nTask 9 Output");
        String decision = isEligible ? "Play" : "Rest";
        System.out.println(decision);

        scanner.close();
    }
}