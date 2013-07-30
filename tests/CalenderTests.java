import org.junit.Test;

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
}
