package HomeWorkRockPaperScissors;

import java.util.Scanner;

public class WithBugsCallingRockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 - Choose rock, paper or scissors");
        String choosePlayer1 = scanner.nextLine().toLowerCase().trim();
        System.out.println("Player 2 - Choose rock, paper or scissors");
        String choosePlayer2 = scanner.nextLine().toLowerCase().trim();

        if (choosePlayer1.equals("rock,paper,scissors")) {
            if (choosePlayer2.equals("rock, paper, scissors")) {
                System.out.println("input is valid");
            } else {
                System.out.println("input is not valid");
            }
        }
        WithBugsRockPaperScissors rockPaperScissors = new WithBugsRockPaperScissors();
        rockPaperScissors.printRockPaperScissors();
    }
}
