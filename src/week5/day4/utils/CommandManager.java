package week5.day4.utils;

import week5.CoffeeMachine.DrinkType;
import week5.day4.product.chips.ChipsTypes;
import week5.day4.product.chocolate.ChocolateTypes;
import week5.day4.product.drinks.DrinkTypes;
import week5.day4.product.sandwich.SandwichTypes;

public class CommandManager {
    public static Command convert(String str) {
        Command command = new Command();
        if(strValid(str)) {
            String strCountOfProducts = str.substring(4);
            command.setCount(Integer.valueOf(strCountOfProducts));
            setCommandFields(str, command);
            return command;
        }
        else System.exit(-1);
        return command;
    }
    private static boolean strValid(String str){
        if(str.length()>5) {
            System.out.println("Invalid input");
            return false;
        }
        else
        {
            if((str.charAt(0)=='A' || str.charAt(0)=='B'|| str.charAt(0)=='C'||str.charAt(0)=='D') &&
                    str.charAt(1)==':'&& str.charAt(3)==':'&& str.charAt(2)>='1' && str.charAt(2)<='4'
                    &&str.charAt(4)>='1'&& str.charAt(4)<='9')
                return true;
            else {
                System.out.println("Invalid input");
                return false;
            }
        }
    }

    private static void setCommandFields(String str, Command command) {
        String strHelpEnum = str.substring(0, 1);
        String currentType = str.substring(2,3);
        int currentTypeNumber = Integer.valueOf(currentType);
        switch (strHelpEnum) {
            case "A": {
                command.setDrinkTypes(DrinkTypes.values()[currentTypeNumber-1]);
                break;
            }
            case "B": {
                command.setChipsTypes(ChipsTypes.values()[currentTypeNumber-1]);
                break;
            }
            case "C": {
                command.setChocolateTypes(ChocolateTypes.values()[currentTypeNumber-1]);
                break;
            }
            default: {
                command.setSandwichTypes(SandwichTypes.values()[currentTypeNumber-1]);
                break;
            }
        }
    }
}
