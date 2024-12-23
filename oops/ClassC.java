package oops;

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        System.out.println("Roar");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

public class ClassC{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();

        Animal lion = new Lion();
        lion.sound();
    }
}