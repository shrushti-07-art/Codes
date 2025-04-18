package codes;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Cat myCat = new Cat();
        myCat.makeSound();
    }
}


