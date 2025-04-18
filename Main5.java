package codes;

class Animal2 {
    public void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal2 {
    @Override
    public void move() {
        System.out.println("Cheetah is running");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Animal2 myAnimal = new Animal2();
        myAnimal.move();  // Outputs: Animal is moving

        Cheetah myCheetah = new Cheetah();
        myCheetah.move();  // Outputs: Cheetah is running
    }
}
