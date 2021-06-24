package week5.day5;

public class Main {
    public static void main(String[] args) {
        GenericDynamicArray<String> genericDynamicArray = new GenericDynamicArray<>();
        genericDynamicArray.add("barev");
        genericDynamicArray.add("mama");
        System.out.println(genericDynamicArray.indexOf("mama"));
        genericDynamicArray.remove("barev");
        System.out.println(genericDynamicArray.getCount());
        genericDynamicArray.print();
    }
}
