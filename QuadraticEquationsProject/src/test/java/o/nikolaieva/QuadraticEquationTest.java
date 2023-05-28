package o.nikolaieva;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEquationTest {

    @Test
    public void oneRootTest() {
        QuadraticEquation equation = new QuadraticEquation(2, -4, 2);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        equation.resolve();

        String expectedOutput = "Рівняння 2.0x^2 + -4.0x + 2.0 = 0 має один корінь: x = 1.0\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void twoRootsTest() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        equation.resolve();

        String expectedOutput = "Рівняння 1.0x^2 + -3.0x + 2.0 = 0 має корені: x1 = 2.0; x2 = 1.0\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void noRootsTest() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        equation.resolve();

        String expectedOutput = "Рівняння 1.0x^2 + 2.0x + 3.0 = 0 не має дійсних коренів\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}