package characters;

public class Warrior extends character{
    private int rage;

    public Warrior(String name){
        super(name,120,25);
        this.rage=0;
    }
    public void powerStrike(){
        System.out.println(name + " uses POWER STRIKE!");
        int damage = attackPower + 15;
        rage += 10;

        System.out.println("Damage dealt: "+ damage);
        System.out.println("Rage increased to: "+ rage);

    }
    public void showRage(){
        System.out.println(name + " 's Rage: "+ rage);
    }
    
}
