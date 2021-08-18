package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LiveServlet")
public class ServletLiveCycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("initialization");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("loading");
        String s = "<html>" +
                "<header><title>This is title</title></header>" +
                "<body>" +
                "Hello world" +
                "</body>" +
                "</html>";
        resp.getWriter().write(s);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("loading");
        super.doPost(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
        super.destroy();
    }
}
