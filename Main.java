import battle.BattleSystem;
import characters.Mage;
import characters.Warrior;
import characters.character;
import enemy.Enemy;
import enemy.EnemyGenerator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        character player = null;

        while (true){
           System.out.println("\n=== BattleForge RPG ===");
System.out.println("1. Create Warrior");
System.out.println("2. Create Mage");
System.out.println("3. View Character Stats");
System.out.println("4. Start Battle");
System.out.println("5. Exit");


            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                
                case 1:
                    System.out.print("Enter Warrior name: ");
                    String warriorName = scanner.nextLine();
                    player = new Warrior(warriorName);
                    System.out.println("Warrior created");
                    break;
                
                case 2:
                    System.out.print("Enter Mage name: ");
                    String magename = scanner.nextLine();
                    player = new Mage(magename);
                    System.out.println("mage created!");
                    break;
                
                case 3:
                    if(player !=null){
                        player.displayStats();
                    }else{
                        System.out.println("No character created yet.");
                    }
                    break;

                    case 4:
    if (player != null) {

        Enemy enemy = EnemyGenerator.generateRandomEnemy();
        BattleSystem.startBattle(player, enemy);

    } else {
        System.out.println("Create a character first!");
    }
<<<<<<< HEAD
    break;n
=======
    break;
>>>>>>> e2215e9 (Final clean upload)

                case 5:
                    System.out.println("Exiting Batllefoege.....");
                    return;

                default:
                    System.out.println("Invalid option");



            }
        }
    }
}
