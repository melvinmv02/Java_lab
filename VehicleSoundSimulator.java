class Vehicle {
    void makeSound() {
        System.out.println("Vehicle makes a generic sound.");
    }
}

class MotorVehicle extends Vehicle {
    @Override
    void makeSound() {
        System.out.println("Motor vehicle makes an engine sound.");
    }
}

class Car extends MotorVehicle {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Car makes a specific horn sound.");
    }
}

public class VehicleSoundSimulator {
    public static void main(String[] args) {

        Vehicle v = new Car();

        // Car version runs because of runtime polymorphism.
        // The actual object is Car, so Java calls Car's overridden method.
        v.makeSound();
    }
}