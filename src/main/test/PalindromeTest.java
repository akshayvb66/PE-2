
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class PalindromeTest {





    @Test

    public void test()
    {
        Palindrome test = new Palindrome();

        String result= test.stringreverse("colour");

        assertEquals("ruoloc",result);

    }

    @Test

    public void testFailure()
    {
        Palindrome test1 = new Palindrome();

        String result = test1.stringreverse("rotor");

        assertEquals("rotor",result);


    }
}