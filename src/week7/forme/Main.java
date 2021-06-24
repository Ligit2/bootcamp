package week7.forme;

public class Main {
    int x;
    int y;
    public static void main(String[] args) {

      /*  CopyOnWriteArrayList<Integer> objects = new CopyOnWriteArrayList<>();
        objects.add(2);
        objects.add(3);
        objects.add(1);
        objects.add(9);
        Iterator<Integer> iterator1 = objects.iterator();
        int i=0;
        objects.remove(i);
        while(iterator1.hasNext()){

           System.out.println(iterator1.next());
       }
        System.out.println(objects);*/
       /* List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(90);
        for (Integer iterator:list) {

        }
        Iterator<Integer> iterator = list.iterator();


        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
       }

        System.out.println(list);*/
        example<Integer> integerexample = new example<>();
        example<String> stringexample = new example<>();
        f(integerexample,stringexample);

    }
    public static void f(example<?> a,example<?> b){
    }
}
