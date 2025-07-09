import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number:");
            userNumber = sc.nextInt(); // Removed 'int' keyword – it was redeclared inside loop

            if (myNumber == userNumber) {
                System.out.println("Correct! Numbers are same.");
                break; // Stop the loop after correct guess
            } else if (myNumber < userNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        } while (userNumber >= 0);

        System.out.println("My number was: " + myNumber);
        sc.close(); // Always good practice to close the Scanner
    }
}
