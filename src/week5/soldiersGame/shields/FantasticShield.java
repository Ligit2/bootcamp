package week5.soldiersGame.shields;

public class  FantasticShield extends Shield {
    @Override
    public int shieldHelp(int damageOop) {
        return 0;
    }

    @Override
    public int shieldAttack(int damage) {
        return damage*20/100;
    }
}
