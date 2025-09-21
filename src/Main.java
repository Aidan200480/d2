import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){ // Changed i variable to start at 1 instead of 0, added an = to the less than sign to make it stop at 10 rather than before
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");

        int num = sc.nextInt(); // takes the users input
        int factorial = 1; // Stores the factorial
        
        for (int i = 1; i <= num; i++){ // Changed i from 0 to 1, multiplying by 0 would just give you 0, also changed the sign to <= so it would include the final loops number
            factorial *= i; // where the math takes place, also could be: factorial = factorial * i
        }

        System.out.println("Factorial of " + num + " is " + factorial); // prints results


        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?

        int n = sc.nextInt(); // takes the users input
        int sum = 0; // variable to hold the sum of the numbers

        for (int i = 1; i <= n; i += 2){ // loop through numbers, skipping every other number and start at 1 and go up by 2 each time instead of i++
            sum += i; // adds each odd number to sum variable
        }

        System.out.println("The sum of every other number up to " + n + " is " + sum); // Prints response with sum


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run){ // Condensed from "== true" to just the variable, since the variable was already defined as true
            System.out.println("I printed once!");
            run = false; // Stops the loop after the first print
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        
        sc.nextLine(); // Clears the scanner buffer, since I used nextInt prior
        String input = sc.nextLine(); // User string input
        String reverse = ""; // This variable will hold the reversed string

        for (int i = input.length() - 1; i >= 0; i--){ // loop backwards through user string
            reverse += input.charAt(i); // adds on each character begining from the end
        }

        System.out.println("Reversed: " + reverse); // Prints the reversed string
        // P5 really baffled me for awhile and I needed a lot of help from google but eventually got there
        // The concept of each character being a number confused me as I worked on this and I still struggle a bit
        



    }
}