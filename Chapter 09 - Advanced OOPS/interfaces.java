interface Prey {
    abstract void flee();
}

interface Predator {
    abstract void hunt();
}

class Rabbit implements Prey{
    
    @Override
    public void flee() {
        System.out.println("The rabbit runs away...");
    }
}

class Eagle implements Predator {

    @Override
    public void hunt() {
        System.out.println("The eagle hunts...");
    }
}

// Multiple Inheritance
//  A   B
//  \   /
//    C

class Fish implements Predator, Prey {

    @Override
    public void flee() {
        System.out.println("The Fish runs away from larger fishes...");
    }

    @Override
    public void hunt() {
        System.out.println("The Fish hunts smaller fishes...");
    }
}

public class interfaces {
    public static void main(String[] args) {
        // Interface ==> Interfaces are similar to abstract classes with one key difference
        //               Multiple inheritance like behaviour can be acheived with the help of interfaces

        Rabbit rabbit = new Rabbit();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();

        rabbit.flee();
        eagle.hunt();

        fish.flee();
        fish.hunt();
    }
}
