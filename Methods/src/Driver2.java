public class Driver2 {
    public static void main(String[] args){

        String make = "Honda";
        String model = "Fit";
        int year = 2015;
        String color = "Red";

        Car2 vehicle = new Car2(make, model, year, color);

        System.out.println("Car make is " + vehicle.getMake() + ", model is " + vehicle.getModel() + ", year is " + vehicle.getYear() + ", color is " + vehicle.getColor() + ", id is " + vehicle.getId());

        String make2 = "Toyota";
        String model2 = "Corolla";
        int year2 = 1992;
        String color2 = "Blue";

        Car2 vehicle2 = new Car2 (make2, model2, year2, color2);
        System.out.println("Car make is " + vehicle2.getMake() + ", model is " + vehicle2.getModel() + ", year is " + vehicle2.getYear() + ", color is " + vehicle2.getColor() + ", id is " + vehicle2.getId());
    }
}