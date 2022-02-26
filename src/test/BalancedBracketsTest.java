package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


    @Test
    public void thisArray() {
        int[] thisArray =  {1, 3, 5, 7, 9};
        assertEquals(4, BonusBinarySearch.binarySearch(thisArray, 9));
    }
}
