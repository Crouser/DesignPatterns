import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("DSA");
        subjectList.add("OS");
        this.subjects = subjectList;
        return this;
    }
}
