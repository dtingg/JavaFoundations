public class Driver {
    public static void main(String[] args){

        String make = "Honda";
        String model = "Fit";
        int year = 2015;
        String color = "Red";

        Car vehicle = new Car(make, model, year, color);

        System.out.println("Car make is " + vehicle.getMake() + ", model is " + vehicle.getModel() + ", year is " + vehicle.getYear() + ", color is " + vehicle.getColor());
    }
}