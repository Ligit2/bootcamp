package week6.day1;

public class DoubleLinkedList<T> implements MyList<T> {
   private DoubleNode<T> first;
   private DoubleNode<T> last;
   private int size;


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
        DoubleNode<T> current;
        if (index <= size / 2) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current.value;
    }

    @Override
    public void add(T obj) {
        DoubleNode<T> node = new DoubleNode<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        node.previous = last;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        DoubleNode<T> current;
        if(index == 0){
            if(size==1){
                first=null;
                size--;
                return;
            }
            first = first.next;
            first.previous =null;
            size--;
            return;
        }
        if(index == size-1){
            last = last.previous;
            last.next = null;
            size--;
            return;
        }
        if(index<=size/2){
            current = first;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            current.next=current.next.next;
            current.next.previous = current;
        }
        else{
            current = last;
            for (int i = size-1; i >index+1; i++) {
                current=current.previous;
            }
            current.previous= current.previous.previous;
            current.previous.next=current;
        }
        size--;
    }
   private int indexOf(T obj){
        DoubleNode<T> current = first;
       for (int i = 0; i < size; i++) {
           if(equals(current.value,obj))
               return i;
           current = current.next;
       }
       return -1;
   }

    @Override
    public void remove(T obj) {
        if(indexOf(obj)!=-1)
        {
            remove(indexOf(obj));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        if(indexOf(obj)!=-1)
            return true;
        return false;
    }
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        DoubleNode<T> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if(i < size-1){
                result.append(" , ");
            }
            current=current.next;
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
        DoubleNode<T> node = new DoubleNode<>(obj);
        DoubleNode<T> current = first;
        if(index==0){
            if(first ==null){
                first=node;
                size++;
                return;
            }
            node.next = first;
            first.previous=node;
            first=node;
            size++;
            return;
        }
        checkIndex(index);
        for (int i = 0; i < index-1; i++) {
            current=current.next;
        }
        node.next = current.next;
        current.next.previous=node;
        current.next=node;
        node.previous=current;
        size++;
    }
}
