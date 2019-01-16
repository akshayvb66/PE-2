import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PowerOfFourTest {

    @Test

    public void test(){

        PowerOfFour test = new PowerOfFour();
        int result = test.FourPower(256);

        assertEquals(1,result);

    }

}