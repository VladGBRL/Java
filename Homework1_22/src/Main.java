import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduceți primul număr:");
            Integer num1 = readInteger(scanner);

            System.out.println("Introduceți al doilea număr:");
            Integer num2 = readInteger(scanner);

            int sum = num1 + num2;
            System.out.println("Suma celor două numere este: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Introduceți un număr intreg.");
        } catch (NullPointerException e) {
            System.out.println("Una dintre valorile introduse este NULL.");
        }
    }

    private static Integer readInteger(Scanner scanner) {
        Integer num = null;
        while (num == null) {
            try {
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Introduceți un număr intreg.");
            }
        }
        return num;
    }
}
