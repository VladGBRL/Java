
public class Homework{
    public static void main(String[] args) {
        int x = 0;
        try {
            double result = divideTenBy(x);
            System.out.println("Rezultatul este: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0. Nu se poate calcula.");
        }
    }

    public static double divideTenBy(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Impartire prin 0. Nu se poate calcula.");
        }
        return 10.0 / x;
    }
}