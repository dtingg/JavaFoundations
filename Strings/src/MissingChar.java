
public class MissingChar {

    public static void main(String[] args) {
        String str = "kitten";
        int n = 3;
        System.out.println(str.substring(0, n) + str.substring (n+1, 6));
    }
}