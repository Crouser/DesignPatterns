import java.util.List;

public class Student {

    int rollNo;
    int age;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.age = builder.age;
        this.rollNo = builder.rollNo;
        this.subjects = builder.subjects;
    }
}
