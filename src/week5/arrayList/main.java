package week5.arrayList;

public class main {
    public static void main(String[] args) {
        String[] strings = {"aa", "bb", "cc", "cc"};
        String[] array = {"ac", "bk", "cc", "cc"};
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.Sort(SortTypes.DESC);
        dynamicArray.add("g");
        dynamicArray.Print();
        dynamicArray.remove(1);
        System.out.println();
        dynamicArray.Print();
    }
}
