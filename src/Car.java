// Øvelse 2: Definerer underklassen Car, der nedarver fra Vehicle
class Car extends Vehicle {
    // Konstruktør i underklassen, der kalder superklassens konstruktør
    Car(String type) {
        super(type);
        System.out.println("Car constructor");
    }

    // Øvelse 3: Overskriver move() metoden i underklassen
    @Override
    public void move() {
        System.out.println("Car is driving");
    }

    // Overloading metode i underklassen (Øvelse 3)
    @Override
    public void move(int speed) {
        System.out.println("Car is driving at " + speed + " km/h");
    }

    // Øvelse 6: Metode til at vise maxSpeed felt
    public void printMaxSpeed() {
        System.out.println("Max speed of car: " + maxSpeed);
    }
}
