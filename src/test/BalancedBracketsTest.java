package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testOnlyBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsWithSingleWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Whoa]"));
    }

    @Test
    public void singleNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[You[are]nifty]"));
    }

    @Test
    public void firstBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void doubleNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]Blah]]"));
    }

    @Test
    public void tripleNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[][[][]]]]"));
    }

    @Test
    public void bracketsOnBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][[[]][][]][[[[][]]][]]"));
    }

}
