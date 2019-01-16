import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class EvenNumTestTest {


    @Test

    public void NumTestSuccess(){

        EvenNumTest test=new EvenNumTest();
        boolean result=test.IsEven(23);

        assertEquals(false,result);

    }

    @Test

    public void NumTestFailure(){

        EvenNumTest test=new EvenNumTest();
        boolean result=test.IsEven(23);

        assertNotEquals(true,result);

    }
}