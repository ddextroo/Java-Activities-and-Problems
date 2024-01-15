class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice; // Default implementation, no discount for a regular car
    }

    // Getters and setters for the fields if needed

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Truck extends Car {
    private int weight;
    
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.10; // 10% discount
        } else {
            return super.getSalePrice() * 0.20; // 20% discount
        }
    }
}
public class final4 {
    public static void main(String[] args) {
        // Test Car
        Car car = new Car(120, 25000, "Blue");
        System.out.println("Car Sale Price: $" + car.getSalePrice());

        // Test Truck
        Truck truck = new Truck(80, 35000, "Red", 2500);
        System.out.println("Truck Sale Price: $" + truck.getSalePrice());
    }
}