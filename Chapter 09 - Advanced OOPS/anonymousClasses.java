class Car {
    void start() {
        System.out.println("The car has started");
    }

    void drive() {
        System.out.println("The car is driving...");
    }
}

public class anonymousClasses {
    public static void main(String[] args) {
        
        // Anonymous Classes ==> They allow us to add a custom behaviour to a pre-existing class
        //                       withou having to create a new class.
        //                       They are often used for one time uses only
        //                       Example --> TimeTasks, Runnable, Callbacks

        // Suppose there are numerous cars from the Car class out of which only one of them is a Flying car
        // We dont want to crete an entirely different class of flying cars for just one object so we use Anonymous classes

        // the data type is anonymous now because we are using (var) and the compiler will auto detect it.
        var flyingCar = new Car() {
            // custom behaviour inside the {}

            void land() {
                System.out.println("The Flying car has landed");
            }
            
            @Override
            void drive() {
                System.out.println("The car is Flying...");
            }
        };

        flyingCar.drive();
        flyingCar.land();
    }
}
