import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1; // Generates a number between 1 and 6
        System.out.println("Die rolled: " + dieRoll);
    }
}
