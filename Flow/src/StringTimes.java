
public class StringTimes {

    public static void main(String[] args) {
        String str = "code";
        int n = 3;
        String y = "";

        for (int i = 0; i != n; i++) {
            y += str;
        }
        System.out.println(y);
    }
}