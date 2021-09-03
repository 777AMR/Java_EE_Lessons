package ee.cdi;

import javax.enterprise.context.*;
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
    MyBean bean;
    @Inject
    ChangeMyBean changeMyBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bean.i = 5;
        changeMyBean.changeI();
        resp.getWriter().write(bean.i + "");
        resp.getWriter().write(" " + changeMyBean.myBean.i);
    }
}

//CDI
//@ApplicationScoped
//@SessionScoped
//@RequestScoped
//@ConversationScoped
@Dependent
class MyBean {
    int i;
}

class ChangeMyBean {
    @Inject
    MyBean myBean;

    public void changeI() {
        myBean.i = 2;
    }
}