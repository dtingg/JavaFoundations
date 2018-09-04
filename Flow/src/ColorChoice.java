
public class ColorChoice {

    public static void main(String[] args) {
        String color = "Black";

        switch (color) {
            case "Red":
                System.out.println("Your color is Red");
                break;
            case "Yellow":
                System.out.println("Your color is Yellow");
                break;
            case "Blue":
                System.out.println("Your color is Blue");
                break;
            default:
                System.out.println("Not a primary color");
        }
    }
}