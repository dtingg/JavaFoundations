import java.util.*;

public class Examples {
    public static void main(String[] args){
        int [] myArray;
        myArray = new int[5];

        int [] myArray2 = new int [5];
        myArray[0] = 1;
        myArray[1] = 2;

        System.out.println(Arrays.toString(myArray));

        //hero list of strings
        List<String> heroList = new ArrayList<String>();
        heroList.add("Superman");
        heroList.add("Batman");
        System.out.println(heroList);

        //list of numbers
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(52);
        nums.add(34);
        System.out.println(nums);

        String num = "1";
        int x = Integer.parseInt(num);
        System.out.println(x);

        //set demo
        int [] count = {34, 22, 10, 56, 80};
        Set<Integer> set1 = new HashSet<Integer>();

        for (int i = 0; i < count.length; i++){
            set1.add(count[i]);
        }

        System.out.println(set1);

        //tree set
        TreeSet<Integer> set2 = new TreeSet<Integer>(set1);
        System.out.println(set2);

        //map
        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("a", "candy");
        m1.put("b", "dirt");
        m1 = mapB(m1);
        System.out.println(m1.toString());
    }

    public static Map<String, String> mapB (Map<String, String> map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
            map.remove("a");
        }
        return map;
    }
}