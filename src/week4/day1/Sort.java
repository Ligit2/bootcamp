package week4.day1;

public class Sort {
    void sort(Student array[], int age) {
        for (int i = 1; i < array.length; i++) {
            age = array[i].age;
            int j = i - 1;
            while (j >= 0 && array[j].age > age) {
                Student temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }

    void sort(Student array[], double weight) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].weight > array[j + 1].weight) {
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false)
                break;
        }
    }

    void sort(Student array[], String name) {
        for (int i = 1; i < array.length; i++) {
            name = array[i].name;
            int j = i - 1;
            while (j >= 0 && array[j].name.compareTo(name) > 0) {
                Student temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }
}
