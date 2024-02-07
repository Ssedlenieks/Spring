package rvt.exercises;


public class BinarySearch {

    public static int binarySearch(int[] arr, int valueToSearch) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == valueToSearch) {
                index = middle;
                break;
            } else if (arr[middle] < valueToSearch) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return index;
    }
}
