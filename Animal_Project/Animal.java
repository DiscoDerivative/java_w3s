package Animal_Project;

/*
 * The class Animal is an abstract class that represents the animal should only
 * need to make a sound.
 */
abstract public class Animal {
    abstract public void animalSound();
}

// Class Cat prints meow.
class Cat extends Animal {
    public void animalSound() {
        System.out.println("meow");
    }
}

// Class Dog prints ruff.
class Dog extends Animal {
    public void animalSound() {
        System.out.println("ruff");
    }
}
