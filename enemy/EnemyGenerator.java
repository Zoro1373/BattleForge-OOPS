package enemy;

import java.util.Random;

public class EnemyGenerator {

    public static Enemy generateRandomEnemy() {

        Random random = new Random();
        int enemyType = random.nextInt(3);

        switch (enemyType) {

            case 0:
                return new Enemy("Goblin", 60, 10);

            case 1:
                return new Enemy("Skeleton", 80, 12);

            case 2:
                return new Enemy("Orc", 100, 15);

            default:
                return new Enemy("Goblin", 60, 10);
        }
    }
}