import java.util.Scanner;

public class Array_Null {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ჩაწერე რიცხვი: ");
        String input = scanner.next();
        int[] array = {1, 2, 3, 4, 5};
        String str = null;


        try {
            System.out.println("Array is: " + array[4]);

            System.out.println("int length: " + str.length());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }catch (NullPointerException e) {
            System.out.println("String variable is null.");
        }

    }
}
