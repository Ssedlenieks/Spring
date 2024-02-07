package lv.rvt.exercises;

import org.junit.Test;

import rvt.exercises.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = { 1, 3, 5, 7, 9 };
        int valueToSearch = 3;
        int index = BinarySearch.binarySearch(arr, valueToSearch);
        System.out.println("Found " + valueToSearch + " at index " + index);
    }
    
}
