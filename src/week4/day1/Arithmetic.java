package week4.day1;

import java.io.IOException;
import java.util.Scanner;

public class Arithmetic {
    int []array;
    Arithmetic(){
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = scanner.nextInt();
        }
    }
    Arithmetic(int array[]){
        this.array= new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }
    int min(){
        if(array.length!=0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i]<min)
                    min = array[i];
            }
            return min;
        }
        return -1;
    }
    int max(){
        if(array.length!=0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i]>max)
                    max = array[i];
            }
            return max;
        }
        return -1;
    }
    void insertionSort(){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < array.length-1; i++) {
            int indexOfMin=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[indexOfMin])
                    indexOfMin = j;
            }
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
        }
    }
     void bubbleSortOptimization() {
        if(array.length!=0) {
            for (int i = 0; i < array.length; i++) {
                boolean check = false;
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        check = true;
                    }
                }
                if (check == false)
                    break;
            }
        }
        return;
    }
     int binarySearch(int number) {
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (array[middle] == number) {
                return middle;
            }
            if (array[middle] > number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return -1;
    }
    void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    void option() throws IOException {
        System.out.println("Input 1 for getting min element");
        System.out.println("Input 2 for getting max element");
        System.out.println("Input 3 for bubble sort");
        System.out.println("Input 4 for binary search");
        System.out.println("Input 5 for insertion sort");
        System.out.println("Input 6 for selection sort");
        char c = (char )System.in.read();
        switch(c){
            case '1':
                System.out.println(min());
            case '2': {
                System.out.println(max());
            }
            case '3': {
                bubbleSortOptimization();
                print();
            }
            case '4':
            {
                bubbleSortOptimization();
                Scanner scanner = new Scanner(System.in);
                System.out.println("please input the number");
                int number = scanner.nextInt();
                System.out.println(binarySearch(number));
            }
            case '5': {
                insertionSort();
                print();
            }
            case '6': {
                selectionSort();
                print();
            }
            default:{
                System.out.println("No such option");
            }
        }
    }
}
