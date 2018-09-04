import java.util.Random;
import java.util.Scanner;

/**
 * Simple number guessing game
 * @author dtingg written by Dianna Tingg
 */
public class GuessingGame {

    /**
     * Generates a random number
     * @return a random integer between 0 and 100 (inclusive)
     */
    private static int getRandomNum() {
        int min = 0;
        int max = 100;
        System.out.println("Try to guess my number!  It is between " + min + " and " + max + ".");
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    /**
     * Asks if the user wants to play again
     * @param scanner looks for Y
     * @return true for play again or false for don't play again
     */
    private static boolean playAgain(Scanner scanner) {
        System.out.print("Do you want to play again? Y or N: ");
        String answer = scanner.next().toUpperCase();
        return answer.equals("Y");
    }

    /**
     * Play game
     * User enters a guess (number)
     * Computer evaluates whether actual number is higher, lower, or the same (correct)
     * @param scanner looks for integer (number guess)
     */
    private static void playGame(Scanner scanner) {
        int num = getRandomNum();
        int guess = -1;
        int counter = 1;

        while (guess != num) {
            System.out.print("What is your guess? ");
            guess = scanner.nextInt();
            if (guess < num) {
                System.out.print("My number is higher. ");
                counter++;
            } else if (guess > num) {
                System.out.print("My number is lower. ");
                counter++;
            } else {
                System.out.println("Correct!  It took you " + counter + " tries.\n");
            }
        }
    }

    /**
     * Main method
     * Introduces the game
     * Plays game until player says stop
     * Says game over
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Dianna's Number Guessing Game!\n");

        Scanner scanner = new Scanner(System.in);

        //Play game until the user says no
        do {
            playGame(scanner);
        } while (playAgain(scanner));

        scanner.close();

        System.out.print("Game Over");
    }
}