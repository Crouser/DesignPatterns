import java.util.List;

public abstract class StudentBuilder {

    int rollNo;
    int age;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
