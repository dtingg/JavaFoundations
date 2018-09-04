public class Car2 {
    private String make;
    private String model;
    private int year;
    private String color;
    private static int nextId = 1;
    private int id;

    public Car2(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        setId();
    }

    public void setId(){
        this.id = nextId++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}