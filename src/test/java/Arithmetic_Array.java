import java.util.Scanner;

public class Arithmetic_Array {
    public static void main(String[] args) {
        String[] array = {"beqa", "gio", "dato"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index to access the array: ");
        int index = scanner.nextInt();

        System.out.println("ჩაწერე პირველი რიცხვი: ");
        int number1 = scanner.nextInt();

        System.out.println("ჩაწერე მეორე რიცხვი: ");
        int number2 = scanner.nextInt();

        try {
            System.out.println("Array is: " + array[index]);

            int result = number1/number2;
            System.out.println("შედეგი: " + result);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }finally {
            scanner.close();
        }
    }
}
