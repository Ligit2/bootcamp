package week6.day5;

public class ArrayDequeue<T> implements MyQueue<T> {
    int capacity;
    T array[];
    int size;
    final static int factor = 16;
    T head;
    T tail;

    ArrayDequeue() {
        array = (T[]) new Object[factor];
        size = 0;
        capacity = factor;
    }

    @Override
    public void addFirst(T obj) {
        checkObj(obj);
        if (size == 0) {
            array[size] = obj;
            head = array[size];
            tail = array[size];
            size++;
            return;
        }
        if (size == capacity) {
            grow();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = obj;
        head = array[0];
        size++;
    }

    @Override
    public void addLast(T obj) {
        checkObj(obj);
        if (size < capacity) {
            if (size == 0) {
                array[size] = obj;
                head = array[size];
                tail = array[size];
                size++;
                return;
            }
            array[size] = obj;
            tail = array[size];
            size++;
            return;
        } else {
            grow();
            array[size] = obj;
            tail = array[size];
            size++;
        }
    }

    private void checkObj(T obj) {
        if (obj == null)
            throw new NullPointerException("null element");
    }

    private void grow() {
        capacity += factor;
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = array[i];
        }
        array = copy;
    }

    @Override
    public void removeLast() {
        if (size == 0)
            throw new NullPointerException("empty array");
        else {
            if (size == 1) {
                tail = null;
                head = null;
                size--;
                return;
            }
            size--;
            tail = array[size - 1];
        }
    }

    @Override
    public void removeFirst() {
        if (size == 0)
            throw new NullPointerException("empty array");
        else {
            if (size == 1) {
                tail = null;
                head = null;
                size--;
                return;
            }
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            head = array[0];
            tail = array[size];
        }
    }

    @Override
    public T getFirst() {
        if (size == 0)
            throw new NullPointerException("array is empty");
        else
            return head;
    }

    @Override
    public T getLast() {
        if (size == 0)
            throw new NullPointerException("array is empty");
        else
            return tail;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(" , ");
            }
        }
        result.append(']');
        return result.toString();
    }
}
