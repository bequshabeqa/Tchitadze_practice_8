import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Reading {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            File file = new File("data.txt");
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
