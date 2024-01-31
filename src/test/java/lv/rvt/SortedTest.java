package lv.rvt;

import org.junit.Test;

import rvt.Sorted;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class SortedTest {

    @Test
    public void testSmallest() {
        int[] array = { 6, 5, 8, 7, 11, -4 };
        assertEquals(-4, Sorted.smallest(array));
    }

        
    public void testIndexOfSmallestFrom() {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Sorted.indexOfSmallestFrom(numbers, 0));
        System.out.println(Sorted.indexOfSmallestFrom(numbers, 1));
        System.out.println(Sorted.indexOfSmallestFrom(numbers, 2));
    }
    public void testSwap() {
        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        Sorted.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        Sorted.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));
    }
    public void testSort() {
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        Sorted.sort(numbers3);
        

    }
}
