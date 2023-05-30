package o.nikolaieva;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEquationTest {

    @Test
    public void oneRootTest() {
        QuadraticEquation equation = new QuadraticEquation(2, -4, 2);
        double[] expectedOutput = {1.0};
        double[] actualOutput = equation.resolve();
        assertArrayEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void twoRootsTest() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        double[] expectedOutput = {2.0, 1.0};
        double[] actualOutput = equation.resolve();
        assertArrayEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void noRootsTest() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
        double[] expectedOutput = new double[0];
        double[] actualOutput = equation.resolve();
        assertArrayEquals(expectedOutput, actualOutput, 0.0001);
    }
}