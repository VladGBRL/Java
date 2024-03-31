import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static int sumOfIntegersFromFile(String filename) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                } catch (NumberFormatException e) {
                    // Ignoram toate numerele care nu sunt intregi
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        return sum;
    }

    public static void main(String[] args) {
        String filename = "src/input.txt";
        int sum = sumOfIntegersFromFile(filename);
        System.out.println("Sum of integers in the file: " + sum);
    }
}
