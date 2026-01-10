// Question 1
abstract class Pen  {
    abstract void write();

    abstract void refill();
}

// Question 2
class FountainPen extends Pen {
    
    @Override
    void write() {
        System.out.println("The Fountain Pen Writes...");
    }

    @Override
    void refill() {
        System.out.println("Fountain Pen successfully refilled...");
    }

    void changeNib() {
        System.out.println("Nib changed...");
    }
}

// Question 3
interface BasicAnimal {
    abstract void eat();

    abstract void sleep();
}

class Monkey {
    void jump() {
        System.out.println("The Monkey jumps...");
    }
    void bite() {
        System.out.println("The Monkey bites...");
    }
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Humans Eat...");
    }

    @Override
    public void sleep() {
        System.out.println("Humans sleep 8 hours a day");
    }

    @Override
    public void jump() {
        System.out.println("The Human jumps...");
    }

    @Override
    public void  bite() {
        System.out.println("Humans can also bite...");
    }
}