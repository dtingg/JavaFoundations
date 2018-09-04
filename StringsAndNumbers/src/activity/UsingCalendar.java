package activity;

import java.util.Calendar;

public class UsingCalendar {
    public static void main(String[] args){

        //get instance of calendar
        Calendar c = Calendar.getInstance();

        //set date to stock market crash, black tuesday, october 29, 1929
        c.set(1929, 9, 29);

        System.out.println("The stock market crashed on October 29, 1929");
        System.out.println(String.format("The stock market crashed on %tm/%td/%ty", c, c, c));
    }
}