public class LoopingArrays {
    public static void main(String[] args){
        String [] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int length = monthsArray.length;

        // for loop
        for (int x = 0; x < length; x++){
            System.out.print(monthsArray[x] + " ");
        }

        // print empty line
        System.out.println();

        //for each
        for (String t: monthsArray){
            System.out.print(t + " ");
        }

        // print empty line
        System.out.println();

        // while loop
        int i = 0;
        while (i != length){
            System.out.print(monthsArray[i] + " ");
            i ++;
        }
    }
}