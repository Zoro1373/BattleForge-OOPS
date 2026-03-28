package enemy;

public class Enemy {
    private String name;
    private int health;
    private int attackPower;

    public Enemy(String name, int health, int attcakPower){
        this.name = name;
        this.health = health;
        this.attackPower = attcakPower;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttcakPower(){
        return attackPower;
    }
    public void takedamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }
    public void displayEnemy(){
        System.out.println("Enemy: " + name);
        System.out.println("Health: " + health);
        System.out.println("AttackPower: "+ attackPower);
    }


}
