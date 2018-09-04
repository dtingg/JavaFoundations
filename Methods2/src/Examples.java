public class Examples {
    public static void main(String[] args){
        String str = "Java Class22 todays";
        char [] c = str.toCharArray();

        int firstIndex = str.indexOf("s");
        System.out.println(firstIndex);

        int secondIndex = str.indexOf("s", 9);
        System.out.println(secondIndex);

        int thirdIndex = str.indexOf("s", 10);
        System.out.println(thirdIndex);

        int num = str.indexOf("22");
        System.out.println(num);

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(c[i])){
                System.out.println(c[i]);
            }
        }

        char ch = str.charAt(10);
        System.out.println(ch);
    }
}