package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    private final TwoNumbersSum sum = new TwoNumbersSum();

    @Test
    public void testSimpleSum() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4));
        assertEquals(Arrays.asList(4, 6), sum.addTwoNumbers(first, second));
    }

    @Test
    public void testCarryOver() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        assertEquals(Arrays.asList(1, 0, 0), sum.addTwoNumbers(first, second));
    }

    @Test
    public void testDifferentLengths() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9, 9));
        assertEquals(Arrays.asList(1, 0, 0), sum.addTwoNumbers(first, second));
    }

    @Test
    public void testZeroSum() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0));
        assertEquals(Arrays.asList(0), sum.addTwoNumbers(first, second));
    }

    @Test
    public void testNoSideEffects() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4));
        sum.addTwoNumbers(first, second);
        assertEquals(Arrays.asList(1, 2), first);  // Verifica que no se invirtieron
        assertEquals(Arrays.asList(3, 4), second);
    }
}
