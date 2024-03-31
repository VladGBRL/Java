
class EcuationException extends Exception {
    public EcuationException(String message) {
        super(message);
    }
}

class EquationSolver {
    private double a;
    private double b;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double solve() throws EcuationException {
        if (a == 0) {
            if (b == 0) {
                throw new EcuationException("Infinitate de soluții");
            } else {
                throw new EcuationException("Nu există soluție");
            }
        } else {
            return -b / a;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {

            EquationSolver solver1 = new EquationSolver(2, -4);
            System.out.println("Soluția ecuației 2x - 4 = 0 este: " + solver1.solve());

            EquationSolver solver2 = new EquationSolver(0, 1);
            System.out.println("Soluția ecuației 0x + 1 = 0 este: " + solver2.solve());

        } catch (EcuationException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
