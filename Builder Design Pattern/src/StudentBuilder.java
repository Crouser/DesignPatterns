import java.util.List;

public abstract  class StudentBuilder
{
    public int rollNo;
    public String name;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }
    public StudentBuilder setName(String  name) {
        this.name = name;
        return this;
    }
    public abstract StudentBuilder setSubjects();


    public Student build(){
        return  new Student(this);
    }
}

