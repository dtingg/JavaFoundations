
public class JustStrings {

    public static void main(String[] args) {
        //precision 2 decimal places
        double doubleVar = 4.0/3.0;

        int intVar = 3;
        String stringVar = "August";

        String dv = String.format("The value is %.2f",  doubleVar);
        System.out.println(dv);

        String iv = String.format("The value is %d", intVar);
        System.out.println(iv);

        String sv = String.format("The value is %s",  stringVar);
        System.out.println(sv);

        StringBuilder builder = new StringBuilder();
        builder.append(dv);
        builder.append(" ");
        builder.append(iv);
        builder.append(" ");
        builder.append(sv);

        System.out.println(builder);
    }
}