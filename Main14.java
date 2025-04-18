package codes;
import java.io.FileWriter;
import java.io.IOException;

public class Main14 {
    public static void main(String[] args) {
        String data = "Hello, this is a sample text written to the file.";

        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
