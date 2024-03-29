import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalenderTests {

    Calender calender = new Calender();
    @Test
    public void test1_FourIsALeapYear() throws Exception {
        assertTrue(calender.isLeapYear(4));
    }

    @Test
    public void test2_FiveIsNotALeapYear() throws Exception {
        assertTrue(calender.isLeapYear(5));
    }

    @Test
    public void test3_EightIsALeapYear() throws Exception {
        assertTrue(calender.isLeapYear(8));
    }

    @Test
    public void test4_HunderedIsNotALeapYear() throws Exception {
        assertFalse(calender.isLeapYear(100));
    }

    @Test
    public void test5_TwoHunderedIsNotALeapYear() throws Exception {
        assertFalse(calender.isLeapYear(200));
    }

    @Test
    public void test6_FourHunderedIsALeapYear() throws Exception {
        assertTrue(calender.isLeapYear(400));
    }

    @Test
    public void test7_EightHunderedIsALeapYear() throws Exception {
        assertTrue(calender.isLeapYear(800));
    }


}
