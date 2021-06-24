package week5.CoffeeMachine;

//import week5.CoffeeMachine.models.Command;

import week5.CoffeeMachine.models.Command;

public class CoffeeMachine {

    public Cup makeProduct(Command command){
        Cup cup=new Cup();
       addDrink(command,cup);
       addStick(command,cup);
       addSugar(command,cup);
       return cup;
    }
   private void addDrink(Command command, Cup cup){
       DrinkType drinkType = command.getDrinkType();
        if(drinkType == DrinkType.COFFEE) {
            Coffee coffee = new Coffee();
            cup.setDrink(coffee);
        }
        if(drinkType == DrinkType.TEA) {
            Tea tea = new Tea();
            cup.setDrink(tea);
        }
        if(drinkType == DrinkType.CHOCOLATE) {
            Chocolate chocolate = new Chocolate();
            cup.setDrink(chocolate);
        }
    }
   private void addSugar(Command command, Cup cup){
        if(command.getSugar()!=0){
           Sugar[]sugar = new Sugar[command.getSugar()];
            for (int i = 0; i < command.getSugar(); i++) {
                sugar[i] = new Sugar();
            }
            cup.setSugar(sugar);
        }
    }
   private void addStick(Command command, Cup cup){
        if(command.getSugar()!=0){
            Stick stick = new Stick();
            cup.setStick(stick);
        }
    }
}
