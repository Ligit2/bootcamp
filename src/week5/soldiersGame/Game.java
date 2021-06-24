package week5.soldiersGame;




import week5.soldiersGame.worriors.Archer;
import week5.soldiersGame.worriors.Mage;
import week5.soldiersGame.worriors.Swordsman;
import week5.soldiersGame.worriors.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void start() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice1 = scanner.nextInt();
        Warrior warrior1 = getChoice(choice1);
        int choice2 = 1 + random.nextInt(2);
        Warrior warrior2 = getChoice(choice2);
        printOpponent(warrior1, warrior2);
        startGame(warrior1, warrior2);
    }

    private static void printOpponent(Warrior warrior1, Warrior warrior2) {
        System.out.println("Your opponent is " + warrior2.getName() + "\n Health--"
                + warrior2.getHealth() + "\n Damage--" + warrior2.getDamage());
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("Please choose Warrior");
        System.out.println("1.Archer\n Health--1000\n Damage--100" +
                "\n2.Swordsman\n Health--1000\n Damage--150" +
                "\n3.Mag\n Health--1000\n Damage--200");
    }

    private static Warrior getChoice(int choice1) {
        Warrior warrior1;
        switch (choice1) {
            case 1: {
                warrior1 = new Archer();
                break;
            }
            case 2: {
                warrior1 = new Swordsman();
                break;
            }
            default: {
                warrior1 = new Mage();
                break;
            }
        }
        return warrior1;
    }

    private static void startGame(Warrior player1, Warrior player2) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Now The Dice decides who starts the first, input enter");
        scanner1.nextLine();
        int privilege = getPrivilege();
        if(privilege==1){
            System.out.println("You start ");
        }
        else
        {
            System.out.println("Me start");
        }
        Scanner scanner = new Scanner(System.in);
        while (checkBalance(player1, player2)) {
            if (privilege == 1) {
                scanner.nextLine();
                System.out.print("You :");
                player1.attack(player2);
                if (checkBalance(player1, player2) == false) {

                    break;
                }
                scanner.nextLine();
                System.out.print("Me :");
                player2.attack(player1);
            } else {
                scanner.nextLine();
                System.out.print("Me :");
                player2.attack(player1);
                if (checkBalance(player1, player2) == false) {

                    break;
                }
                scanner.nextLine();
                System.out.print("You :");
                player1.attack(player2);

            }
        }
    }

    private static int getPrivilege() {
        Dice dices[] = new Dice[2];
        Random random = new Random();
        int privilege = 0;
        int max = 0;
        for (int i = 0; i < 2; i++) {
            dices[i] = new Dice(1 + random.nextInt(5));
            if (dices[i].getNumber() > max) {
                max = dices[i].getNumber();
                privilege = i + 1;
            }
        }
        System.out.println("Your dice");
        dices[0].show();
        System.out.println("My dice");
        dices[1].show();
        return privilege;
    }

    private static boolean checkBalance(Warrior player1, Warrior player2) {
        if (player1.getHealth() > 0 && player2.getHealth() > 0)
            return true;
        else if (player1.getHealth() <= 0) {
            System.out.println("Me :"+player2.getName() + " Won");
        } else if (player2.getHealth() <= 0) {
            System.out.println("You :" + player1.getName() + " Won");
        }
        return false;
    }
}
