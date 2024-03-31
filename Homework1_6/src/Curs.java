import java.util.ArrayList;
import java.util.List;
public class Curs {
    private String name;
    private Profesor teacher;
    private List<Student> students;

    public Curs(String name, Profesor teacher, List<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudentToCourse(Student student) {
        students.add(student);
    }

    public void removeStudentFromCourse(Student student) {
        students.remove(student);
    }

    public void addTeacherToCourse(Profesor profesor) {
        this.teacher = profesor;
    }

    public void removeTeacherFromCourse() {
        this.teacher = null;
    }

    public void changeTeacherAddress(Adresa newAdresa) {
        if (teacher != null) {
            teacher.setAddress(newAdresa);
        }
    }

    public void changeStudentAddress(Student student, Adresa newAdresa) {

        student.setAddress(newAdresa);
    }

    public static Curs createNewCourse(String courseName, Profesor teacher, List<Student> students) {
        Curs newCurs = new Curs(courseName, teacher, students);
        newCurs.students.addAll(students);
        return newCurs;
    }
    public String getName() {
        return name;
    }

    public Profesor getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}
