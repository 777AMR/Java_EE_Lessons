package ee.cdi;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/diExample")
public class DependencyInjectionExample extends HttpServlet {
//    @Inject
    Student student;

    @Inject
    public DependencyInjectionExample(Student student) {
        this.student = student;
    }

//    @Inject
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(student.getName());
    }
}

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}