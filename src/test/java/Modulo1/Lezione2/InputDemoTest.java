package Modulo1.Lezione2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Nicolo
 */
public class InputDemoTest {
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testLeggiDati() {
        String simulatedInput = "Mario Rossi\n18\n7.8\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        InputDemo demo = new InputDemo();
        demo.leggiDati();

        String output = outContent.toString();

        Assertions.assertTrue(output.contains("Mario Rossi"));
        Assertions.assertTrue(output.contains("18"));
        Assertions.assertTrue(output.contains("7.8"));
        Assertions.assertTrue(output.contains("true"));
    }
}

