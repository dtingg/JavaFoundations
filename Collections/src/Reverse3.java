import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};

        System.out.println(Arrays.toString(myArray));

        myArray = rearrange(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static int[] rearrange(int[] myArray) {
        int[] copyArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[myArray.length - i - 1];
        }
        return copyArray;
    }
}