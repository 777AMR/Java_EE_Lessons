package ee.cdi;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/diExample")
public class DependencyInjectionExample extends HttpServlet {
    @Inject
    Person person;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(person.getName());
    }
}

interface Person{
    String getName();
}

@Alternative
class Student implements Person{
    public String getName() {
        return "Student";
    }
}


class Worker implements Person{
    @Override
    public String getName() {
        return "worker";
    }
}