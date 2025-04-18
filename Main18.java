package codes;

public class Main18 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int number = numbers[10]; // This will throw an ArrayIndexOutOfBoundsException
            System.out.println("The number at index 10 is: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please check the array index.");
        } finally {
            System.out.println("Finally block executed. Closing resources (if any).");
        }
    }
}
