package week5.arrayList;

public class DynamicArray {
    private String[] strings;
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
            strings = new String[length];
        }
    }

    DynamicArray() {
        length = 8;
        strings = new String[length];
        countOfElements = 0;
    }

    private void grow() {
        if (countOfElements >= length / 2) {
            String array[] = new String[2 * length];
            for (int i = 0; i < countOfElements; i++) {
                array[i] = strings[i];
            }
            length = length * 2;
            strings = array;
        }
    }

    public void add(String string) {
        strings[countOfElements] = string;
        countOfElements++;
    }

    public boolean contains(String string) {
        if (length != 0 && countOfElements != 0) {
            for (int i = 0; i < countOfElements; i++) {
                if (strings[i].equals(string))
                    return true;
            }
            return false;
        }
        return false;
    }

    public int lastIndexOf(String string) {
        if (length != 0 && countOfElements != 0) {
            for (int i = countOfElements - 1; i >= 0; i--) {
                if (strings[i].equals(string))
                    return i;
            }
            return -1;
        }
        return -1;
    }

    public int indexOf(String string) {
        if (length != 0 && countOfElements != 0) {
            for (int i = 0; i < countOfElements; i++) {
                if (strings[i].equals(string))
                    return i;
            }
            return -1;
        }
        return -1;
    }

    public void remove(String string) {
        if (contains(string)) {
            remove(indexOf(string));
        }
    }

    public void Print() {
        if (length != 0 && countOfElements != 0)
            for (int i = 0; i < countOfElements; i++) {
                System.out.print(strings[i] + " ");
            }
        else {
            System.out.println("your array is empty");
        }
    }

    public void remove(int index) {
        if (index < countOfElements && length != 0 && countOfElements != 0) {
            for (int i = index; i < countOfElements - 1; i++) {
                strings[i] = strings[i + 1];
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
            String str2 = strings[i];
            strings[i] = strings[j];
            strings[j] = str2;
        }
    }

    public void Sort(SortTypes order) {
        if (order == SortTypes.ASC) {
            sortByAsc();
        } else {
            sortByDesc();
        }
    }

    private void sortByDesc() {
        for (int i = 0; i < countOfElements - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < countOfElements; j++) {
                if (strings[j].compareTo(strings[maxIndex]) > 0)
                    maxIndex = j;
            }
            String temp = strings[maxIndex];
            strings[maxIndex] = strings[i];
            strings[i] = temp;
        }
    }

    private void sortByAsc() {
        for (int i = 1; i < countOfElements; i++) {
            String key = strings[i];
            int j = i - 1;
            while (j >= 0 && strings[j].compareTo(key) > 0) {
                String temp = strings[j];
                strings[j] = strings[j + 1];
                strings[j + 1] = temp;
                j--;
            }
        }
    }
}
