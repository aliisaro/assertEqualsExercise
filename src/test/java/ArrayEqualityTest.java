import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 4, 5, 7 };
        assertArrayEquals(a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 4 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12);
    }

    //NEW TEST METHOD
    @Test
    public void compareArraysOfDifferentTypes() {
        String[] arrayA = { "1", "2", "3" }; //arrayA has numbers that are strings
        double[] arrayB = {1.0, 2.0, 3.0}; // arrayB has numbers that are doubles
        assertArrayEquals(arrayA, arrayB);
    }
}
