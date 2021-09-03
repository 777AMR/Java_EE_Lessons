package ee.cdi;

import javax.enterprise.inject.Produces;
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
    String s;
    @Inject
    @S2
    String s2;
    @Inject
    int i;
    @Inject
    double d;
    @Inject
    Car car;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(s + " " + i + " " + d + " " + car.name + " " + s2);
    }
}

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
@interface S2{}
class Producer {
    @Produces
    String s = "Hello world";
    @Produces
    @S2
    String s2 = "Second";
    @Produces
    int i = 5;
    @Produces
    double getDouble() {
        return 1 + 3.3 + 5.8;
    }
    @Produces
    Car getCar(){
        return new Car("Mitsubishi");
    }
}

class Car{
    String name;

    public Car(String name) {
        this.name = name;
    }
}