import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove;
        String playerMove;
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("Enter your move (rock, paper, scissors). To exit the game, type \"exit\": ");
            playerMove = scanner.nextLine().toLowerCase();
            
            if (playerMove.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }
            
            int randIndex = random.nextInt(3);
            computerMove = rps[randIndex];
            
            System.out.println("Computer chose: " + computerMove);
            
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                       (playerMove.equals("paper") && computerMove.equals("rock")) ||
                       (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        scanner.close();
    }
}
