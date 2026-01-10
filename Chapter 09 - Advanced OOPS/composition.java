class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    String color;
    Engine engine;

    Car(String model, String color, String engineType) {
        this.model = model;
        this.color = color;
        this.engine = new Engine(engineType);
    }

    void displayInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Engine Type: " + this.engine.type);
    }
}

public class composition {
    public static void main(String[] args) {
        // Composition ==> Represents a part-of relationship between objects
        //                 Allows complex objects to be constructed from smaller objects

        // Once Car is instantiated the Engine object automatically gets created inside
        // So Engine is composed inside Car object

        Car car = new Car("Aston Martin", "Green", "V8");

        car.displayInfo();
    }
}
