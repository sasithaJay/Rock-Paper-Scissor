package RockPaperScissor;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playerMove;
        String computerMove;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerMove = scanner.nextLine().toLowerCase();

            if(!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")){
                System.out.println("Invalid option!");
                continue;
            }
                
            computerMove = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerMove);

            if(playerMove.equals(computerMove)){
                System.out.println("It's tie!");
            }
            else if((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                    (playerMove.equals("paper") && computerMove.equals("rock")) ||
                    (playerMove.equals("scissors") && computerMove.equals("paper"))){

                        System.out.println("You win!");
            }
            else if((playerMove.equals("rock") && computerMove.equals("paper")) ||
                    (playerMove.equals("paper") && computerMove.equals("scissors")) ||
                    (playerMove.equals("scissors") && computerMove.equals("rock"))){

                        System.out.println("You lost!");
            }
            else{
                System.out.println("Invalid move!");
            }

            System.out.print("Do you want to play again (yes/no)? ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing.");
        
        scanner.close();
    }
}