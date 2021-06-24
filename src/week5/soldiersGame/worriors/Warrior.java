package week5.soldiersGame.worriors;


import week5.soldiersGame.shields.Shield;

public abstract class Warrior {
    private String name;
    private int health=1000;
    private int Damage;
    private Shield shield;

    public abstract void attack(Warrior opponent);
    public abstract void takeDamage(Warrior opponent);

    public void setHealth(int health) {
        this.health = health;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Shield getShield() {
        return shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return Damage;
    }
}
