package week5.soldiersGame.worriors;

import week5.soldiersGame.shields.FantasticShield;
import week5.soldiersGame.shields.Shield;


import java.util.Random;

public class Mage extends Warrior {
   public Mage(){
        setDamage(200);
        setName("Mage");
       Shield shield = new FantasticShield();
       setShield(shield);
    }

    @Override
    public void attack(Warrior opponent) {
        System.out.println("Mage attack");
        opponent.takeDamage(this);

    }

    @Override
    public void takeDamage(Warrior opponent) {
        Random random = new Random();
        int haveShield = random.nextInt(2);
        int damage = opponent.getDamage()+random.nextInt(20)-random.nextInt(30);
        if(haveShield==0) {
            setHealth(Math.max((getHealth() - getShield().shieldHelp(damage)), 0));
            opponent.setHealth(Math.max((opponent.getHealth() - getShield().shieldAttack(damage)), 0));
        }
        else
        {
            setHealth(Math.max((getHealth() - damage), 0));
        }
        System.out.println("Mage take damage --- health "+getHealth());

    }
}
