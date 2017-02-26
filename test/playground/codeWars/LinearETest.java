package playground.codeWars;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinearETest {

    @Test
    public void test1() throws Exception {
        String inputFile = "input01.txt";
        String resultFile = "result01.txt";

        System.setIn(this.getClass().getResourceAsStream(inputFile));
        String expectedOutput = IOUtils.toString(this.getClass().getResourceAsStream(resultFile));

        LinearE linearE = new LinearE();
        linearE.init();
        linearE.solve();

        System.err.println(linearE.getResult());
        assertEquals(expectedOutput, linearE.getResult());
    }

}