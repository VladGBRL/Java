import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);
        Collections.sort(numbers);
        System.out.println("Lista ordonată de numere întregi:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
