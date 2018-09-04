/**
 * When passed a string, it returns a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 */
public class StringX {
    public static void main(String[] args) {
        String test1 = "xxHxix";
        String test2 = "abxxxcd";
        String test3 = "xabxxcdx";

        System.out.println(stringX(test1));
        System.out.println(stringX(test2));
        System.out.println(stringX(test3));
    }

    public static String stringX(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if ((i == 0) && str.length() > 0) {
                result += str.charAt(i);
                continue;
            }
            if (i == str.length() - 1) {
                result += str.charAt(i);
                continue;
            } if (str.charAt(i) == 'x') {
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }
}