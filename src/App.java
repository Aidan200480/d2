import java.util.Scanner;

// Name: Aidan McCormac
// Major: Games & Emerging Media
// Minor: Graphic Design
// Date of Submission : 9/14/2025

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Defines the scanner as sc
        
        int score = 0; // Interger that keeps track of player's right & wrong answers

        System.out.println("What is 20 + 20?"); // Question 1 - Addition - Made them all math questions for simplicity
        int Number1 = sc.nextInt(); // Asks Player for their Answer

        if (Number1 == 40) { // Checks for Correct Answer
            score = score + 1; // Adds Point to Player Score for Right Answer
            System.out.println("Correct! Score: " + score + "/3"); // Tells the Player they got the right answer and shows score
        } else { // Player gets question wrong
            System.out.println("Incorrect! Score: " + score + "/3"); // Tells Player they got the question wrong and shows score
        }

        System.out.println("What is  80 x 5 equal?"); // Question 2 - Multiplication
        int Number2 = sc.nextInt(); // Asks Player for their Answer

        if (Number2 == 400) { // Checks for Correct Answer
            score = score + 1; // Adds Point to Player Score for Right Answer
            System.out.println("Correct! Score: " + score + "/3"); // Tells the Player they got the right answer and shows score
        } else { // Player gets question wrong
            System.out.println("Incorrect! Score: " + score + "/3"); // Tells Player they got the question wrong and shows score
        }

        System.out.println("What is 480 / 8 equal?"); // Question 3 - Division - Last Question
        int Number3 = sc.nextInt(); // Asks Player for their Answer

        if (Number3 == 60) { // Checks for Correct Answer
            score = score + 1; // Adds Point to Player Score for Right Answer
            System.out.println("Correct! Score: " + score + "/3"); // Tells the Player they got the right answer and shows score
        } else { // Player gets question wrong
            System.out.println("Incorrect! Score: " + score + "/3"); // Tells Player they got the question wrong and shows score
        }

        System.out.println("You beat the quiz! You're Final Score is: " + score); // Final Message for Player giving them their total score

        // For this assignment I found the easiest way of making it was just using numbers
        // rather than trying to make a multiple choice quiz.

        // What I learned: I've have a complete understandingh of how if, else if, and else statements work
        // I also learned and memorized how to get players input in different formats
        // I've also memorized how to import and apply the scanner



        
        sc.close();


        

    }    
}
