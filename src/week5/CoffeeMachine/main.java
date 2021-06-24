package week5.CoffeeMachine;

public class main {
    public static void main(String[] args) {

      CoffeeMachine coffeeMachine = new CoffeeMachine();
      System.out.println(coffeeMachine.makeProduct(CommandConverter.Convert()).toString());

    }
}
