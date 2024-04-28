public class Director
{
    public StudentBuilder studentBuilder;


    public Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent()
    {
        if(studentBuilder instanceof MpcStudentBuilder){
            return studentBuilder.setRollNo(1).setName("Jawwad").setSubjects().build();
        }
        if(studentBuilder instanceof CommerceStudentBuilder){
            return studentBuilder.setRollNo(2).setName("Sajjad").setSubjects().build();
        }
        return null;
    }
}
