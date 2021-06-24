package week6.day5;

public class Main {
    public static void main(String[] args) {
        /*ArrayDequeue<Integer> list = new ArrayDequeue<Integer>();
        System.out.println(list.size);
        list.addFirst(1);
        list.removeFirst();
        System.out.println(list.tail);
        System.out.println(list);
        Stack<Integer> stack = new Stack<>();*/
        int array[] = {1,2,3,1,1,1,1,2};
        f(array,4);

    }
    public static void f(int array[], int number){
        int length =0;
        int maxLength=0;
        int k=0;
        for (int i = 0; i < array.length; i++) {
            length=0;
            int sum=0;
            for (int j = i; j < array.length; j++) {
                sum+=array[j];
                if(sum>number)
                    break;
                if(sum == number){
                    length = j-i+1;
                    if(length>maxLength){
                        maxLength=length;
                        k=i;
                    }
                    break;
                }
            }
        }
        System.out.println(maxLength);
        for (int i = k; i <k+maxLength ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
