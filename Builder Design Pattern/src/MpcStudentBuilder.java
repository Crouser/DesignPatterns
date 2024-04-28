import java.util.ArrayList;
import java.util.List;

public class MpcStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> ss= new ArrayList<>();

        ss.add("Maths");
        ss.add("Physics");
        ss.add("Chemistry");
        this.subjects=ss;


        return this;
    }
}
