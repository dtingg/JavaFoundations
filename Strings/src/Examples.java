
public class Examples {

    public static void main (String [] args) {
        //slicing strings
        String str = "Java";
        String str2 = str.substring(2);
        System.out.println(str2);

        String str3 = str.substring(1);
        System.out.println(str3);

        //length of string
        System.out.println(str.length());

        String greeting = "Not too long.";
        int len = greeting.length();
        System.out.println("The length of the greeting is " + len);

        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append(" ");
        builder.append("world");
        System.out.println(builder.toString());
    }
}