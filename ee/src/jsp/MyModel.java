package jsp;

public class MyModel {
    public Student getStudent(){
        Student student = new Student("", 0);
        student.setName("Max");
        student.setAge(23);
        return student;
    }
}
