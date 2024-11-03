import java.util.InputMismatchException;
import java.util.Scanner;

public class User_Input_Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("ჩაწერე რიცხვი: ");
            int userInput = scanner.nextInt();
            System.out.println("შენი რიცხვია: " + userInput);

        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }finally {
            scanner.close();
        }
    }
}
