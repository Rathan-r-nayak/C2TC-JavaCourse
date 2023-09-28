package MethodOverriding;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();    // Output: Dog barks
    }
}