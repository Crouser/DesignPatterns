import javax.swing.*;
import java.util.List;

public class Student
{

    public int rollno;
    public String name;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder)
    {
        this.rollno=studentBuilder.rollNo;
        this.name=studentBuilder.name;
        this.subjects=studentBuilder.subjects;

    }

    public void showDetails(){

        System.out.println(rollno+" \n"+name+"\n"+subjects+" ");
    }
}
