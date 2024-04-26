//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Director dir1 = new Director(new EngineeringStudentBuilder());
     Student student = dir1.createStudents();
     System.out.println(student.subjects.get(0) + " " + student.subjects.get(1) + " " + student.rollNo);
    }
}