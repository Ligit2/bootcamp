package week5.test;

public class urishQueue {
    private int queue[];
    private final int length;
    private int count;

   public urishQueue(){
        length = 10;
        queue = new int[length];
        count = 0;
    }
    public void push(int item){
        if(count < length){
            queue[count] = item;
            count++;
        }
    }
    public int getCount(){
        return count;
    }
    public void pushAll(int item){
        for (int i = count; i < length; i++) {
            push(item);
        }
        count=length;
    }
    public void pop(){
        if(count>0){
            for (int i = 0; i < count-1; i++) {
                queue[i] = queue[i+1];
            }
            count--;
        }
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(queue[i]+" ");
        }
    }
}
