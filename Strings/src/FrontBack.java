
public class FrontBack {

    public static void main(String[] args) {
        String str = "code";
        int leng = str.length();
        String str2 = str.substring(leng-1) + str.substring(1, leng-1) + str.substring(0, 1);
        System.out.println(str2);
    }
}