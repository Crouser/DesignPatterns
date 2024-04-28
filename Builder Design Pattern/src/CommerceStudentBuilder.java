import java.util.ArrayList;
import java.util.List;

public  class CommerceStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {

        List<String> ss= new ArrayList<>();

        ss.add("Political Science");
        ss.add("Political Science");

        this.subjects=ss;

        return this;
    }
}
