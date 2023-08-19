// Define an interface for vehicles that can move
interface Moveable {
    void move();
}

// Implementing classes
class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}

class Bicycle implements Moveable {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling.");
    }
}

class Airplane implements Moveable {
    @Override
    public void move() {
        System.out.println("Airplane is flying.");
    }
}

// A class that interacts with different types of vehicles
class TravelAgency {
    void sendOnTrip(Moveable vehicle) {
        System.out.print("Sending vehicle on a trip: ");
        vehicle.move();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        Moveable car = new Car();
        Moveable bicycle = new Bicycle();
        Moveable airplane = new Airplane();

        travelAgency.sendOnTrip(car);
        travelAgency.sendOnTrip(bicycle);
        travelAgency.sendOnTrip(airplane);

    }
}
