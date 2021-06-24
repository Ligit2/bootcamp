package week5.day5;


public class DynamicArray {
    private Object[] objects;
    private int countOfElements;
    private int length = 10;


    public int size() {
        return countOfElements;
    }

    public int getLength() {
        return length;
    }

    DynamicArray(int size) {
        if (size > 0) {
            length = size;
            countOfElements = 0;
            objects = new Object[length];
        }
    }

    private Object getInteger(Object object) {
        return (Integer) object;
    }

    private Object getString(Object object) {
        return (String) object;
    }
    private Object getDouble(Object object){
        return (Double)object;
    }
    public Object getObject(int index){
       if(objects[index] instanceof Integer)
          return  getInteger(objects[index]);
       else if(objects[index] instanceof String)
           return  getString(objects[index]);
       else
       {
           return  getDouble(objects[index]);
       }
    }

    DynamicArray() {
        length = 8;
        objects = new Object[length];
        countOfElements = 0;
    }

    private void grow() {
        if (countOfElements >= length / 2) {
            Object array[] = new Object[2 * length];
            for (int i = 0; i < countOfElements; i++) {
                array[i] = objects[i];
            }
            length = length * 2;
            objects = array;
        }
    }

    public void add(Object object) {
        objects[countOfElements] = object;
        countOfElements++;
    }

    public boolean contains(Object object) {
        if (length != 0 && countOfElements != 0) {
            for (int i = 0; i < countOfElements; i++) {
                if (objects[i].equals(object))
                    return true;
            }
            return false;
        }
        return false;
    }

    public int lastIndexOf(Object object) {
        if (length != 0 && countOfElements != 0) {
            for (int i = countOfElements - 1; i >= 0; i--) {
                if (objects[i].equals(object))
                    return i;
            }
            return -1;
        }
        return -1;
    }

    public int indexOf(Object string) {
        if (length != 0 && countOfElements != 0) {
            for (int i = 0; i < countOfElements; i++) {
                if (objects[i].equals(string))
                    return i;
            }
            return -1;
        }
        return -1;
    }

    public void remove(Object string) {
        if (contains(string)) {
            remove(indexOf(string));
        }
    }

    public void Print() {
        if (length != 0 && countOfElements != 0)
            for (int i = 0; i < countOfElements; i++) {
                System.out.print(objects[i] + " ");
            }
        else {
            System.out.println("your array is empty");
        }
    }

    public void remove(int index) {
        if (index < countOfElements && length != 0 && countOfElements != 0) {
            for (int i = index; i < countOfElements - 1; i++) {
                objects[i] = objects[i + 1];
            }
            countOfElements--;
        }
    }

    public void removeAll(String str[]) {
        if (str != null) {
            for (int i = 0; i < str.length; i++) {
                remove(str[i]);
            }
        }
    }

    public void swap(int i, int j) {
        if (i < countOfElements && j < countOfElements) {
            if (j == i) {
                return;
            }
            Object str2 = objects[i];
            objects[i] = objects[j];
            objects[j] = str2;
        }
    }
}
