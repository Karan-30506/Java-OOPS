class Car{
    // getters and setters help to protect object data and add rules for accessing or modifying attributes
    // getters --> methods that make a field readable
    // setters --> methods that make a field writable

    // for this we use private access modifier to make the attribute non accessible to the user
    private String model;
    private String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

public class getters_and_setters {
    public static void main(String[] args) {
        Car car = new Car("Aston Martin", "Green");

        // no access to car.model
        // for this we use getters
        System.out.println("Model: " + car.getModel());

        // to change the color of the car we cant do car.color = "Blue" as it is private 
        // for this we use setters
        car.setColor("Blue");
        System.out.println(car.getColor());
    }
}
