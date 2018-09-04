
public class Examples {

    public static void main(String[] args) {

        // if statement short way
        boolean seahawksWin = true;

        String afterParty = (seahawksWin) ? "Party till 4 AM" : "Call in sick tomorrow";

        System.out.println(afterParty);

        // if statement traditional way
        if (seahawksWin)  {
            System.out.println("Party");
        } else {
            System.out.println("Caleb quits");
        }

        // Else if statements
        int iPhoneCost = 1000;

        if (iPhoneCost >= 1000) {
            System.out.println("Buy last year's model");
        } else if (iPhoneCost >= 500 && iPhoneCost <1000) {
            System.out.println("Buy the phone");
        } else if (iPhoneCost < 500) {
            System.out.println("Scam run");
        }

        // Switch statements
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("Num is 1");
                break;
            case 2:
                System.out.println("Num is 2");
                break;
            case 3:
                System.out.println("Num is 3");
                break;
            default:
                System.out.println("Num is any one of these");
        }

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello num " + i);
        }

        //while loop
        int i = 1;
        while (i < 5) {
            System.out.println("Stuck in loop");
            i++;
        }
    }
}
