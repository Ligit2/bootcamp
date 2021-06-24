package week5.day4.utils;
import week5.day4.product.chips.ChipsTypes;
import week5.day4.product.chocolate.ChocolateTypes;
import week5.day4.product.drinks.DrinkTypes;
import week5.day4.product.sandwich.SandwichTypes;

public class Command {

    private int count;
    private DrinkTypes drinkTypes;
    private ChocolateTypes chocolateTypes;
    private SandwichTypes sandwichTypes;
    private ChipsTypes chipsTypes;

    public int getCount() {
        return count;
    }

    public DrinkTypes getDrinkTypes() {
        return drinkTypes;
    }

    public ChocolateTypes getChocolateTypes() {
        return chocolateTypes;
    }

    public SandwichTypes getSandwichTypes() {
        return sandwichTypes;
    }

    public ChipsTypes getChipsTypes() {
        return chipsTypes;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDrinkTypes(DrinkTypes drinkTypes) {
        this.drinkTypes = drinkTypes;
    }

    public void setChocolateTypes(ChocolateTypes chocolateTypes) {
        this.chocolateTypes = chocolateTypes;
    }

    public void setSandwichTypes(SandwichTypes sandwichTypes) {
        this.sandwichTypes = sandwichTypes;
    }

    public void setChipsTypes(ChipsTypes chipsTypes) {
        this.chipsTypes = chipsTypes;
    }
}
