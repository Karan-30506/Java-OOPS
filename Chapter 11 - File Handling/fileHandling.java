import java.io.IOException;
import java.nio.file.*;

public class fileHandling {
    public static void main(String[] args) {
        // Read Files
        try {
            String fileData = Files.readString(Path.of("./data.txt"));
            System.out.printf("File Data: %s\n", fileData);
        }
        catch (IOException e) {
            System.out.println("File Error");
        }

        // Write Files
        try {
            String fileData = "This is a temporary testing file created using JAVA.\n";
            Files.writeString(Path.of("./temp.txt"), fileData);
        }
        catch (IOException e) {
            System.out.println("File Error");
        }

        // Append Files
        try {
            String fileData = "This line was appended using JAVA.\n";
            Files.writeString(Path.of("./temp.txt"), fileData, StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
