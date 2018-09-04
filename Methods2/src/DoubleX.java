/**
 * When passed a string, it returns true if the first instance of "x" in the string is immediately followed by another "x".
 */
public class DoubleX {
    public static void main(String[] args){
        String test1 = "axxbb";
        String test2 = "axaxax";
        String test3 = "xxxxx";
        String test4 = "xHelxxlo";
        String test5 = "abcdx";

        System.out.println(doubleX(test1));
        System.out.println(doubleX(test2));
        System.out.println(doubleX(test3));
        System.out.println(doubleX(test4));
        System.out.println(doubleX(test5));
    }

    public static boolean doubleX (String str){
        int i = str.indexOf("x");

        //check if there is no x
        if (i == -1) {
            return false;
            //check if next character is out of bounds
        } else if (i+1 == str.length()){
            return false;
        } else {
            char x = str.charAt(i+1);
            return x == 'x';
        }
    }
}