public class StringLength {
    public static void main(String[] args){
        String a = "rainbow";
        String b = "clouds";

        int total = totalLength(a, b);
        double average = averageLength(a, b);

        System.out.println("Total Length = " + total);
        System.out.println("Average Length = " + average);
    }

    private static int totalLength(String a, String b) {
        int totalLength = a.length() + b.length();
        return totalLength;
    }

    private static double averageLength(String a, String b) {
        double averageLength = (a.length() + b.length())/2.0;
        return averageLength;
    }
}