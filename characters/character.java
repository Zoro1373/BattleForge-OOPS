package characters;

public class character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int level;
    protected int xp;

    public character(String name, int health,int attackPower) {
        this.name = name;
        this.health= health;
        this.attackPower= attackPower;
        this.level= 1;
        this.xp= 0;
    }

    public void displayStats(){
        System.out.println("Charater: "+name);
        System.out.println("Health: "+health);
        System.out.println("Attack: "+attackPower);
        System.out.println("level: "+ level);
        System.out.println("XP: "+xp);
    }
    public String getName() {
    return name;
}

public int getHealth() {
    return health;
}

public int getAttackPower() {
    return attackPower;
}

public void takeDamage(int damage) {
    health -= damage;
    if (health < 0) {
        health = 0;
    }
}

    
    
}
