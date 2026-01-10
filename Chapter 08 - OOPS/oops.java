
// class Car --> blueprint
class Car {
    // attributes
    String name;
    String color;
    double price;

    // constructor --> used to initialize and construct objects when creating them
    Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.price = 100000; // not provided so default value in every object
        numberOfCars++;
    }
    // constructors can be overloaded
    Car(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
        numberOfCars++;
    }

    // Static --> makes a variable belong to the class
    //            also used to create utility methods 
    static int numberOfCars = 0;
    // accessed by ClassName.attribute instead of ObjectName.attribute because the variable belongs to the class
    // Utility Classes like Math also are static in nature as their methods and attributes can be direclty called by using ClassName.attribute or ClassName.methods
    // Eg --> Math.PI, Math.E, etc
}

public class oops {
    public static void main(String[] args) {

        // creating an object of the class 
        Car myCar = new Car("Aston Martin DB-7", "green"); // instanciation of the class

        System.out.println(myCar.name + " " + myCar.color + " " + myCar.price);

        // an array of objects can also be created
        Car[] cars = {
            new Car("Tata", "Black", 500000),
            new Car("Nano", "Blue", 150000),
            new Car("Merceded", "Yellow", 7000000)
        };
        
        for(Car car: cars) {
            System.out.printf("%s %s %.2f %d\n", car.name, car.color, car.price, Car.numberOfCars);
        }

    }
}
