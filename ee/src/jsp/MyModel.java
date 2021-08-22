package jsp;

public class MyModel {
    public Student getStudent(){
        Student student = new Student();
        student.setName("Max");
        student.setAge(23);
        return student;
    }
}
