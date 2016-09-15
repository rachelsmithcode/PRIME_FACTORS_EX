package assignments.prime_factors_ex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by RachelSmith on 15/09/2016.
 */
public class PrimeFactorsTests {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printsABlankListFor1() throws Exception {
        new PrimeFactors().generate(1);
        assertEquals("[]\n", outContent.toString());
    }

    @Test
    public void printsAListOfPrimeFactorsOf30() throws Exception {
        new PrimeFactors().generate(30);
        assertEquals("[2, 3, 5]\n", outContent.toString());
    }


}
