import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;
        int diceRollCount = 0;

        while (position < 100) {
            int dieRoll = random.nextInt(6) + 1;
            diceRollCount++;
            int option = random.nextInt(3);

            if (position + dieRoll > 100) {
                continue;
            }

            switch (option) {
                case 0: // No Play
                    break;
                case 1: // Ladder
                    position += dieRoll;
                    break;
                case 2: // Snake
                    position -= dieRoll;
                    position = Math.max(position, 0);
                    break;
            }
            System.out.println("Roll " + diceRollCount + ": Position = " + position);
        }
        System.out.println("Total dice rolls: " + diceRollCount);
    }
}




