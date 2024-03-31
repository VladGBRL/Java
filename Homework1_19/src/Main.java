import java.util.*;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 75));
        students.add(new Student("David", 80));

        Collections.sort(students, Comparator.comparingInt(student -> student.grade));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
