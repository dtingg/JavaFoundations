package activity;

public class Truck {
    public static void main(String[] args) {
        try {
            truckWeight(50000);
        } catch (OverWeightLimit e) {
            System.out.println(e.toString());
        }
    }

    private static void truckWeight(int weight) throws OverWeightLimit{
        if (weight > 10000) {
            throw new OverWeightLimit("Truck is overweight");
        } else {
            System.out.println("Vehicle is good to pass");
        }
    }
}