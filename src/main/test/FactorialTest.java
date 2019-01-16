import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class FactorialTest {

    Factorial test;
    @Before
    public void setUp() throws Exception {

        Factorial test = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }


    @Test
    public void Factorial1Success() {
        String actualStr = test.Factorial(2);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void Factorial2Success() {
        String actualStr = test.Factorial(4);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24\n";
        assertEquals(actualStr,expectedStr);
    }
}