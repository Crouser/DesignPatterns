public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudents() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        }
        return null;
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setAge(20).setRollNo(30).setSubjects().build();
    }
}
