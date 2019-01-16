import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MemberInfoTest {
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        MemberInfo test = new MemberInfo();
        //MemberVariable obj2=new MemberVariable();
    }
    @Test
    public void MemberTestSuccess()
    {
        MemberInfo test = new MemberInfo();


        String expectedValue2="Name : Harry";

        String actualValue2=test.MemberName("Name");

        assertEquals(expectedValue2,actualValue2);

        int expectedValue3=30;

        int actualValue3=test.MemberAge("Age");

        assertEquals(expectedValue3,actualValue3);

        String expectedValue4="2500.0";

        String actualValue4=test.MemberSalary("Salary");

        assertEquals(expectedValue4,actualValue4);

    }

    @Test
    public void MemberTestFailure()
    {
        MemberInfo test = new MemberInfo();


        String expectedValue1="";

        String actualValue1=test.MemberAge("DOB");

        assertEquals(expectedValue1,actualValue1);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
         test = null;
    }

}