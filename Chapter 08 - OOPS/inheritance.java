class Animal {
    boolean isAlive;

    Animal(boolean isAlive) {
        this.isAlive = isAlive;
    }

    void move() {
        System.out.println("The animal runs");
    }
}

// we derive dog class from animal 
class Dog extends Animal {
    // super is a keyword which runs the constructor of the parent class
    int lives;

    Dog(boolean isAlive, int lives) {
        super(isAlive);
        this.lives = lives;
    }

    @Override
    void move() { // move method in parent got overridden
        System.out.println("Dog runs");
    }

    // the .toString() method can also be overridden using method overriding
    // .toString() --> method inherited from Object Class
    //                 Used to return a string representation of the Object
    //                 By default it returns a hash code as a unique identifier
    //                 it can be overridden to provide meaningful details of the current object

    @Override
    public String toString() {
        return "The dog has " + this.lives + " number of live/lives";
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(true, 1);
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.move();

        System.out.println(dog);
    }
}
