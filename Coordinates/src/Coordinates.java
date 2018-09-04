import java.util.Scanner;

/**
 * Program that provides X and Y coordinates based off inputs entered into the console
 *
 * @author dtingg written by Dianna Tingg
 */
public class Coordinates {

    /**
     * Main method - Introduces the game and the commands
     * Plays game until player wants to quit
     * Says game over
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Introduce the program and the commands
        System.out.println("Welcome to Dianna's Map Coordinates Program!");
        System.out.println("u = up, d = down, l = left, r = right");
        System.out.println("You can move any number of spaces in four directions. Example: 2d4r\n");

        //Open the scanner
        Scanner scanner = new Scanner(System.in);

        //Play game until the user wants to quit
        do {
            playGame(scanner);
        } while (playAgain(scanner));

        //Close the scanner
        scanner.close();

        //Say goodbye
        System.out.print("Game Over");
    }

    /**
     * Play game
     * User enters a string command
     * Computer returns x and y map coordinates
     *
     * @param scanner captures string commands
     */
    private static void playGame(Scanner scanner) {
        //Start x and y at 0, 0
        int x = 0;
        int y = 0;

        //Ask for user input
        System.out.print("Enter your coordinate string command: ");

        //Save scanner input as userInput and convert to lowercase
        String userInput = scanner.next().toLowerCase();

        //Convert string to char array
        char[] commands = userInput.toCharArray();

        //Initiate a string to hold numerical values.  Set default as empty.
        String moves = "";

        //Iterate over the characters in the array
        for (char c : commands) {
            //Checks if character is a digit
            if (Character.isDigit(c)) {
                moves += Character.toString(c);

                //Checks if character is u, d, l, or r
            } else if (c == 'u') {
                if (moves == "") {
                    y += 1;
                } else {
                    y += Integer.parseInt(moves);
                    moves = "";
                }
            } else if (c == 'd') {
                if (moves == "") {
                    y -= 1;
                } else {
                    y -= Integer.parseInt(moves);
                    moves = "";
                }
            } else if (c == 'l') {
                if (moves == "") {
                    x -= 1;
                } else {
                    x -= Integer.parseInt(moves);
                    moves = "";
                }
            } else if (c == 'r') {
                if (moves == "") {
                    x += 1;
                } else {
                    x += Integer.parseInt(moves);
                    moves = "";
                }
                //Skip over other characters
            } else {
                moves = "";
            }
        }

        //Print final coordinates
        System.out.println("Final coordinates are: " + x + ", " + y + "\n");
    }

    /** Asks if the user wants to play again
     *@param scanner user can enter y or n
     *@return true for play again or false for don't play again
     */
    private static boolean playAgain(Scanner scanner) {
        System.out.print("Do you want to play again? Y or N: ");
        String answer = scanner.next().toLowerCase();
        return answer.equals("y");
    }
}