class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}
class Car extends Vehicle {
    String brand;
    Car(String vBrand, String cBrand) {
        super(vBrand);
        brand = cBrand;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Car Brand: " + brand);
        System.out.println("Parent Brand: " + super.brand);
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "BMW");
        c.display();
    }
}