package week5.day4;

import week5.day4.product.Product;

public class Queue <T>{
    private Product[] queue;
    private final int length;
    private int count;

    Queue(){
        length = 10;
        queue = new Product[length];
        count = 0;
    }
    public int getCount(){
        return count;
    }
    public void pushAll(Product item){
        for (int i = count; i < length; i++) {
            push(item);
        }
        count=length;
    }
    public Product[] popAll(int countToPop){
        if(countToPop>count)
            countToPop=count;
        Product products[] = new Product[countToPop];
        for (int i = 0; i < countToPop; i++) {
           products[i] = pop();
        }
        return products;
    }
    public void push(Product item){
        if(count < length){
            queue[count] = item;
            count++;
        }
    }
    public Product pop(){
        Product product=null;
        if(count>1){
            product=queue[0];
            for(int i = 0; i < count-1; i++) {
                queue[i] = queue[i+1];
            }
            count--;
        }
        return product;
    }
}































