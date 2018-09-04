/*
 * Find max values
 */
public class Ranges {

    public static void main(String[] args) {

        // Declare a byte variable and assign it to max value
        byte x = 127;
        System.out.println(x);

        // Add 1 to the max value.  What happens? (Goes to the min value!)
        x += 1;
        System.out.println(x);

        // Print the max value of an integer and a double (use autoboxing)
        int y = Integer.MAX_VALUE;
        System.out.println(y);

        double z = Double.MAX_VALUE;
        System.out.println(z);

        // What happens if you add 1 to the max value of an integer?  (Goes to the min value) A double? (Nothing!)
        y++;
        System.out.println(y);

        z++;
        System.out.println(z);
    }
}