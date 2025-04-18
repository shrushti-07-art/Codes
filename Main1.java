package codes;
class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        myAnimal.makeSound();

        Cat1 myCat = new Cat1();
        myCat.makeSound();
    }
}

