package codes;

class StorageBox<T> {
    private T item;

    public void storeItem(T item) {
        this.item = item;
        System.out.println("Item stored: " + item);
    }

    public T getItem() {
        return item;
    }
}

public class Main19 {
    public static void main(String[] args) {
        // Box for storing a String (like a book title)
        StorageBox<String> bookBox = new StorageBox<>();
        bookBox.storeItem("Java Programming");
        System.out.println("Retrieved: " + bookBox.getItem());

        // Box for storing an Integer (like a product ID)
        StorageBox<Integer> toolBox = new StorageBox<>();
        toolBox.storeItem(12345);
        System.out.println("Retrieved: " + toolBox.getItem());
    }
}
