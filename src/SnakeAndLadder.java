import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;

        while (position < 100) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

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
            System.out.println("Current position: " + position);
        }
        System.out.println("Congratulations! You reached position 100.");
    }
}


