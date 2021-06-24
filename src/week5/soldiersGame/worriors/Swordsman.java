package week5.soldiersGame.worriors;

import week5.soldiersGame.shields.HighLevelShield;
import week5.soldiersGame.shields.Shield;

import java.util.Random;

public class Swordsman extends Warrior {
   public Swordsman(){
        setDamage(150);
        setName("Swordsman");
       Shield shield = new HighLevelShield();
       setShield(shield);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void attack(Warrior opponent) {
        System.out.println("Swordsman attack");
        opponent.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior opponent) {
        Random random = new Random();
        int haveShield = random.nextInt(2);
        int damage = opponent.getDamage()+random.nextInt(15)-random.nextInt(40);
        if(haveShield==0) {
            setHealth(Math.max((getHealth() - getShield().shieldHelp(damage)), 0));
            opponent.setHealth(Math.max((opponent.getHealth() - getShield().shieldAttack(damage)), 0));
        }
        else{
            setHealth(Math.max((getHealth() - damage), 0));
        }
        System.out.println("Swordsman take damage --- health "+getHealth());
    }
}
