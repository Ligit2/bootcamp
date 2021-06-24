package week6.day2;

public class MyArrayList<T> implements MyList<T> {

    private T array[];
    private final int factor = 10;
    private int cursor;
    private int capacity;

    public MyArrayList() {
        this.array = (T[]) new Object[factor];
        capacity = factor;
    }

    private void checkIndex(int index) {
        if (index >= cursor)
            throw new IndexOutOfBoundsException("Out of bounds");
        if (index < 0)
            throw new IndexOutOfBoundsException("index must be > 0");
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public boolean contains(T obj) {
       return indexOf(obj)!=-1;
    }

    private int indexOf(T obj) {
        for (int i = 0; i < cursor; i++) {
            if (equals(array[i], obj))
                return i;
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
    }

    @Override
    public boolean remove(T obj) {
        if (contains(obj)) {
            remove(indexOf(obj));
            return true;
        }
        return false;
    }

    @Override
    public void add(T obj) {
        if (cursor == capacity) {
            grow();
        }
        array[cursor] = obj;
        cursor++;
    }

    private void grow() {
        capacity = capacity + factor;
        T newArray[] = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, capacity);
        array = newArray;
    }

    @Override
    public int size() {
        return cursor;
    }

    public boolean equals(T obj1, T obj2) {
        if (obj2 == null && obj1 == null)
            return true;
        else if (obj1!= null && obj2!=null&& obj2.equals(obj1))
            return true;
        else
            return false;

    }
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < cursor; i++){
            result.append(array[i]);
            if(i < cursor - 1){
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
