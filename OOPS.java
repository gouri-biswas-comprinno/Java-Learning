//Just a concept a blueprint , cannot be created actually
abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 Legs");
    }
}

public class OOPS {
    public static void main (String[] args) {
        Horse horse = new Horse();
        horse.walk();

        //Runtime error - kyuki wo abstract h
        Animal animal = new Animal();
        animal.walk();
    }
}