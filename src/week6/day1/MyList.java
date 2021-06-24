package week6.day1;

public interface MyList <T>{
    T get(int index);
    void add(T obj);
    void remove(int index);
    void remove(T obj);
    int size();
    boolean contains(T obj);
}
