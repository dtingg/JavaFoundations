package activity;

import java.text.DecimalFormat;

public class PrettyNumbers {
    public static void main(String[] args){
        decimalFormat("##,##,##.###", 123456.789);
    }

    public static void decimalFormat (String pattern, double value){
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(output);
    }
}