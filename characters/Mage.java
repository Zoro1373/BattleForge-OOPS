package characters;

public class Mage extends character {
    private int mana;
    public Mage(String name){
        super(name,80,30);
        this.mana=100;
    }
    public void castSpell(){
        if (mana >= 20){
            int damage = attackPower + 20;
            mana -= 20;


            System.out.println(name + "caste FireBall!");
            System.out.println("Damege dealt: " + damage);
            System.out.println("Remaning mana " + mana);

        }else{
            System.out.println("name" + " does not have enough mana!");
        }

    }
    public void showMana(){
        System.out.println(name + "'s Mana"+ mana);
    }
}
