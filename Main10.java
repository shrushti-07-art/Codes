package codes;

abstract class ElectronicDevice {
    String brand;

    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    abstract void turnOn();
    abstract void turnOff();
}

class TV extends ElectronicDevice {
    public TV(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " TV is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println(brand + " TV is now OFF.");
    }
}

class Radio extends ElectronicDevice {
    public Radio(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Radio is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println(brand + " Radio is now OFF.");
    }
}

public class Main10 {
    public static void main(String[] args) {
        ElectronicDevice tv = new TV("Samsung");
        tv.turnOn();
        tv.turnOff();

        ElectronicDevice radio = new Radio("Sony");
        radio.turnOn();
        radio.turnOff();
    }
}

