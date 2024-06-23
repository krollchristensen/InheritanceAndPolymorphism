// Øvelse 4: Definere underklassen Bicycle
class Bicycle extends Vehicle {
    Bicycle(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is pedaling");
    }
}
