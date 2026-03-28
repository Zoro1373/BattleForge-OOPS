package battle;

import characters.character;
import enemy.Enemy;

public class BattleSystem {
    public static void startBattle(character player, Enemy enemy) {

        System.out.println("\n⚔️ A wild " + enemy.getName() + " appears!");

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            // Player attacks
            System.out.println(player.getName() + " attacks!");
            enemy.takedamage(enemy.getHealth() - player.getAttackPower());
            System.out.println(enemy.getName() + " health: " + enemy.getHealth());

            if (enemy.getHealth() <= 0) {
                System.out.println(enemy.getName() + " defeated!");
                break;
            }

            // Enemy attacks
            System.out.println(enemy.getName() + " attacks!");
            player.takeDamage(enemy.getAttcakPower());
            System.out.println(player.getName() + " health: " + player.getHealth());

            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " was defeated...");
            }
        }
    }
}