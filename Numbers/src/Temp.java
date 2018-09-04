/*
 * Converts temperature types
 */
public class Temp {

    public static void main(String[] args) {

        // Convert 47.2 F to C
        double f = 47.2;
        double fToC = (f - 32) * 5/9;
        System.out.println(fToC);

        // Convert 0 C to F
        double c = 0;
        double cToF = (c * 9/5) + 32;
        System.out.println(cToF);

        // Convert 275 K to F
        double k = 275;
        double kToF = (k - 273.15) * 9/5 + 32;
        System.out.println(kToF);

        // Use boolean to see if K to F is less than C to F conversion
        boolean test = kToF < cToF;
        System.out.println(test);
    }
}