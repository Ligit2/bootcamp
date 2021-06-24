package week6.day5;

import java.util.LinkedList;

public class MyStack<T> {
   private LinkedList<T> stack;
    MyStack(){
        stack = new LinkedList<T>();
    }
    public boolean IsEmpty(){
        if(stack.size()==0)
            return true;
        return false;
    }
    public T pop(){
       T obj =  stack.getLast();
        stack.removeLast();
        return obj;
    }
    public T pick(){
       return stack.peek();
    }
    public void push(T obj){
        stack.push(obj);
    }
}
