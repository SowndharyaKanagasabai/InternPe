package internpeTasks;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			String[] rps = { "rock", "paper", "scissor" };
			String computerMove = rps[new Random().nextInt(rps.length)];
			String playerMove;

			while (true) {
				System.out.println("Please Enter Your Move(rock, paper or scissor): ");
				playerMove = sc.nextLine();
				if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move.");
			}
			
			System.out.println("Computer played: "+computerMove);
			
			if(playerMove.equals(computerMove)) {
				System.out.println("The game was a tie!");
			}
			else if(playerMove.equals("rock")) {
				if(computerMove.equals("paper")) {
					System.out.println("You Lose!");
				} else if(computerMove.equals("scissor")) {
					System.out.println("You Win!!!");
				}
			}
			
			else if(playerMove.equals("paper")) {
				if(computerMove.equals("rock")) {
					System.out.println("You Win!!!");
				} else if(computerMove.equals("scissor")) {
					System.out.println("You Lose!");
				}
			}
			
			else if(playerMove.equals("scissor")) {
				if(computerMove.equals("paper")) {
					System.out.println("You Win!!!");
				} else if(computerMove.equals("rock")) {
					System.out.println("You Lose!");
				}
			}
			
			System.out.println("Play Again? (y/n): ");
			String playAgain = sc.nextLine();
			
			if(!playAgain.equals("y")) {
				break;
			}
		}
		
	}

}
