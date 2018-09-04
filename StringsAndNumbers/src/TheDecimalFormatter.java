import java.text.DecimalFormat;

public class TheDecimalFormatter {
    public static void main(String[] args){
        customFormat("###,###.###", 123456.789);
    }

    public static void customFormat(String pattern, double value){
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }
}