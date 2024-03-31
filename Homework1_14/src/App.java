import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    int readNumber() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Value is not an integer. Please enter an integer:");
                in.next();
            }
        }
    }

    public static void main(String[] args) {
        App app1 = new App();
        Integer nr, sum;
        sum = 0;

        System.out.println("Enter the first number:");
        nr = app1.readNumber();
        sum += nr;

        System.out.println("Enter the second number:");
        nr = app1.readNumber();
        sum += nr;

        System.out.println("Suma:" + sum);
    }
}
