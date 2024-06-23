import java.util.ArrayList;
/*
Øvelse 1: Definerer Vehicle og Car klasserne, hvor Car nedarver fra Vehicle.
Øvelse 2: Tilføjer konstruktør i Vehicle og Car klasserne, bruger super nøgleordet.
Øvelse 3: Overrider move() metoden og overloader move(int speed) metoden i Car klassen.
Øvelse 4: Tilføjer Bicycle klassen og demonstrerer polymorfi.
Øvelse 5: Introducerer abstrakte klasser Appliance, WashingMachine, og Refrigerator.
Øvelse 6: Bruger protected og final modifikatorer, samt metoden printMaxSpeed() i Car klassen.
Øvelse 8: Demonstrerer casting og brug af instanceof med Device og Smartphone.
Øvelse 9: Arbejder med ArrayList og polymorfi med Instrument, Guitar, og Piano klasserne.
 */




public class Main {
    public static void main(String[] args) {
        // Øvelse 1 og Øvelse 2: Test af arv og brug af 'super' nøgleordet
        Vehicle myCar = new Car("Sedan");
        myCar.move(); // Output: Car is driving
        ((Car) myCar).printMaxSpeed(); // Output: Max speed of car: 120
        myCar.display(); // Output: Vehicle display method

        // Øvelse 3: Test af method overloading
        Car car = new Car("Coupe");
        car.move(80); // Output: Car is driving at 80 km/h

        // Øvelse 4: Test af polymorfi
        Vehicle myBicycle = new Bicycle("Mountain Bike");
        myBicycle.move(); // Output: Bicycle is pedaling

        // Øvelse 5: Test af abstrakte klasser og polymorfi
        Appliance appliance1 = new WashingMachine();
        Appliance appliance2 = new Refrigerator();
        appliance1.turnOn(); // Output: Washing machine is now on
        appliance2.turnOn(); // Output: Refrigerator is now on

        // Øvelse 8: Test af casting og `instanceof`
        Device myDevice = new Smartphone();
        myDevice.start(); // Output: Device is starting

        // Down-casting
        if (myDevice instanceof Smartphone) {
            Smartphone myPhone = (Smartphone) myDevice;
            myPhone.browseInternet(); // Output: Browsing internet on smartphone
        }

        // Øvelse 9: Test af ArrayList og polymorfi
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar());
        instruments.add(new Piano());

        for (Instrument instrument : instruments) {
            instrument.play();
        }
        // Output: Playing guitar
        //         Playing piano

    }
}