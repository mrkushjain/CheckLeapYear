/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calender {
    private final int LEAPYEARDIVIDER =4;
    private final int LEAPYEARNONDIVIDER=100;
    public boolean isLeapYear(int givenYear) {
        if(givenYear%LEAPYEARDIVIDER==0 && givenYear%LEAPYEARNONDIVIDER !=0)
            return true;
        return  false;
    }
}
