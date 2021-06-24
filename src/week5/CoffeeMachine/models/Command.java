package week5.CoffeeMachine.models;

import week5.CoffeeMachine.DrinkType;

public class Command {
    private DrinkType drinkType;
    private int countOfSugar;

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public void setCountOfSugar(int countOfSugar) {
        this.countOfSugar = countOfSugar;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public int getSugar() {
        return countOfSugar;
    }
}
