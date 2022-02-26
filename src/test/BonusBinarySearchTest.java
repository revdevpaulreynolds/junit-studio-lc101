package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    @Test
    public void checkThisArray() {
        int[] thisArray = {1, 3, 5, 7, 9};
        assertEquals(4, BonusBinarySearch.binarySearch(thisArray, 9));
    }
}
