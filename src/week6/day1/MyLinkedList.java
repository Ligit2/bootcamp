package week6.day1;

public class MyLinkedList<T> implements MyList<T> {
    Node<T> first;
    Node<T> last;
    public int size;

    void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be > 0");
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (first == null) {
            first = node;
            size++;
            last = first;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            size--;
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == size - 1) {
            last = current;
            last.next = null;
        } else {
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public void remove(T obj) {
        Node<T> current = first;
        if (equals(first.value, obj)) {
            first = first.next;
            size--;
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            if (equals(current.next.value, obj)) {
                if (i == size - 2) {
                    last = current;
                    last.next = null;
                } else {
                    current.next = current.next.next;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public void add(int index, T obj) {
        Node<T> node = new Node<>(obj);
        Node<T> current = first;
        if (index == 0) {
            if (first == null) {
                first = node;
                size++;
                return;
            }
            node.next = first;
            first = node;
            size++;
            return;
        }
        checkIndex(index);
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
        size++;
    }

    @Override
    public boolean contains(T obj) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (equals(current.value, obj)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean equals(T obj1, T obj2) {
        if (obj2 == null && obj1 == null)
            return true;
        else if (obj1!=null && obj2!=null && obj2.equals(obj1))
            return true;
        else
            return false;

    }

    public void removeAll(T obj) {
        while (contains(obj)) {
            remove(obj);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(" , ");
            }
            current = current.next;
        }
        result.append(']');
        return result.toString();
    }

    public void removeFirst() {
        if (size > 0) {
            remove(0);
        }
        else{
            System.out.println("List is empty");
        }
    }

    public void removeLast() {
        if (size > 0)
            remove(size - 1);
        else
            System.out.println("List is empty");
    }
    public void removeList(){
        while(first!=null){
            removeFirst();
        }
    }
    public void swap(int index1, int index2){
        checkIndex(index1);
        checkIndex(index2);
        Node<T> current =first;
        for (int i = 0; i < index1; i++) {
            current=current.next;
        }
        T value= get(index1);
        current.value=get(index2);
        current=first;
        for (int i = 0; i < index2; i++) {
            current=current.next;
        }
        current.value=value;
    }
    public void Join(MyLinkedList<T> obj){
        if(size>0 && obj.size()>0){
            for (int i = 0; i < obj.size(); i++) {
                add(obj.get(i));
            }
        }
    }
    public void clone(MyLinkedList<T> list){
        list.removeList();
        for (int i = 0; i < size; i++) {
            list.add(get(i));
        }
    }
    public T[] ToArray(){
        if(size>0){
            Object[] array = new Object[size];
            for (int i = 0; i < size; i++) {
                array[i] = get(i);
            }
            return (T[]) array;
        }
        else
        {
            System.out.println("Your list is empty");
            return null;
        }
    }
    public boolean CompareLists(MyLinkedList<T> list){
        if(size!=list.size())
            return false;
        else
        {
            for (int i = 0; i < size; i++) {
                if(!equals(get(i),list.get(i)))
                    return false;
            }
            return true;
        }
    }
    public void set(int index, T value){
        checkIndex(index);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
    }
    public Node<T> getMiddle(){
        Node<T> slow = first;
        Node<T> fast = first;
        while(fast!=null && slow!= null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
