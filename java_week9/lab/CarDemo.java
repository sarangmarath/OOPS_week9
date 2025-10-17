// File: CarDemo.java
class Car {
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car[Brand: " + brand + ", Model: " + model + ", Price: $" + price + "]";
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 30000);
        
        System.out.println(car); // invokes toString()
        System.out.println("Class Name: " + car.getClass().getName());
        System.out.println("Simple Class Name: " + car.getClass().getSimpleName());
    }
}
