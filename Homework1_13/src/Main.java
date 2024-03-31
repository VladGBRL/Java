import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            double result = calculateFromFile("input.txt");
            System.out.println("Valoarea calculată este: " + result);
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Date invalide în fișier: " + e.getMessage());
        }
    }

    public static double calculateFromFile(String filename) throws IOException {
        double defaultValue = 1.0;
        double x = defaultValue;

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            if (line != null && !line.isEmpty()) {
                x = Double.parseDouble(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return 2 * x;
    }
}
