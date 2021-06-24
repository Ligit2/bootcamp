package week3.day4;

//The time complexity of the binary search algorithm is O(log n).
// The best-case time complexity would be O(1) when the central index would directly match the desired value.
// The worst-case scenario could be the values at either extremity of the list or values not in the list.
//In the iterative method, the space complexity would be O(1).
// While in the recursive method, the space complexity would be O(log n).

public class binarySearchAlgorithm {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        System.out.println(binarySearch(array, 5));
    }

    public static int binarySearch(int array[], int number) {
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

    public static int binarySearchRecursion(int array[], int number, int left, int right) {
        int middle = left + (right - left) / 2;
        if (left > right) return -1;
        if (number == array[middle])
            return middle;
        else if (number > array[middle]) {
            return binarySearchRecursion(array, number, middle + 1, right);
        }
        return binarySearchRecursion(array, number, left, middle - 1);
    }
}
