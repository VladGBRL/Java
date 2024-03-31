public class Student extends Persoana {
    private String studentId;

    public Student(String name, Adresa adresa, String studentId) {
        super(name, adresa);
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }

}
