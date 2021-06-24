package week6.day5;

public interface MyQueue<T> {
    public void addFirst(T obj);
    public void addLast(T obj);
    public void removeLast();
    public void removeFirst();
    public T getFirst();
    public T getLast();
}
