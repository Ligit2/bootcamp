package week5.CoffeeMachine;

import week5.CoffeeMachine.models.Command;

import java.util.Scanner;

public class CommandConverter {
    public static Command Convert() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(!CheckInput.checkStr(input)) {
            System.out.println("Invalid Input");
            System.exit(-1);
        }
        Command command = new Command();
        String[] split = input.split(":");
        extracted(command, split);
        command.setCountOfSugar(Integer.valueOf(split[1]));
        return command;
    }

    private static void extracted(Command command, String[] split) {
        switch (split[0]) {
            case "T":
                command.setDrinkType(DrinkType.TEA);
                break;
            case "C":
                command.setDrinkType(DrinkType.COFFEE);
                break;
            case "S":
                command.setDrinkType(DrinkType.CHOCOLATE);
                break;
        }
    }
}
