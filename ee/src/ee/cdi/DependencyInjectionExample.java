package ee.cdi;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@WebServlet("/diExample")
public class DependencyInjectionExample extends HttpServlet {
    @Inject
    @StudentAnnotation
    Person person;

    @Inject
    @WorkerAnnotation
    Person worker;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(person.getName());
        System.out.println(worker.getName());
    }
}

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
@interface StudentAnnotation{}

interface Person{
    String getName();
}

@StudentAnnotation
class Student implements Person{
    private String name;

    public String getName() {
        name = "Student";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
@interface WorkerAnnotation{}

@WorkerAnnotation
class Worker implements Person{
    @Override
    public String getName() {
        return "worker";
    }
}