import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("Hi, we are going to play a game!");
        System.out.println("I am thinking of a number between 0 and 100.");
        System.out.println("Can you guess which one it is?");

        boolean playing = true;
        while (playing) {
            System.out.println("Please enter your number:");
           //generates the pseudo random number the player has to guess
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(101);

            //reads the user input from command line
            Scanner reader = new Scanner(System.in);
            int number = reader.nextInt();
            //variable to keep track of number of guesses
            int numberOfGuesses = 1;

            //while the number is not found yet:
            while (number != randomNumber) {
                if (number > randomNumber) {
                    System.out.println("Ooops, this was too high. Try again.");
                    numberOfGuesses++;
                } else {
                    System.out.println("Too low! Try again!");
                    numberOfGuesses++;
                }
                number = reader.nextInt(); //read the next input and repeat the while loop
            }
            //otherwise:
            System.out.println("Yeay, it's a match!");
            System.out.println("It only took you " + numberOfGuesses + " guesses.");
           //play again?
            System.out.println("Do you want to play again? Answer with Yes or No.");
            String answer = reader.next();
            while (!answer.equals("Yes") && !answer.equals("No")){
                System.out.println("Please answer with Yes or No.");
                answer = reader.next();
            }
            if(answer.equals("Yes")) { playing = true;}
            else playing = false;
        }
    }
}
