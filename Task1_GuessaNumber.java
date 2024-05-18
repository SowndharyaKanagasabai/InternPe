package internpeTasks;

/*
 sowndharya kanagasabai
 Internpe= task 1
 Guess the number using java
 */
import java.util.Random;
import java.util.Scanner;

public class Task1_GuessaNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String play = "yes";
		
		//While looop to determine if we are going to the game again
		while(play.equals("yes")) {
			Random rand = new Random();
			int randNum = rand.nextInt(100);
			int guess = -1;
			int tries = 0;
		
		//while loop to check if the game is over
			while(guess != randNum) {
				System.out.print("Guess a number between 1 and 100: ");
				guess = reader.nextInt();
				tries++;
				
			if(guess == randNum) {
				System.out.println("Awesome! You Guessed the number!");
				System.out.println("It only took you "+tries+" guesses:");
				System.out.println("Would you like to play again? Yes or No: ");
				play = reader.next().toLowerCase();
			}
			else if(guess > randNum) {
				System.out.println("You guess too high, try again");
			}
			else {
				System.out.println("You guess too low, try again");
			}
			}
		}
		reader.close();
		
	}

}
