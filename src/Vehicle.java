// Øvelse 1: Definere superklasse og underklasse
class Vehicle {
    protected int maxSpeed = 120; // Øvelse 6: Brug af 'protected' modifikator
    String type; // Øvelse 2: Eksempel på felt

    // Konstruktør i superklassen (Øvelse 2)
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }

    // Metode i superklassen
    public void move() {
        System.out.println("Vehicle is moving");
    }

    // Final metode i superklassen (Øvelse 6)
    public final void display() {
        System.out.println("Vehicle display method");
    }

    // Overloading metode (Øvelse 3)
    public void move(int speed) {
        System.out.println("Vehicle is moving at " + speed + " km/h");
    }
}



