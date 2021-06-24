package week5.soldiersGame.shields;

public class HighLevelShield extends Shield{

    @Override
    public int shieldHelp(int damage) {
        return 0;
    }

    @Override
    public int shieldAttack(int damage) {
        return damage*10/100;
    }
}
