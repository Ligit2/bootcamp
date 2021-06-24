package week6.day1;

public class CircleList<T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    private void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be > 0");
        }
    }

    private int indexOf(T obj) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (equals(current.value,obj))
                return i;
            current = current.next;
        }
        return -1;
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
    public void add(T obj) {
        Node<T> node = new Node<>(obj);
        if (first == null) {
            first = node;
            node.next = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        node.next = first;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> current = first;
        if (index == 0) {
            if (size == 1) {
                first = null;
                last = null;
                size--;
                return;
            }
            last.next = first.next;
            first = first.next;
            size--;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == size - 1) {
            last = current;
        }
        current.next = current.next.next;
        size--;
    }

    @Override
    public void remove(T obj) {
        if (indexOf(obj) != -1) {
            remove(indexOf(obj));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public void print(int index) {
        checkIndex(index);
        for (int i = index; i < size; i++) {
            System.out.println(get(i) + " ");
        }
        for (int i = 0; i < index; i++) {
            System.out.println(get(i) + " ");
        }
    }

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
    public boolean equals(T obj1,T obj2){
        if(obj2==null && obj1==null)
            return true;
        else if(obj2.equals(obj1))
            return true;
        else
            return false;

    }

    public void removeAll(T obj){
        while(contains(obj)){
            remove(obj);
        }
    }
    public void add(int index, T obj){
        Node<T> node = new Node<>(obj);
        Node<T> current = first;
        if(index==0){
            if(first ==null){
                first=node;
                last=node;
                node.next=node;
                size++;
                return;
            }
            node.next = first;
            last.next=node;
            first=node;
            size++;
            return;
        }
        checkIndex(index);
        for (int i = 0; i < index-1; i++) {
            current=current.next;
        }
        node.next = current.next;
        current.next=node;
        size++;
    }
    public Node<T> f(){
        Node<T> slow = first;
        Node<T> fast =first;
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return slow;
        }
        return null;
    }

}
