package rvt;
import java.util.ArrayList;

public class BinarySearch {

    public static int binarySearch(ArrayList<Book> books, int searchedID) {
        int low = 0;
        int high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (books.get(mid).getId() < searchedID) {
                low = mid + 1;
            } else if (books.get(mid).getId() > searchedID) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    
}
