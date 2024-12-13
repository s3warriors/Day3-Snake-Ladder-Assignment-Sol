import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int[] positions = {0, 0}; // Player 1 and Player 2
        int currentPlayer = 0;

        while (positions[0] < 100 && positions[1] < 100) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (positions[currentPlayer] + dieRoll <= 100) {
                switch (option) {
                    case 0: // No Play
                        break;
                    case 1: // Ladder
                        positions[currentPlayer] += dieRoll;
                        System.out.println("Player " + (currentPlayer + 1) + " got a Ladder to position " + positions[currentPlayer]);
                        continue; // Extra turn
                    case 2: // Snake
                        positions[currentPlayer] -= dieRoll;
                        positions[currentPlayer] = Math.max(positions[currentPlayer], 0);
                        break;
                }
            }

            System.out.println("Player " + (currentPlayer + 1) + " position: " + positions[currentPlayer]);

            // Switch to the other player
            currentPlayer = 1 - currentPlayer;
        }

        System.out.println("Player " + (positions[0] >= 100 ? 1 : 2) + " wins the game!");
    }
}





