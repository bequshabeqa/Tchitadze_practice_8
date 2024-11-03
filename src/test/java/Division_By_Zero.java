import java.util.Scanner;

public class Division_By_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ჩაწერე პირველი რიცხვი: ");
        int number1 = scanner.nextInt();

        System.out.println("ჩაწერე მეორე რიცხვი: ");
        int number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println("შედეგი: " + number1 + "გაყოფილი " + number2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("0-ზე გაყოფა არ შეიძლება! ");
        } finally {
            System.out.println("დასასრული ");
        }
    }
}
