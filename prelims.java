// Dexter G. Inguito
// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    public void quarrel() {
        System.out.println("The cat is quarreling.");
    }
}

public class prelims {
    public static void main(String[] args) {
        // Create an Animal object
        Animal animal = new Animal();
        animal.makeSound(); 

        // Create a Cat object
        Cat cat = new Cat();
        cat.makeSound(); 
        cat.quarrel();   

        Animal catAsAnimal = new Cat();
        catAsAnimal.makeSound();
    }
}
