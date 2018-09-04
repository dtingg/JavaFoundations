import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateHasMap {

    public static void main(String[] args){
        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("WA", "Washington");
        m1.put("OR", "Oregon");
        m1.put("CA", "California");
        m1.put("NY", "New York");
        m1.put("CO", "Colorado");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a state abbreviation (WA, OR, CA, NY, CO): ");

        String x = in.nextLine();

        System.out.println(m1.get(x));
        in.close();
        }
    }