package week5.soldiersGame.shields;

public class MidLevelShield extends Shield {

    @Override
    public int shieldHelp(int damage) {
        return (int)(damage * 10/100);
    }

    @Override
    public int shieldAttack(int damage) {
        return 0;
    }
}
