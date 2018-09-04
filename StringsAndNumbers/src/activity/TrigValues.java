package activity;

public class TrigValues {
    public static void main(String[] args){
        trig (45);
        trig (90);
    }

    //degrees, not radians
    public static void trig (double degrees){

        double radians = degrees * (Math.PI/180);

        double sinAns = Math.sin(radians);
        double cosAns = Math.cos(radians);
        double tanAns = Math.tan(radians);

        //print the sine, cosine, tagent for that angle.  Format using two decimal places
        System.out.println(String.format("%.2f", sinAns));
        System.out.println(String.format("%.2f", cosAns));
        System.out.println(String.format("%.2f", tanAns));
    }
}