package week6.day2;

public interface MyList<T> {
    T get(int index);
    boolean contains(T obj);
    void remove(int index);
    boolean remove(T obj);
    void add(T obj);
    int size();
}
