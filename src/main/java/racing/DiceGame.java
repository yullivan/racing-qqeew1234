package racing;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    private Random random = new Random();

    public void play(int count) {
        for (int i = 0; i < count; i++) {
            int dice = random.nextInt(6) + 1;
            if (dice >= 3) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
