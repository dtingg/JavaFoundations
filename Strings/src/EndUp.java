
public class EndUp {

    public static void main(String[] args) {
        String str = "hi there";
        int len = str.length();
        String end = str.substring(len-3);
        System.out.println(str.substring(0, len-3) + end.toUpperCase());
    }
}