package IntList;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard() {
        IntList lst = IntList.of(2,3,4,5,6,1);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 4 -> 25 -> 6 -> 1", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(6,8,10);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("6 -> 8 -> 10", lst.toString());
        assertFalse(changed);
    }
}
