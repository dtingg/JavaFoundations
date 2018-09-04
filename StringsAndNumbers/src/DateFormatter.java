import java.util.Calendar;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        //month day date
        String dTime = String.format("%tB %te %tY", d, d, d);
        System.out.println(dTime);

        Date d1 = new Date (2018-1900, 8-1, 23);
        System.out.println(d1.toString());

        //Using calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime().toString());
        String cTime = String.format("%tB %te %tY", c, c, c);
        System.out.println(cTime);
    }
}