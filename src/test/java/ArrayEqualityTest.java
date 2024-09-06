import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 4, 5, 7 }; //changed 3 to 4
        assertArrayEquals(a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 4 }, { 5, 7 }, { 11, 13 } }; //changed 3 to 4 in first array
        assertArrayEquals(a11, a12);
    }

    //NEW TEST METHOD
    @Test
    public void compareArraysOfDifferentTypes() {
        String[] arrayA = { "1.0", "2.0", "3.0" }; //arrayA has double numbers that are strings
        double[] arrayB = {1.0, 2.0, 3.0}; // arrayB has numbers that are doubles

        double[] arrayC = new double[arrayA.length]; //Third array is made to store arrayA's string numbers converted to double numbers

        // go through arrayA and convert each string to a double value
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = Double.parseDouble(arrayA[i]);
        }
        assertArrayEquals(arrayC, arrayB); //test if arrayC is equal to arrayB
    }

    // When running tests, the first 2 should fail because I modifed the arrays to make them unequal, and the last test should pass.
}
