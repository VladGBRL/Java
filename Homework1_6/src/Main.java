import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Adresa teacherAdresa = new Adresa("123", "Craiova");
        Adresa student1Adresa = new Adresa("456", "Iasi");
        Adresa student2Adresa = new Adresa("223", "Bucuresti");

        Profesor profesor = new Profesor("Vlad", teacherAdresa, "Computer Science");
        System.out.println("Profesor: " + profesor.getName() + ", Adresa: " + profesor.getAddress() + ", Specializare: " + profesor.getSpecialization());

        Student student1 = new Student("Radu", student1Adresa, "S1");
        Student student2 = new Student("Roxi", student2Adresa, "S2");

        System.out.println("Student 1: " + student1.getName() + ", Adresa: " + student1.getAddress() + ", Student ID: " + student1.getStudentId());
        System.out.println("Student 2: " + student2.getName() + ", Adresa: " + student2.getAddress() + ", Student ID: " + student2.getStudentId());

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        Curs curs = new Curs("Java Programming", profesor, students);

        curs.addStudentToCourse(student1);
        curs.addStudentToCourse(student2);

        System.out.println("Numele cursului: " + curs.getName());
        System.out.println("Profesor: " + curs.getTeacher().getName());
        System.out.println("Studenti inscrisi: ");
        for (Student student : curs.getStudents()) {
            System.out.println(" - " + student.getName());
        }

        Adresa newStudentAdresa = new Adresa("789", "Bucuresti");
        Student newStudent = new Student("Gicu", newStudentAdresa, "S3");
        curs.addStudentToCourse(newStudent);
        System.out.println("Student nou adaugat: " + newStudent.getName());

        curs.removeStudentFromCourse(student2);
        System.out.println("Student sters: " + student2.getName());

        Adresa newTeacherAdresa = new Adresa("456", "Timisioara");
        Profesor newTeacher = new Profesor("Cristi", newTeacherAdresa, "Mathematics");
        curs.addTeacherToCourse(newTeacher);
        System.out.println("Profesor nou adaugat: " + newTeacher.getName());

        curs.removeTeacherFromCourse();
        System.out.println("Profesor sters.");

        System.out.println("Lista studenti noua: ");
        for (Student student : curs.getStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}
